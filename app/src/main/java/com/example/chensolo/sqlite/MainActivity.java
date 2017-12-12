package com.example.chensolo.sqlite;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.untils.Constant;
import com.untils.DbManger;
import com.untils.MySqliteHelper;

/**
 *
 * SQLite数据库中的查询操作
 */
public class MainActivity extends AppCompatActivity {
 private MySqliteHelper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = DbManger.getIntance(this);
    }
    /*
    点击按钮创建数据库并且插入测试数据
     */
    public void createDb(View view){
        SQLiteDatabase db = helper.getWritableDatabase();
        //测试数据
        for (int i = 0; i <=30; i++) {
            String sql = "insert into "+ Constant.TABLE_NAME+"values("+i+",'张三"+i+"',20)";
            db.execSQL(sql);
        }
        db.close();
    }
    /*
    点击按钮查询表中的数据
     */
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_query:

                break;
        }
    }
}
