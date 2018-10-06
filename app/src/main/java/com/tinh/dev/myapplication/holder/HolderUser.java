package com.tinh.dev.myapplication.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tinh.dev.myapplication.R;

public class HolderUser extends RecyclerView.ViewHolder {
    public TextView txtUsername,txtPhone;
    public ImageView imgView,imgDelete,imgEdit;
    public HolderUser(View itemView) {
        super(itemView);
        txtUsername=itemView.findViewById(R.id.txtUsername);
        txtPhone=itemView.findViewById(R.id.txtPhone);
        imgView=itemView.findViewById(R.id.imgView);
        imgDelete=itemView.findViewById(R.id.imgDelete);
        imgEdit=itemView.findViewById(R.id.imgEdit);

    }
}
