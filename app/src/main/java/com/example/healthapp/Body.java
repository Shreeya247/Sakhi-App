package com.example.healthapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Body extends Activity {
    TextView textView1;
    TextView textView2;
    Button skin;
    Button eyes;
    Button hand;
    Button hair;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.body);
        skin = findViewById(R.id.button13);
        eyes = findViewById(R.id.button15);
        hand = findViewById(R.id.button18);
        hair = findViewById(R.id.button19);
        textView1 = findViewById(R.id.textView21);
        textView2 = findViewById(R.id.textView22);

        Typeface customfont = Typeface.createFromAsset(getAssets(),"fonts/Sansita-Regular.ttf");
        textView1.setTypeface(customfont);
        textView2.setTypeface(customfont);
        skin.setTypeface(customfont);
        eyes.setTypeface(customfont);
        hand.setTypeface(customfont);
        hair.setTypeface(customfont);
        ChangePage1();
        Changepage5();
        Changepage6();
        Changepage2();
    }

    public void ChangePage1(){
        final Context context = this;
        skin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Skin.class);
                startActivity(intent);
            }
        });
    }
    public void Changepage5(){
        final Context context = this;
        eyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Eyes.class);
                startActivity(intent);
            }
        });
    }
    public void Changepage6(){
        final Context context = this;
        hand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Hands.class);
                startActivity(intent);
            }
        });
    }

    public void Changepage2(){
        final Context context = this;
        hair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Hair.class);
                startActivity(intent);
            }
        });
    }
}
