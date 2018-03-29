package com.example.radiobuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class RadioButtonDemo extends AppCompatActivity {

    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo1);
        rg = (RadioGroup) findViewById(R.id.rg);
        findViewById(R.id.btnSubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton rb = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
                //for (int i=0;i<rg.getChildCount();i++){
                    //RadioButton rbtn = (RadioButton)rg.getChildAt(i);
                    //if (rbtn.isChecked()){
                        //Toast.makeText(RadioButtonDemo.this, rbtn.getText(), Toast.LENGTH_SHORT).show();
                Toast.makeText(RadioButtonDemo.this, rb .getText(), Toast.LENGTH_SHORT).show();
                   // }
                //}
            }
        });
    }
}
