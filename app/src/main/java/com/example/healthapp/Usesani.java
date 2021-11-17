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

public class Usesani extends Activity {
    Button bck2content2;
    VideoView videoView3;
    TextView textView;
    TextView textView1;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usesani);
        bck2content2 = findViewById(R.id.button7);
        videoView3 = findViewById(R.id.videoView3);
        textView = findViewById(R.id.textView13);
        textView1 = findViewById(R.id.textView14);
        textView2 = findViewById(R.id.textView15);
        videoView3.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video3);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView3);
        videoView3.setMediaController(mediaController);
        Typeface customfont = Typeface.createFromAsset(getAssets(),"fonts/Sansita-Regular.ttf");
        textView1.setTypeface(customfont);
        textView2.setTypeface(customfont);
        textView.setTypeface(customfont);
        bck2content2.setTypeface(customfont);
        ChangePage4();
    }

    public void ChangePage4(){
        final Context context = this;
        bck2content2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ContentPage.class);
                startActivity(intent);
            }
        });
    }
}
