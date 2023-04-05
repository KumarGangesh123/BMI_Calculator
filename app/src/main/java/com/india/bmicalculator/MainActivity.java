package com.india.bmicalculator;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout llfrontPage = findViewById(R.id.frontPage);

        EditText edit1 = findViewById(R.id.edtWeight);

        EditText edit2 = findViewById(R.id.edtHeight);

        Button btn1 = findViewById(R.id.calculateButton);

        TextView txt = findViewById(R.id.result);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double weight = Double.parseDouble(edit1.getText().toString());

                double height = Double.parseDouble(edit2.getText().toString())/100.0;

                double BMI = weight / (height*height);

                if(BMI < 18.5){
                    txt.setText("Under Weight");
                    llfrontPage.setBackgroundColor(getResources().getColor(R.color.yellow));
                }else if(BMI > 18.5 && BMI < 24.9){
                    txt.setText("Hurray !!! You are Healthy");
                    llfrontPage.setBackgroundColor(getResources().getColor(R.color.green));
                }else if(BMI > 25){
                    txt.setText("Over Weight");
                    llfrontPage.setBackgroundColor(getResources().getColor(R.color.red));
                }

            }
        });

    }
}