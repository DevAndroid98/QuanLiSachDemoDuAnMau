package com.tinh.dev.myapplication.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tinh.dev.myapplication.R;


public class HolderTypeBook extends RecyclerView.ViewHolder {
    public ImageView imgView;
    public TextView txtMaLoai;
    public TextView txttypeName;
    public ImageView imgEdit;
    public ImageView imgDelete;
    public HolderTypeBook(View itemView) {
        super(itemView);

        imgView =  itemView.findViewById(R.id.imgView);
        txtMaLoai = itemView.findViewById(R.id.txtMaLoai);
        txttypeName = itemView.findViewById(R.id.txttypeName);
        imgEdit =  itemView.findViewById(R.id.imgEdit);
        imgDelete =  itemView.findViewById(R.id.imgDelete);

    }
}
