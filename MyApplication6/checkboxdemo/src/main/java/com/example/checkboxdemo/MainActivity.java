package com.example.checkboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox [] checkBoxes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBoxes = new CheckBox[3];
        checkBoxes[0] = (CheckBox) findViewById(R.id.chk1);
        checkBoxes[1] = (CheckBox) findViewById(R.id.chk2);
        checkBoxes[2] = (CheckBox) findViewById(R.id.chk3);

        findViewById(R.id.btnSubmit).setOnClickListener((v){
                String info="";
        for (int i=0;i<checkBoxes.length;i++){
            if(checkBoxes[i].isChecked())
                info += checkBoxes[i].getText().toString();
        }
        Toast.makeText(MainActivity.this, info, Toast.LENGTH_SHORT).show();
        });

    }
}
