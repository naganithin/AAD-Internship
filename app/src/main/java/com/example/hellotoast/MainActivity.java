package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<i> extends AppCompatActivity {
    Button toast,count,uncount;
    TextView tv;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast = findViewById(R.id.toast);
        count = findViewById(R.id.count);
        uncount = findViewById(R.id.uncount);
        tv=findViewById(R.id.tv);
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                tv.setText(""+i);
            }
        });
        uncount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                if(i<0){
                    i=0;
                }
                tv.setText(""+i);
            }
        });
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "Welcome to Andriod. Your count is:"+i,Toast.LENGTH_SHORT).show();
            }
        });

    }
}