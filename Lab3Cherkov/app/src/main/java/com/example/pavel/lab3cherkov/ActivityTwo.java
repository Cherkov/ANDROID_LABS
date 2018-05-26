package com.example.pavel.lab3cherkov;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class ActivityTwo extends AppCompatActivity {

    ArrayList<String> dataModels;
    ListView listView;
    private static CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        DBHelper dbHelper =new DBHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        listView=findViewById(R.id.listView);

        dataModels= new ArrayList<>();
        Cursor c = db.query("mytable", null, null, null, null, null, null);
        if (c.moveToFirst()) {
            int nameColIndex = c.getColumnIndex("name");
            do {
                dataModels.add(" пароль = " + c.getString(nameColIndex));
            } while (c.moveToNext());
        } else dataModels.add("Записей нет!");
        c.close();
        adapter= new CustomAdapter(dataModels,this);

        listView.setAdapter(adapter);


    }





}
