package com.example.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageButton btnPreviours,btnNext;
    ImageView imageViewPicture1;
    private int imgId;
    private int[] arr = {R.drawable.dog1,R.drawable.dog2,R.drawable.dog3,
            R.drawable.dog4,R.drawable.dog5,R.drawable.dog6,R.drawable.dog7,R.drawable.dog8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPreviours = (ImageButton) findViewById(R.id.btnPrevious);
        btnNext = (ImageButton) findViewById(R.id.btnNext);
        imageViewPicture1 = (ImageView) findViewById(R.id.imageViewPicture1);
        btnNext.setOnClickListener(this);
        btnPreviours.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnPrevious:
                //修改imageview的src
                imgId = (imgId - 1+arr.length)%arr.length;
                imageViewPicture1.setImageResource(arr[imgId]);
                break;
            case R.id.btnNext:
                imgId = (imgId +1)%arr.length;
                imageViewPicture1.setImageResource(arr[imgId]);
                break;
        }
    }
}
