package com.tinh.dev.myapplication.model;

public class Booksale {

    private String MaSach;
    private int SL;


    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String maSach) {
        MaSach = maSach;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }





    public Booksale(String maSach, int SL) {

        MaSach = maSach;
        this.SL = SL;

    }
}
