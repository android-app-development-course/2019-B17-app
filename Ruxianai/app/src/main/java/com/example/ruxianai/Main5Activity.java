package com.example.ruxianai;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main5Activity extends AppCompatActivity {

    private Handler mHandler;
    private ProgressBar progressBar;
    private List<String> findall;
    private List<String> _title;



    private static Set<String> url_set = new HashSet<>();                    //存放当前未访问的url集合
    private static Set<String> visited= new HashSet<>();                    //已经访问过的url集合

    private static Integer id = 0;                                          //依次记录url对应的id号



    //private TextView text_search;
//    private Button search;
//    private Button build;
    private EditText editText;
    private Boolean push=false;


    private RecyclerView recyclerView;
    private GeneralAdapter adapter;

    private static  List<String> m;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);

        Bundle receive=getIntent().getExtras();
        String title[]=receive.getStringArray("title");
        final String url[]=receive.getStringArray("url");





        m=new ArrayList<>();
        m.add(title[0]);
        m.add(title[1]);
        m.add(title[2]);
        m.add(title[3]);
        recyclerView=findViewById(R.id.show);
        recyclerView.setLayoutManager(new LinearLayoutManager(Main5Activity.this));
        adapter=new GeneralAdapter(Main5Activity.this,m);
        recyclerView.setAdapter(adapter);
        adapter.setOnitemClickLintener(new GeneralAdapter.OnitemClick() {
            @Override
            public void onItemClick(int position) {
                Intent intent= new Intent();
                intent.setData(Uri.parse(url[position]));
                intent.setAction(Intent.ACTION_VIEW);
                startActivity(intent);

            }
        });

/*
        Intent intent= new Intent();

        intent.setData(Uri.parse(link[0]));

        intent.setAction(Intent.ACTION_VIEW);
        startActivity(intent);
*/
    }

}