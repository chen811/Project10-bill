package com.example.project_bill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    int mmm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView mes2 = findViewById(R.id.textView3);
        Intent intent = getIntent();
        String mes3 = intent.getStringExtra("mes2");
        int month = intent.getIntExtra("month1" , 0);
        mmm = month;
        mes2.setText(mes3);
    }

    public void runLoginb(View view) {
        Intent intent1 = new Intent(MainActivity3.this, MainActivity.class);
        intent1.putExtra("month" , mmm);
        startActivity(intent1);
        this.finish();
    }

    public void runLogina(View view) {
        Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
        intent.putExtra("month" , mmm);
        startActivity(intent);
        this.finish();
    }
}