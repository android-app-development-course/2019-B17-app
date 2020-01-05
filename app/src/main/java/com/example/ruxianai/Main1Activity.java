package com.example.ruxianai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Main1Activity extends AppCompatActivity implements View.OnClickListener{
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private String[] data = {"检查","活检","FISH","免疫组化","血细胞计数","血液化学","血液标机测试","骨扫描","乳腺癌指数测试","MRI","乳房体检","自我检查","CT","胸部X射线","数字断层合成"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                Main1Activity.this, android.R.layout.simple_list_item_1, data);
        ((ListView) findViewById(R.id.list)).setAdapter(adapter);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.btn1) {
            Intent intent = new Intent(Main1Activity.this, Main1Activity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btn2) {
            Intent intent = new Intent(Main1Activity.this, Main2Activity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btn3) {
            Intent intent = new Intent(Main1Activity.this, Main3Activity.class);
            startActivity(intent);
        }
    }




}
