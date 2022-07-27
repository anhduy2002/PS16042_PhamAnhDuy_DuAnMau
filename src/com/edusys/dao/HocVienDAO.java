/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.EntityHocVien;
import com.edusys.helper.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public class HocVienDAO extends EdusysDAO<EntityHocVien, Integer> {
    String INSERT_SQL = "INSERT INTO HocVien(MaKH, MaNH, Diem) VALUES(?, ?, ?) ";
    String UPDATE_SQL = "UPDATE HocVien SET MaKH=?, MaNH=?, Diem=? WHERE MaHV=? ";
    String DELETE_SQL = "DELETE FROM HocVien WHERE MaHV=? ";
    String SELECT_ALL_SQL = "SELECT * FROM HocVien ";
    String SELECT_BYID_SQL = "SELECT * FROM HocVien WHERE MaHV=? ";

    @Override
    public void insert(EntityHocVien entity) {
        XJdbc.update(INSERT_SQL, entity.getMaKhoaHoc(), entity.getMaNguoiHoc(), entity.getDiem());
    }

    @Override
    public void update(EntityHocVien entity) {
        XJdbc.update(UPDATE_SQL, entity.getMaKhoaHoc(), entity.getMaNguoiHoc(), entity.getDiem(), entity.getMaHocVien());
    }

    public void delete(Integer MaHV) {
        XJdbc.update(DELETE_SQL, MaHV);
    }

    @Override
    public List<EntityHocVien> selectAll() {
       return this.selectBySql(SELECT_ALL_SQL);
    }

    
    public EntityHocVien selectById(Integer MaHV) {
        List<EntityHocVien> list = this.selectBySql(SELECT_BYID_SQL, MaHV);
        return list.size() > 0 ? 
                list.get(0) : null;
    }

    @Override
    protected List<EntityHocVien> selectBySql(String sql, Object... args) {
        List<EntityHocVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    EntityHocVien entity=new EntityHocVien();
                    entity.setMaHocVien(rs.getInt("MaHV"));
                    entity.setMaKhoaHoc(rs.getInt("MaKH"));
                    entity.setMaNguoiHoc(rs.getString("MaNH"));
                    entity.setDiem(rs.getDouble("Diem"));
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
   public List<EntityHocVien> selectByKhoaHoc(int MaKH) {
        String sql="SELECT * FROM HocVien WHERE MaKH=?";
        return this.selectBySql(sql, MaKH);
    }
 
}
