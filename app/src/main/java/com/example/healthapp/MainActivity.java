package com.example.healthapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity {
    ImageView imageView;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView4);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        Typeface customfont = Typeface.createFromAsset(getAssets(),"fonts/Sansita-Regular.ttf");
        textView.setTypeface(customfont);
        button.setTypeface(customfont);
        Changepage();
    }

    public void Changepage(){
        final Context context = this;
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ContentPage.class);
                startActivity(intent);
            }
        });
    }
}