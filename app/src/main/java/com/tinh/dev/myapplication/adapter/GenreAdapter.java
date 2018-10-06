package com.tinh.dev.myapplication.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tinh.dev.myapplication.GenreActivity;
import com.tinh.dev.myapplication.holder.HolderTypeBook;
import com.tinh.dev.myapplication.model.TypeBook;
import com.tinh.dev.myapplication.R;
import com.tinh.dev.myapplication.holder.HolderUser;

import java.util.ArrayList;

public class GenreAdapter extends RecyclerView.Adapter<HolderTypeBook> {


      private ArrayList<TypeBook> typeBooks;
      private GenreActivity context;

    public GenreAdapter(ArrayList<TypeBook> typeBooks, GenreActivity context) {
        this.typeBooks = typeBooks;
        this.context = context;
    }

    @NonNull
    @Override
    public HolderTypeBook onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.cardview_type_book,parent,false);
        return new HolderTypeBook(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderTypeBook holder, final int position) {
        final TypeBook typeBook=typeBooks.get(position);
        holder.txttypeName.setText(typeBook.getTentheloai());
        holder.txtMaLoai.setText(typeBook.getMaTheLoai());
        holder.imgDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.deleteTypeBook(typeBook.getMaTheLoai()
                        ,position);
            }
        });

        holder.imgEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.updateTypeBook(typeBook.getMaTheLoai(),typeBook.getTentheloai(),typeBook.getMota(),typeBook.getVitri());
            }
        });

    }

    @Override
    public int getItemCount() {
        return typeBooks.size();
    }
}
