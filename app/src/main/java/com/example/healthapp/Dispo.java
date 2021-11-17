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

public class Dispo extends Activity {
    Button bck2content3;
    VideoView videoView4;
    TextView textView;
    TextView textView1;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dispo);
        bck2content3 = findViewById(R.id.button9);
        videoView4 = findViewById(R.id.videoView4);
        textView = findViewById(R.id.textView16);
        textView1 = findViewById(R.id.textView17);
        textView2 = findViewById(R.id.textView18);
        videoView4.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video4);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView4);
        videoView4.setMediaController(mediaController);
        Typeface customfont = Typeface.createFromAsset(getAssets(),"fonts/Sansita-Regular.ttf");
        textView1.setTypeface(customfont);
        textView2.setTypeface(customfont);
        textView.setTypeface(customfont);
        bck2content3.setTypeface(customfont);
        ChangePage7();
    }

    public void ChangePage7(){
        final Context context = this;
        bck2content3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ContentPage.class);
                startActivity(intent);
            }
        });
    }
}
