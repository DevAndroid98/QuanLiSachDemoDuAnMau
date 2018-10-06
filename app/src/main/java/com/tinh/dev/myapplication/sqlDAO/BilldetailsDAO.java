package com.tinh.dev.myapplication.sqlDAO;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.tinh.dev.myapplication.Constant;
import com.tinh.dev.myapplication.database.SqliteOpenHelper;
import com.tinh.dev.myapplication.model.Bill;
import com.tinh.dev.myapplication.model.Billdetails;

public class BilldetailsDAO implements Constant {

    SqliteOpenHelper database;

    public BilldetailsDAO(SqliteOpenHelper database) {
        this.database = database;
    }

    public long insert(Billdetails billdetails){
        SQLiteDatabase sqLiteDatabase=database.getWritableDatabase();
        ContentValues values=new ContentValues();
            values.put(B_COLUMN_IDBILL,billdetails.getIdbill());
            values.put(B_COLUMN_IDBOOK,billdetails.getIdbook());
            values.put(B_COLUMN_POS,billdetails.getSoluong());

            long a=sqLiteDatabase.insert(TABLE_HOADONCHITIET,null,values);
            sqLiteDatabase.close();
        Log.e("Tinh",a+"");
            return a;
            }


            public long delete(String id){
                SQLiteDatabase sqLiteDatabase=database.getWritableDatabase();
               long a= sqLiteDatabase.delete(TABLE_HOADONCHITIET,B_COLUMN_ID + "=?",new String[]{id});
               Log.e("Tinhx",a+"");
               return a;
            }
}
