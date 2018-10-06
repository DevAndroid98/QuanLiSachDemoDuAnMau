package com.tinh.dev.myapplication.sqlDAO;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.tinh.dev.myapplication.Constant;
import com.tinh.dev.myapplication.database.SqliteOpenHelper;
import com.tinh.dev.myapplication.model.Bill;

public class BillDao implements Constant {
    private SqliteOpenHelper helper;

    public BillDao(SqliteOpenHelper helper) {
        this.helper = helper;
    }

    public long insertBill(Bill bill){
        SQLiteDatabase sqLiteDatabase=helper.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(BILL_COLUMN_ID,bill.getMaHoaDon());
        values.put(BILL_COLUMN_DATE,bill.getNgayMua());

        long a=sqLiteDatabase.insert(TABLE_BILL,null,values);
        sqLiteDatabase.close();
        return a;
    }

    public long updateBill(Bill bill){
        SQLiteDatabase sqLiteDatabase=helper.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(BILL_COLUMN_DATE,bill.getNgayMua());
        long a=sqLiteDatabase.update(TABLE_BILL,values,BILL_COLUMN_ID + "=?",new String[]{String.valueOf(bill.getMaHoaDon())});
        sqLiteDatabase.close();
        return a;
    }

    public long deleteBill(String id){
        SQLiteDatabase sqLiteDatabase=helper.getWritableDatabase();
        long a=sqLiteDatabase.delete(TABLE_BILL,BILL_COLUMN_ID + "=?",new String[]{String.valueOf(id)});
        sqLiteDatabase.close();
        return a;
        }
}
