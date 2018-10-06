package com.tinh.dev.myapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tinh.dev.myapplication.model.Booksale;
import com.tinh.dev.myapplication.R;
import com.tinh.dev.myapplication.holder.HolderUser;

import java.util.ArrayList;

public class Node_SBC extends RecyclerView.Adapter<HolderUser> {

    private Context context;
    private ArrayList<Booksale> arrayList;

    public Node_SBC(Context context, ArrayList<Booksale> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }
    @NonNull
    @Override
    public HolderUser onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.cardview_user,parent,false);
        return new HolderUser(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderUser holder, int position) {
        Booksale nguoiDung=arrayList.get(position);
//        holder.txtChinh.setText("Mã sách:"+nguoiDung.getMaSach());
//        holder.txtPhu.setText("Số lượng"+nguoiDung.getSL()+"");
        holder.imgView.setImageResource(nguoiDung.getAnh());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
