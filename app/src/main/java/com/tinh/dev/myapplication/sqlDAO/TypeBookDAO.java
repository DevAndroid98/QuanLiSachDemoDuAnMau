package com.tinh.dev.myapplication.sqlDAO;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.tinh.dev.myapplication.Constant;
import com.tinh.dev.myapplication.database.SqliteOpenHelper;
import com.tinh.dev.myapplication.model.TypeBook;


import java.util.List;

public class TypeBookDAO implements Constant {

    private SqliteOpenHelper helper;

    public TypeBookDAO(SqliteOpenHelper helper) {
        this.helper = helper;
    }

    public long insertTypeBook(TypeBook typeBook){
        SQLiteDatabase sqLiteOpenHelper = helper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(TB_COLUMN_ID, typeBook.getMaTheLoai());
        values.put(TB_COLUMN_NAME, typeBook.getTentheloai());
        values.put(TB_COLUMN_DES, typeBook.getMota());
        values.put(TB_COLUMN_POS, typeBook.getVitri());

        //Tạo câu lệnh INSERT

        long id=sqLiteOpenHelper.insert(helper.TABLE_TYPE_BOOK, null, values);
        Log.e("Tinh",id+"");
        sqLiteOpenHelper.close();
        return id;
    }
    public long updateTypeBook(TypeBook typeBook){
        SQLiteDatabase sqLiteOpenHelper = helper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(TB_COLUMN_ID, typeBook.getMaTheLoai());
        values.put(TB_COLUMN_NAME, typeBook.getTentheloai());
        values.put(TB_COLUMN_DES, typeBook.getMota());
        values.put(TB_COLUMN_POS, typeBook.getVitri());
       long result= sqLiteOpenHelper.update(helper.TABLE_TYPE_BOOK,values, TB_COLUMN_ID+"=?",new String[]{String.valueOf(typeBook.getMaTheLoai())});
        sqLiteOpenHelper.close();
        return result;
    }

    public long deleteTypeBook(String typeID){
        SQLiteDatabase sqLiteOpenHelper = helper.getWritableDatabase();
        long delete=sqLiteOpenHelper.delete(helper.TABLE_TYPE_BOOK, TB_COLUMN_ID+"=?",new String[]{String.valueOf(typeID)});
        sqLiteOpenHelper.close();
        return delete;
    }

    public List<TypeBook> getAllTypeBook(){

        return null;

    }

    public TypeBook getTypeBookID(String ID){

        TypeBook typeBook = null;
        SQLiteDatabase sqLiteDatabase = helper.getWritableDatabase();

        Cursor cursor = sqLiteDatabase.query(TABLE_USER, new String[]{COLUMN_USER, COLUMN_PASSWORD, COLUMN_PHONE, COLUMN_HOTEN}
                , COLUMN_USER + "=?"

                , new String[]{ID}, null, null, null);

        if (cursor != null && cursor.moveToFirst()) {

            String matheloai = cursor.getString(cursor.getColumnIndex(TB_COLUMN_ID));
            String tentheloai = cursor.getString(cursor.getColumnIndex(TB_COLUMN_NAME));
            String mota = cursor.getString(cursor.getColumnIndex(TB_COLUMN_DES));
            String vitri = cursor.getString(cursor.getColumnIndex(TB_COLUMN_POS));
            typeBook = new TypeBook();
            typeBook.setMaTheLoai(matheloai);
            typeBook.setTentheloai(tentheloai);
            typeBook.setMota(mota);
            typeBook.setVitri(vitri);



        }
        return typeBook;
    }


}
