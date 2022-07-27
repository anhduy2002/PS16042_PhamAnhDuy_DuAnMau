/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.EntityChuyenDe;
import com.edusys.helper.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public class ChuyenDeDAO extends EdusysDAO<EntityChuyenDe, String> {
     String INSERT_SQL ="INSERT INTO ChuyenDe (MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa) VALUES (?, ?, ?, ?, ?, ?)";
     String UPDATE_SQL ="UPDATE ChuyenDe SET TenCD=?, HocPhi=?, ThoiLuong=?, Hinh=?, MoTa=? WHERE MaCD=?";
     String DELETE_SQL ="DELETE FROM ChuyenDe WHERE MaCD=?";
     String SELECT_ALL_SQL ="SELECT * FROM ChuyenDe";
     String SELECT_BY_ID_SQL ="SELECT * FROM ChuyenDe WHERE MaCD=?";
    
    @Override
    public void insert(EntityChuyenDe entity) {
     XJdbc.update(INSERT_SQL, entity.getMaCD(), entity.getTenCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getHinh(),entity.getMoTa());
    }

    @Override
    public void update(EntityChuyenDe entity) {
       XJdbc.update(UPDATE_SQL, entity.getTenCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getHinh(), entity.getMoTa(),entity.getMaCD());
    }

    @Override
    public void delete(String MaCD) {
        XJdbc.update(DELETE_SQL, MaCD);
    }

    @Override
    public List<EntityChuyenDe> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public EntityChuyenDe selectById(String macd) {
        List<EntityChuyenDe> list = selectBySql(SELECT_BY_ID_SQL, macd);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<EntityChuyenDe> selectBySql(String sql, Object... args) {
        List<EntityChuyenDe> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    EntityChuyenDe entity=new EntityChuyenDe();
                    entity.setMaCD(rs.getString("MaCD"));
                    entity.setHinh(rs.getString("Hinh"));
                    entity.setHocPhi(rs.getDouble("HocPhi"));
                    entity.setMoTa(rs.getString("MoTa"));
                    entity.setTenCD(rs.getString("TenCD"));
                    entity.setThoiLuong(rs.getInt("ThoiLuong"));
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
    }
