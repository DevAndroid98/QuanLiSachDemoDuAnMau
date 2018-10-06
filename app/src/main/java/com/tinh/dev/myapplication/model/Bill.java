package com.tinh.dev.myapplication.model;

import java.util.Date;

public class Bill {

  private String MaHoaDon;
  private long NgayMua;

  public String getMaHoaDon() {
    return MaHoaDon;
  }

  public void setMaHoaDon(String maHoaDon) {
    MaHoaDon = maHoaDon;
  }

  public long getNgayMua() {
    return NgayMua;
  }

  public void setNgayMua(long ngayMua) {
    NgayMua = ngayMua;
  }

  public Bill(String maHoaDon, long ngayMua) {

    MaHoaDon = maHoaDon;
    NgayMua = ngayMua;
  }
}
