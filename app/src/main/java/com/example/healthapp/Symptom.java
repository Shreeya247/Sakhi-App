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

public class Symptom extends Activity {
    Button bck2content;
    VideoView videoView5;
    TextView textView;
    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symptom);
        bck2content = findViewById(R.id.button5);
        videoView5 = findViewById(R.id.videoView5);
        textView = findViewById(R.id.textView11);
        textView1 = findViewById(R.id.textView12);
        videoView5.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video5);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView5);
        videoView5.setMediaController(mediaController);
        Typeface customfont = Typeface.createFromAsset(getAssets(),"fonts/Sansita-Regular.ttf");
        textView.setTypeface(customfont);
        textView1.setTypeface(customfont);
        bck2content.setTypeface(customfont);
        ChangePage4();
    }

    public void ChangePage4(){
        final Context context = this;
        bck2content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ContentPage.class);
                startActivity(intent);
            }
        });
    }
}
