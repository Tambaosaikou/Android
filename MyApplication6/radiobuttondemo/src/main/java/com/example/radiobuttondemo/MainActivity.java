package com.example.radiobuttondemo;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
ImageView ivMain;
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_demo);
        ivMain = (ImageView) findViewById(R.id.ivMain);
        rg = (RadioGroup) findViewById(R.id.rg);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch(checkedId){
                    case R.id.rbIndex :
                        ivMain.setImageResource(R.drawable.onepic);
                        break;
                    case R.id.rbVideo:
                        ivMain.setImageResource(R.drawable.twopic);
                        break;
                    case R.id.rbTopic:
                        ivMain.setImageResource(R.drawable.threeepic);
                        break;
                    case R.id.rbMe:
                        ivMain.setImageResource(R.drawable.mine);
                        break;
                    default:
                        break;
                    }
            }
        });
    }
}
