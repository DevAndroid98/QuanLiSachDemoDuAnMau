package com.tinh.dev.myapplication.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tinh.dev.myapplication.R;


public class HolderBill extends RecyclerView.ViewHolder {
    public ImageView imgView;
    public TextView txtID;
    public TextView txtDATE;
    public ImageView imgEdit;
    public ImageView imgDelete;



    public HolderBill(View itemView) {
        super(itemView);

        imgView = itemView.findViewById(R.id.imgView);
        txtID = itemView.findViewById(R.id.txtID);
        txtDATE = itemView.findViewById(R.id.txtDATE);
        imgEdit =  itemView.findViewById(R.id.imgEdit);
        imgDelete =  itemView.findViewById(R.id.imgDelete);
    }
}
