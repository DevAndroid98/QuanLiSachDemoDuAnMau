package com.tinh.dev.myapplication;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Window;
import android.widget.Toast;

import com.tinh.dev.myapplication.adapter.Node_SBC;
import com.tinh.dev.myapplication.database.SqliteOpenHelper;
import com.tinh.dev.myapplication.model.Book;
import com.tinh.dev.myapplication.model.Booksale;

import java.util.ArrayList;

public class BookSaleActivity extends AppCompatActivity implements Constant {
    private RecyclerView recyclerview_SBC;
    private LinearLayoutManager linearLayoutManager;
    Node_SBC node_loaiSach;
    private ArrayList<Booksale> arrayList;
    private SqliteOpenHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booksale);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        AnhXa();
        AddRecyclerview();
    }
    void AnhXa(){
        helper=new SqliteOpenHelper(this);
        arrayList=new ArrayList<>();
        node_loaiSach=new Node_SBC(this,arrayList);
        recyclerview_SBC =findViewById(R.id.recyclerview_SBC);
        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        arrayList.clear();

        String sSQL = "SELECT MaSach, SUM(soLuong) as 'soluong'"+
                "" + " FROM " + TABLE_HOADONCHITIET +
                "" + " INNER JOIN " + TABLE_BILL + " ON " + " HoaDon.MaHoaDon = HoaDonChiTiet.MaHoaDon " +
                "" + " WHERE strftime(\"%m\", HoaDon.NgayMua / 1000, 'unixepoch') = strftime(\"%m\") " +
                "" + " GROUP BY HoaDonChiTiet.MaSach " +
                "" + " ORDER BY SoLuong DESC " +
                "" + " LIMIT 10 ";

        Cursor cursor=helper.getData(sSQL);

        if (cursor!=null && cursor.getCount()>0){
            cursor.moveToFirst();
            do {
               Booksale booksale=new Booksale(cursor.getString(0),cursor.getInt(1));
                       arrayList.add(booksale);
               }while (cursor.moveToNext());
                node_loaiSach.notifyDataSetChanged();
        }








    }

    void AddRecyclerview(){
        recyclerview_SBC.setLayoutManager(linearLayoutManager);
        recyclerview_SBC.setHasFixedSize(true);
        recyclerview_SBC.setAdapter(node_loaiSach);
    }



}
