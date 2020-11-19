package com.disebud.wasitdigital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView mShowCount,mShowCountB;
    int mCount,mCountB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = (TextView) findViewById(R.id.showText);
        mShowCountB = (TextView) findViewById(R.id.showText1);
    }

    public void showToast(View view) {
        Toast.makeText(this,"Jumlah Skor Team A :"+ mCount,Toast.LENGTH_LONG).show();
    }

    public void countUp(View view) {
        mCount +=1 ;
        mShowCount.setText(Integer.toString(mCount));
    }

    public void countUpB(View view) {
        mCountB +=1 ;
        mShowCountB.setText(Integer.toString(mCountB));
    }

    public void showToastB(View view) {
        Toast.makeText(this,"Jumlah Skor Team B:"+ mCountB,Toast.LENGTH_LONG).show();
    }

    public void clearA(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
    }

    public void clearB(View view) {
        mCountB = 0;
        mShowCountB.setText(Integer.toString(mCountB));
    }

    public void countDown(View view) {
        mCount -=1 ;
        mShowCount.setText(Integer.toString(mCount));
    }

    public void countDownB(View view) {
        mCountB -=1 ;
        mShowCountB.setText(Integer.toString(mCountB));
    }
}