package com.example.codetestweek1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int c=0,a,temp;
        int n=153;//It is the number to check armstrong
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c) {
            Log.d("TAG", "armstrong number");
        }
        else
            Log.d("TAG", "Not armstrong number");

    }
}
