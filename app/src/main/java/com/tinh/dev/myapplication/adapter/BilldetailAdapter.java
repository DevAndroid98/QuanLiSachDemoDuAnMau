package com.tinh.dev.myapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tinh.dev.myapplication.BilldetailActivity;
import com.tinh.dev.myapplication.R;
import com.tinh.dev.myapplication.holder.HolderBilldetail;
import com.tinh.dev.myapplication.model.Billdetails;
import com.tinh.dev.myapplication.model.Book;

import java.util.ArrayList;

public class BilldetailAdapter extends RecyclerView.Adapter<HolderBilldetail> {

   private ArrayList<Billdetails> billdetails;
   private ArrayList<Book> bookArrayList;
   private BilldetailActivity context;
   private int i;


    public BilldetailAdapter(ArrayList<Billdetails> billdetails, ArrayList<Book> bookArrayList, BilldetailActivity context, int i) {
        this.billdetails = billdetails;
        this.bookArrayList = bookArrayList;
        this.context = context;
        this.i = i;
    }

    @NonNull
    @Override
    public HolderBilldetail onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.cardview_billdetail,parent,false);
        return new HolderBilldetail(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderBilldetail holder, final int position) {
             final Billdetails bill=billdetails.get(position);
             int pos=-1;
        for (int i = 0; i < billdetails .size(); i++){
            Book book=bookArrayList.get(i);
            if (book.getMaSach().equalsIgnoreCase(bill.getIdbook())){
                pos = i;
                break;
            }
        }

             Book book=bookArrayList.get(pos);
             holder.txtSoLuong.setText("Số lượng:"+bill.getSoluong());
             holder.txtMaSach.setText("Mã sách:"+bill.getIdbook());
             holder.txtGiaBia.setText("Giá bìa:"+book.getGiaBia()+"\tVND");
             holder.txtYhanhTien.setText("Thành tiền:"+bill.getSoluong()*book.getGiaBia()+"\tVND");

           holder.imageView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
              context.delete(bill.getId(),position);
               }
           });





    }

    @Override
    public int getItemCount() {
        return billdetails.size();
    }

}
