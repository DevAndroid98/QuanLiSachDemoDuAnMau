package com.tinh.dev.myapplication.adapter;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.muddzdev.styleabletoastlibrary.StyleableToast;
import com.tinh.dev.myapplication.UserActivity;
import com.tinh.dev.myapplication.model.User;
import com.tinh.dev.myapplication.R;
import com.tinh.dev.myapplication.holder.HolderUser;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<HolderUser> {
    private UserActivity context;
    private ArrayList<User> arrayList;

    public UserAdapter(UserActivity context, ArrayList<User> arrayList) {
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
    public void onBindViewHolder(@NonNull HolderUser holder, final int position) {
         final User user=arrayList.get(position);
        holder.imgView.setImageResource(R.drawable.emone);
        holder.txtUsername.setText(user.getUserName());
        holder.txtPhone.setText(user.getPhone());
        holder.imgDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (arrayList.size()<=1){
                   StyleableToast.makeText(context,"Phải có ít nhất một người dùng",R.style.exampleToas).show();
               }else {
                   context.deleteUser(user.getUserName(),position);
               }

            }
        });

        holder.imgEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.updateUser(user.getUserName(),user.getPhone(),user.getHoTen());
            }
        });


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
