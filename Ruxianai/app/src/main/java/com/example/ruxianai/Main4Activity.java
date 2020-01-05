package com.example.ruxianai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class Main4Activity extends AppCompatActivity {
    private Button mbtn_search;
    private EditText met_search;
    private RecyclerView mRecyclerView;
    private TextView mtv_deleteAll;
    SQLiteDatabase db1;
    String title[]= new String[4];
    String url[]= new String[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);

        final Bundle data=new Bundle();
        met_search=(EditText)findViewById(R.id.et_search) ;
        Button searchActivity = (Button) findViewById(R.id.btn_search);




        searchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t_search=met_search.getText().toString();
                db1= openOrCreateDatabase("/data/data/com.example.ruxianai/databases/itcast.db",0,null);
                Cursor c=db1.rawQuery("select * from information where description like '%"+ t_search+"%' ",null);
                c.moveToFirst();
                int cur=0;
                while (c.moveToNext())
                {
                 title[cur]=c.getString(c.getColumnIndex("title"));
                 url[cur]=c.getString(c.getColumnIndex("url"));
                 cur++;
                     if(cur==4)break;
                }
                c.close();
                db1.close();
                data.putStringArray("title",title);
                data.putStringArray("url",url);
                Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
                intent.putExtras(data);
                startActivity(intent);

            }
        });

    }




}