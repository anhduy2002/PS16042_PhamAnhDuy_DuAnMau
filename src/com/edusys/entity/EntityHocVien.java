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
public class EntityHocVien {
    private int MaHocVien;
    private int MaKhoaHoc;
    private String MaNguoiHoc;
    private double Diem;

    public void EntityHocVien(){
        
    }

    public EntityHocVien() {
        this.MaHocVien = MaHocVien;
        this.MaKhoaHoc = MaKhoaHoc;
        this.MaNguoiHoc = MaNguoiHoc;
        this.Diem = Diem;
    }

    public EntityHocVien(int MaHocVien, int MaKhoaHoc, String MaNguoiHoc, Double Diem) {
        this.MaHocVien = MaHocVien;
        this.MaKhoaHoc = MaKhoaHoc;
        this.MaNguoiHoc = MaNguoiHoc;
        this.Diem = Diem;
    }

    public int getMaHocVien() {
        return MaHocVien;
    }

    public void setMaHocVien(int MaHocVien) {
        this.MaHocVien = MaHocVien;
    }

    public int getMaKhoaHoc() {
        return MaKhoaHoc;
    }

    public void setMaKhoaHoc(int MaKhoaHoc) {
        this.MaKhoaHoc = MaKhoaHoc;
    }

    public String getMaNguoiHoc() {
        return MaNguoiHoc;
    }

    public void setMaNguoiHoc(String MaNguoiHoc) {
        this.MaNguoiHoc = MaNguoiHoc;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double Diem) {
        this.Diem = Diem;
    }
    
    @Override
    public String toString() {
        return this.toString();
    }
}
