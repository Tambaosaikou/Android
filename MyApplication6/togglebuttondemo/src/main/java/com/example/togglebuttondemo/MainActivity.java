package com.example.togglebuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    Switch swi;
    ToggleButton tgBtn;
    ImageView ivPic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swi = (Switch) findViewById(R.id.lightSwitch);
        tgBtn = (ToggleButton) findViewById(R.id.btnTG);
        ivPic = (ImageView) findViewById(R.id.ivPic);
        swi.setOnCheckedChangeListener(this);
        tgBtn.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked){
            ivPic.setImageResource(R.drawable.open);
        }
        else
        {
            ivPic.setImageResource(R.drawable.close);
        }
    }
}
