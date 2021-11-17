package com.example.healthapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Hair extends Activity {
    Button bck2body;
    TextView textView;
    TextView textView1;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hair);
        bck2body = findViewById(R.id.button20);
        textView = findViewById(R.id.textView33);
        textView1 = findViewById(R.id.textView34);
        textView2 = findViewById(R.id.textView32);
        Typeface customfont = Typeface.createFromAsset(getAssets(),"fonts/Sansita-Regular.ttf");
        textView1.setTypeface(customfont);
        textView2.setTypeface(customfont);
        textView.setTypeface(customfont);
        bck2body.setTypeface(customfont);
        ChangePage();
    }

    public void ChangePage(){
        final Context context = this;
        bck2body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Body.class);
                startActivity(intent);
            }
        });
    }
}
