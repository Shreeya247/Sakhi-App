package com.example.healthapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContentPage extends Activity {
    Button whtismenstru;
    Button usesani;
    Button dispo;
    Button care;
    Button body;
    TextView textView1;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_page);
        whtismenstru = findViewById(R.id.button2);
        usesani = findViewById(R.id.button6);
        dispo = findViewById(R.id.button8);
        care = findViewById(R.id.button10);
        body = findViewById(R.id.button12);
        textView1 = findViewById(R.id.textView2);
        textView2 = findViewById(R.id.textView3);
        Typeface customfont = Typeface.createFromAsset(getAssets(),"fonts/Sansita-Regular.ttf");
        textView1.setTypeface(customfont);
        textView2.setTypeface(customfont);
        whtismenstru.setTypeface(customfont);
        usesani.setTypeface(customfont);
        dispo.setTypeface(customfont);
        care.setTypeface(customfont);
        body.setTypeface(customfont);

        ChangePage1();
        Changepage5();
        Changepage6();
        Changepage2();
        Changepages3();
    }

    public void ChangePage1(){
        final Context context = this;
        whtismenstru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, WhtisMenstru.class);
                startActivity(intent);
            }
        });
    }
    public void Changepage5(){
        final Context context = this;
        usesani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Usesani.class);
                startActivity(intent);
            }
        });
    }
    public void Changepage6(){
        final Context context = this;
        dispo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Dispo.class);
                startActivity(intent);
            }
        });
    }

    public void Changepage2(){
        final Context context = this;
        care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Care.class);
                startActivity(intent);
            }
        });
    }

    public void Changepages3(){
        final Context context = this;
        body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Body.class);
                startActivity(intent);
            }
        });
    }
}
