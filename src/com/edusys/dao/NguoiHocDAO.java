/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;


import com.edusys.entity.EntityNguoiHoc;
import com.edusys.helper.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public class NguoiHocDAO extends EdusysDAO<EntityNguoiHoc, String> {
    String INSERT_SQL = "INSERT INTO NguoiHoc (MaNH, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNV) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE NguoiHoc SET HoTen=?, NgaySinh=?, GioiTinh=?, DienThoai=?, Email=?, GhiChu=?, MaNV=? WHERE MaNH=? ";
    String DELETE_SQL = "DELETE FROM NguoiHoc WHERE MaNH=? ";
    String SELECT_ALL_SQL = "SELECT * FROM NguoiHoc ";
    String SELECT_BYID_SQL = "SELECT * FROM NguoiHoc WHERE MaNH=? ";

    @Override
    public void insert(EntityNguoiHoc entity) {
        XJdbc.update(INSERT_SQL, entity.getMaNH(), entity.getHoTen(), entity.getNgaySinh(), entity.isGioiTinh(),entity.getDienThoai(), entity.getEmail(), entity.getGhiChu(), entity.getMaNV());
    }

    @Override
    public void update(EntityNguoiHoc entity) {
        XJdbc.update(UPDATE_SQL, entity.getHoTen(), entity.getNgaySinh(), entity.isGioiTinh(),entity.getDienThoai(), entity.getEmail(), entity.getGhiChu(), entity.getMaNV(), entity.getMaNH());
    }

    @Override
    public void delete(String MaNH) {
        XJdbc.update(DELETE_SQL, MaNH);
    }

    @Override
    public List<EntityNguoiHoc> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public EntityNguoiHoc selectById(String MaNH) {
        List<EntityNguoiHoc> list = this.selectBySql(SELECT_BYID_SQL, MaNH);
        return list.size() > 0 ? 
                list.get(0) : null;
    }
    
    public List<EntityNguoiHoc> selectNotInCourse(int makh, String keyword) {
        String sql="SELECT * FROM NguoiHoc "
                + " WHERE HoTen LIKE ? AND "
                + " MaNH NOT IN (SELECT MaNH FROM HocVien WHERE MaKH=?)";
        return this.selectBySql(sql, "%"+keyword+"%", makh);
    }
    @Override
    protected List<EntityNguoiHoc> selectBySql(String sql, Object... args) {
       List<EntityNguoiHoc> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    EntityNguoiHoc entity=new EntityNguoiHoc();
                    entity.setMaNH(rs.getString("MaNH"));
                    entity.setHoTen(rs.getString("HoTen"));
                    entity.setNgaySinh(rs.getDate("NgaySinh"));
                    entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                    entity.setDienThoai(rs.getString("DienThoai"));
                    entity.setEmail(rs.getString("Email"));
                    entity.setGhiChu(rs.getString("GhiChu"));
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setNgayDK(rs.getDate("NgayDK"));
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

    public List<EntityNguoiHoc> selectByKeyword(String keyword){
        String sql = "SELECT * FROM NguoiHoc WHERE HoTen LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
}
