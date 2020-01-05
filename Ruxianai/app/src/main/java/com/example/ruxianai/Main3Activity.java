package com.example.ruxianai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{
    private String[] data = {"工作","定期就医","营养","性生活","怀孕","脱发"};
    private Button btn1;
    private Button btn2;
    private Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                Main3Activity.this, android.R.layout.simple_list_item_1, data);
        ((ListView) findViewById(R.id.list)).setAdapter(adapter);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.btn1) {
            Intent intent = new Intent(Main3Activity.this, Main1Activity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btn2) {
            Intent intent = new Intent(Main3Activity.this, Main2Activity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btn3) {
            Intent intent = new Intent(Main3Activity.this, Main3Activity.class);
            startActivity(intent);
        }
    }
}
