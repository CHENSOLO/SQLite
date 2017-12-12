package com.untils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2017/12/12.
 */

public class MySqliteHelper extends SQLiteOpenHelper{
    public MySqliteHelper(Context context) {
        super(context,Constant.DATABASE_NAME, null, Constant.DATABASE_VERSIION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
         //创建表的语句
        String sql = "create table "+Constant.TABLE_NAME+"("+Constant.ID+" Integer primary key,"+Constant.NAME+"varchar(18),"+Constant.AGE+" Integer)";
         db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
