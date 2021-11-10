package com.example.project_bill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ArrayList<Integer> number = new ArrayList<Integer>();
    int mmm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent1 = getIntent();
        int month1 = intent1.getIntExtra("month",0);
        mmm = month1;
        switch (month1){
            case 1:
                //number = new int[]{65209 , 39340 , 1612 , 9999591 , 9999342};
                number.clear();
                number.add(99999);
                number.add(88888);
                number.add(777);
                number.add(666);
                number.add(555);
                break;
            case 2:
                //number = new int[]{22639 , 86238 , 4837 , 9999991 , 9999715};
                number.clear();
                number.add(12312);
                number.add(12332);
                number.add(1234);
                number.add(123);
                number.add(321);
                break;
            case 3:
                //number = new int[]{40109 , 23535 , 49847 , 9999706 , 9999574};
                number.clear();
                number.add(23456);
                number.add(34567);
                number.add(45678);
                number.add(963);
                number.add(852);
                break;
            case 4:
                //number = new int[]{3003 , 28722 , 70598 , 9999163 , 9999983 , 9999814};
                number.clear();
                number.add(96385);
                number.add(28568);
                number.add(99988);
                number.add(669);
                number.add(996);
                number.add(885);
                break;
            case 5:
                //number = new int[]{45865 , 29035 , 84442 , 9999292 , 9999650 , 9999230};
                number.clear();
                number.add(88777);
                number.add(77888);
                number.add(77555);
                number.add(666);
                number.add(456);
                number.add(654);
                break;
            case 6:
                //number = new int[]{13656 , 50862 , 72404 , 9999185 , 9999079 , 9999442};
                number.clear();
                number.add(99966);
                number.add(55888);
                number.add(66699);
                number.add(88877);
                number.add(66966);
                number.add(6655);
                break;
        }
    }

    public void runLogingo(View view) {
        TextView TV = findViewById(R.id.textView3);
        try {
            EditText mes = findViewById(R.id.editTextNumber);
            int inp = Integer.parseInt(mes.getText().toString());
            String mes2 = new String();
            for (int i = 0 ; i < number.size() ; i++){
                if ((number.get(i)%1000) == (inp%1000)){
                    if((number.get(i)%10000) == (inp%10000) && inp > 1000){
                        if (number.get(i) == inp){
                            mes2 = ("恭喜中獎 獎金4000元");
                            break;
                        }else {
                            mes2 = ("恭喜中獎 獎金1000元");
                            break;
                        }
                    }else {
                        mes2 = ("恭喜中獎 獎金200元");
                        break;
                    }
                }else {
                    mes2 = ("再接再厲");
                }
            }
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("month1" , mmm);
            intent.putExtra("mes2", mes2);
            startActivity(intent);
            this.finish();
        }catch (Exception e){
            TV.setText("請重新出入發票號碼");
        }
    }
}