/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;


import com.edusys.entity.EntityKhoaHoc;
import com.edusys.helper.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public class KhoaHocDAO extends EdusysDAO<EntityKhoaHoc, Integer> {
    String INSERT_SQL = "INSERT INTO KhoaHoc (MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV) VALUES (?, ?, ?, ?, ?, ?) ";
    String UPDATE_SQL = "UPDATE KhoaHoc SET MaCD=?, HocPhi=?, ThoiLuong=?, NgayKG=?, GhiChu=?, MaNV=?, NgayTao=? WHERE MaKH=? ";
    String DELETE_SQL = "DELETE FROM KhoaHoc WHERE MaKH=? ";
    String SELECT_ALL_SQL = "SELECT * FROM KhoaHoc  ";
    String SELECT_BYID_SQL = "SELECT * FROM KhoaHoc WHERE MaKH=? ";
    @Override
    public void insert(EntityKhoaHoc entity) {
        XJdbc.update(INSERT_SQL, entity.getMaCD(), entity.getHocPhi(), entity.getThoiLuong(),entity.getNgayKG(), entity.getGhiChu(), entity.getMaNV());
    }

    @Override
    public void update(EntityKhoaHoc entity) {
        XJdbc.update(UPDATE_SQL, entity.getMaCD(), entity.getHocPhi(), entity.getThoiLuong(),entity.getNgayKG(), entity.getGhiChu(), entity.getMaNV(), entity.getMaKH());
    }

   
    public void delete(Integer MaKH) {
        XJdbc.update(DELETE_SQL, MaKH);
    }

    @Override
    public List<EntityKhoaHoc> selectAll() {
       return this.selectBySql(SELECT_ALL_SQL);
    }

   
    public EntityKhoaHoc selectById(Integer MaKH) {
    List<EntityKhoaHoc> list = selectBySql(SELECT_BYID_SQL, MaKH);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<EntityKhoaHoc> selectBySql(String sql, Object... args) {
          List<EntityKhoaHoc> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    EntityKhoaHoc entity=new EntityKhoaHoc();
                    entity.setMaKH(rs.getInt("MaKH"));
                    entity.setHocPhi(rs.getDouble("HocPhi"));
                    entity.setThoiLuong(rs.getInt("ThoiLuong"));
                    entity.setNgayKG(rs.getDate("NgayKG"));
                    entity.setGhiChu(rs.getString("GhiChu"));
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setNgayTao(rs.getDate("NgayTao"));
                    entity.setMaCD(rs.getString("MaCD"));
                    list.add(entity);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
    public List<EntityKhoaHoc>selectByChuyenDe(String macd){
        String sql = "SELECT * FROM KhoaHoc WHERE MaCD=?";
        return this.selectBySql(sql,macd);
    }
    public List<Integer> selectYears() {
        String sql="SELECT DISTINCT year(NgayKG) Year FROM KhoaHoc ORDER BY Year DESC";
        List<Integer> list=new ArrayList<>();
        try {
           ResultSet rs = XJdbc.query(sql);
           while(rs.next()){
                 list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}