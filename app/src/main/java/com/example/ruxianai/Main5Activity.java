package com.example.ruxianai;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.widget.EditText;
import android.widget.ProgressBar;

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












        m=new ArrayList<>();
        m.add("1");
        m.add("2");
        m.add("3");
        m.add("4");
        recyclerView=findViewById(R.id.show);

        recyclerView.setLayoutManager(new LinearLayoutManager(Main5Activity.this));

       adapter=new GeneralAdapter(Main5Activity.this,m);
        recyclerView.setAdapter(adapter);



    }

}