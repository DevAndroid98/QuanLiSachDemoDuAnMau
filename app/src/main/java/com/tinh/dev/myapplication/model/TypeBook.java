package com.tinh.dev.myapplication.model;

public class TypeBook {
    public String MaTheLoai;
    public String Tentheloai;
    public String Mota;
    public String Vitri;

    public TypeBook(String maTheLoai, String tentheloai, String mota, String vitri) {
        MaTheLoai = maTheLoai;
        Tentheloai = tentheloai;
        Mota = mota;
        Vitri = vitri;
    }

    public TypeBook() {
    }

    public String getMaTheLoai() {
        return MaTheLoai;
    }

    public void setMaTheLoai(String maTheLoai) {
        MaTheLoai = maTheLoai;
    }

    public String getTentheloai() {
        return Tentheloai;
    }

    public void setTentheloai(String tentheloai) {
        Tentheloai = tentheloai;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public String getVitri() {
        return Vitri;
    }

    public void setVitri(String vitri) {
        Vitri = vitri;
    }
}
