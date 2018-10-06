package com.tinh.dev.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tinh.dev.myapplication.adapter.Node_SBC;
import com.tinh.dev.myapplication.model.Booksale;

import java.util.ArrayList;

public class BookSale extends AppCompatActivity {
    private RecyclerView recyclerview_SBC;
    private LinearLayoutManager linearLayoutManager;
    private Node_SBC node_loaiSach;
    private ArrayList<Booksale> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booksale);
        AnhXa();
        AddRecyclerview();
    }
    void AnhXa(){
        recyclerview_SBC =findViewById(R.id.recyclerview_SBC);
        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        arrayList=new ArrayList<>();
        arrayList.clear();
        arrayList.add(new Booksale("S1",100,R.drawable.money_icon));
        arrayList.add(new Booksale("S1",100,R.drawable.money_icon));
        arrayList.add(new Booksale("S1",100,R.drawable.money_icon));
        arrayList.add(new Booksale("S1",100,R.drawable.money_icon));
        arrayList.add(new Booksale("S1",100,R.drawable.money_icon));
        arrayList.add(new Booksale("S1",100,R.drawable.money_icon));
        arrayList.add(new Booksale("S1",100,R.drawable.money_icon));
        node_loaiSach=new Node_SBC(this,arrayList);
    }

    void AddRecyclerview(){
        recyclerview_SBC.setLayoutManager(linearLayoutManager);
        recyclerview_SBC.setHasFixedSize(true);
        recyclerview_SBC.setAdapter(node_loaiSach);
    }

}
