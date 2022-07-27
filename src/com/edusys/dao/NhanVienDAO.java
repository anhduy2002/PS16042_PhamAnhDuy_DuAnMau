/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.DAO;

import com.edusys.dao.EdusysDAO;
import com.edusys.helper.XJdbc;
import com.edusys.entity.EntityNhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class NhanVienDAO extends EdusysDAO<EntityNhanVien, String> {

    String INSERT_SQL = "INSERT INTO NhanVien (HoTen, MaNV, MatKhau, VaiTro) VALUES (?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE nhanvien SET Matkhau=?, Hoten=?, Vaitro=? WHERE Manv=?";
    String DELETE_SQL = "DELETE from NhanVien where MaNV = ?";
    String SELECT_ALL_SQL = "SELECT * from NhanVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNV = ? ";

    @Override
    public void insert(EntityNhanVien entity) {
        XJdbc.update(INSERT_SQL, entity.getHoTen(), entity.getMaNV(), entity.getMatKhau(), entity.getVaiTro());
    }

    @Override
    public void update(EntityNhanVien entity) {
        XJdbc.update(UPDATE_SQL, entity.getMatKhau(), entity.getHoTen() , entity.getVaiTro(), entity.getMaNV());
    }
    
    @Override
    public void delete(String id) {
        XJdbc.update(DELETE_SQL, id);
    }
    
    @Override
    public List<EntityNhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public EntityNhanVien selectById(String id) {
        List<EntityNhanVien> ds = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (ds.isEmpty()) {
            return null;
        }
        return ds.get(0);
    }

    @Override
    protected List<EntityNhanVien> selectBySql(String sql, Object... args) {
        
        ArrayList<EntityNhanVien> ds = new ArrayList<>();
        try {
            
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                EntityNhanVien entity = new EntityNhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                ds.add(entity);
            }
            rs.getStatement().getConnection().close();
            return ds;
        } catch (Exception e) {
            System.out.println( e.toString());
            throw new RuntimeException(e);
        }
    }

   

}
