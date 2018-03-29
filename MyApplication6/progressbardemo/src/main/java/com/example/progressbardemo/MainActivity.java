package com.example.progressbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int secondaryProgress=10,curProgress=0;
    int max=100;
    ProgressBar barH,barC;
    SeekBar seekBar;
    TextView tvSeekValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvSeekValue = (TextView) findViewById(R.id.tvSB);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvSeekValue.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        barH = (ProgressBar) findViewById(R.id.progressBarH);
        barC = (ProgressBar) findViewById(R.id.progressBar);
        barH.setMax(max);
        findViewById(R.id.btnStart).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                curProgress = curProgress+10>100?100:curProgress+10;
                secondaryProgress = secondaryProgress+10>100?100:secondaryProgress+10;
                barH.setProgress(curProgress);
                barC.setSecondaryProgress(secondaryProgress);
                if (curProgress == 100) {
                    barC.setVisibility(View.GONE);
                }
            }
        });
        findViewById(R.id.btnReset).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                curProgress = 0;
                secondaryProgress = 0;
                barH.setProgress(curProgress);
                barC.setSecondaryProgress(secondaryProgress);
                barC.setVisibility(View.VISIBLE);
            }
        });
    }
}
