package com.tinh.dev.myapplication.sqlDAO;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.tinh.dev.myapplication.Constant;
import com.tinh.dev.myapplication.database.SqliteOpenHelper;
import com.tinh.dev.myapplication.model.User;



public class UserDAO implements Constant {
         private SqliteOpenHelper helper;

    public UserDAO(SqliteOpenHelper helper) {
        this.helper = helper;
    }

    public void insertUser(User nguoiDung) {

        SQLiteDatabase sqLiteOpenHelper = helper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_USER, nguoiDung.getUserName());
        values.put(COLUMN_PASSWORD, nguoiDung.getPassword());
        values.put(COLUMN_PHONE, nguoiDung.getPhone());
        values.put(COLUMN_HOTEN, nguoiDung.getHoTen());

        //Tạo câu lệnh INSERT

        long id=sqLiteOpenHelper.insert(helper.TABLE_USER, null, values);
        Log.e("Tinh",id+"");
        sqLiteOpenHelper.close();


    }

    public void deleteUsername(String name){

        SQLiteDatabase sqLiteOpenHelper = helper.getWritableDatabase();
        sqLiteOpenHelper.delete(SqliteOpenHelper.TABLE_USER, COLUMN_USER+"=?",new String[]{String.valueOf(name)});
        sqLiteOpenHelper.close();

    }

    public void updateUsername(User user,String name){

        SQLiteDatabase sqLiteOpenHelper = helper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COLUMN_USER, user.getUserName());
        values.put(COLUMN_PASSWORD, user.getPassword());
        values.put(COLUMN_PHONE, user.getPhone());
        values.put(COLUMN_HOTEN,user.getHoTen());
        sqLiteOpenHelper.update(SqliteOpenHelper.TABLE_USER,values, COLUMN_USER+"=?",new String[]{String.valueOf(name)});
        sqLiteOpenHelper.close();

    }

    public User getDataUser(String name) {

        User nguoiDung = null;
        SQLiteDatabase sqLiteDatabase = helper.getWritableDatabase();

        Cursor cursor = sqLiteDatabase.query(TABLE_USER, new String[]{COLUMN_USER, COLUMN_PASSWORD, COLUMN_PHONE, COLUMN_HOTEN}
                , COLUMN_USER + "=?"

                , new String[]{name}, null, null, null);

        if (cursor != null && cursor.moveToFirst()) {

            String user_name = cursor.getString(cursor.getColumnIndex(COLUMN_USER));
            String password = cursor.getString(cursor.getColumnIndex(COLUMN_PASSWORD));
            String phone = cursor.getString(cursor.getColumnIndex(COLUMN_PHONE));
            String hoten = cursor.getString(cursor.getColumnIndex(COLUMN_HOTEN));
            nguoiDung = new User();
            nguoiDung.setUserName(user_name);
            nguoiDung.setPassword(password);
            nguoiDung.setPhone(phone);
            nguoiDung.setHoTen(hoten);



        }
        return nguoiDung;
    }

}
