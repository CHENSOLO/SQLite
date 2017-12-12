package com.untils;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Administrator on 2017/12/12.
 */
/*
中间层
 */

public class DbManger {
    private static MySqliteHelper helper;

    public static MySqliteHelper getIntance(Context context) {
        if ( helper == null ) {
            helper = new MySqliteHelper(context);
        }
        return helper;
    }

    /**
     * 根据sql语句查询获得cursor对象
     *
     * @param db            数据库对象
     * @param sql           查询的sql语句
     * @param selectionArgs 查询条件的占位符
     * @return 查询结果
     */
    public static Cursor selectDataBySql(SQLiteDatabase db, String sql, String[] selectionArgs) {
        Cursor cursor = null;
        if ( db != null ) {
            db.rawQuery(sql, selectionArgs);
        }
        return cursor;
    }
}