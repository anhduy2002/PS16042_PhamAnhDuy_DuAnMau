/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.entity;

/**
 *
 * @author Windows 10
 */
public class EntityNhanVien {
    String MaNV;
    String MatKhau;
    String HoTen;
    Boolean VaiTro = false;

    public EntityNhanVien() {
        this.MaNV = MaNV;
        this.MatKhau = MatKhau;
        this.HoTen = HoTen;
    }
    public void EntityNhanVien(){
        
    }

    public EntityNhanVien(String MaNV, String MatKhau, String HoTen, Boolean VaiTro) {
        this.MaNV = MaNV;
        this.MatKhau = MatKhau;
        this.HoTen = HoTen;
        this.VaiTro = VaiTro;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public Boolean getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(Boolean VaiTro) {
        this.VaiTro = VaiTro;
    }
    @Override
    public String toString() {
        return this.HoTen;
    }
    
}
