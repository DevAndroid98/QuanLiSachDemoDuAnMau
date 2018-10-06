package com.tinh.dev.myapplication.model;

public class Book {

    private String MaSach;
    private String MaTheLoai;
    private String TacGia;
    private String NXB;
    private float giaBia;
    private int soLuong;


    public Book() {
    }

    public Book(String maSach, String maTheLoai, String tacGia, String NXB, Float giaBia, int soLuong) {
        MaSach = maSach;
        MaTheLoai = maTheLoai;
        TacGia = tacGia;
        this.NXB = NXB;
        this.giaBia = giaBia;
        this.soLuong = soLuong;
    }



    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String maSach) {
        MaSach = maSach;
    }

    public String getMaTheLoai() {
        return MaTheLoai;
    }

    public void setMaTheLoai(String maTheLoai) {
        MaTheLoai = maTheLoai;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia) {
        TacGia = tacGia;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public Float getGiaBia() {
        return giaBia;
    }

    public void setGiaBia(Float giaBia) {
        this.giaBia = giaBia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
