package com.example.project_bill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void runLogin(View view) {
        TextView choose = findViewById(R.id.textView0);
        choose.setText("1-2月");
        number = 1;
    }

    public void runLogin2(View view) {
        TextView choose = findViewById(R.id.textView0);
        choose.setText("3-4月");
        number = 2;
    }

    public void runLogin3(View view) {
        TextView choose = findViewById(R.id.textView0);
        choose.setText("5-6月");
        number = 3;
    }

    public void runLogin4(View view) {
        TextView choose = findViewById(R.id.textView0);
        choose.setText("7-8月");
        number = 4;
    }

    public void runLogin5(View view) {
        TextView choose = findViewById(R.id.textView0);
        choose.setText("9-10月");
        number = 5;
    }

    public void runLogin6(View view) {
        TextView choose = findViewById(R.id.textView0);
        choose.setText("11-12月");
        number = 6;
    }

    public void runLogingo(View view) {
        if (number != 0){
            Intent intent1 = new Intent(MainActivity.this, MainActivity2.class);
            intent1.putExtra("month", number);
            startActivity(intent1);
            this.finish();
        }else {
            TextView mmm = findViewById(R.id.textView0);
            mmm.setText("請選擇月份");
        }
    }
}