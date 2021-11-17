package com.example.healthapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class Care extends Activity {
    Button bck2content4;
    VideoView videoView6;
    TextView textView;
    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.care);
        bck2content4 = findViewById(R.id.button11);
        videoView6 = findViewById(R.id.videoView6);
        textView1 = findViewById(R.id.textView19);
        textView = findViewById(R.id.textView20);
        videoView6.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video6);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView6);
        videoView6.setMediaController(mediaController);

        Typeface customfont = Typeface.createFromAsset(getAssets(),"fonts/Sansita-Regular.ttf");
        textView1.setTypeface(customfont);
        textView.setTypeface(customfont);
        bck2content4.setTypeface(customfont);
        ChangePage4();
    }

    public void ChangePage4(){
        final Context context = this;
        bck2content4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ContentPage.class);
                startActivity(intent);
            }
        });
    }
}
