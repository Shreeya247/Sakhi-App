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

public class WhtisMenstru extends Activity {
    VideoView videoView;
    Button mencyc;
    TextView textView;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menstrual_info_page);
        videoView = findViewById(R.id.videoView);
        textView = findViewById(R.id.textView4);
        textView1 = findViewById(R.id.textView5);
        textView2 = findViewById(R.id.textView6);
        textView3 = findViewById(R.id.textView7);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video1);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        mencyc = findViewById(R.id.button3);
        Typeface customfont = Typeface.createFromAsset(getAssets(),"fonts/Sansita-Regular.ttf");
        textView1.setTypeface(customfont);
        textView2.setTypeface(customfont);
        textView.setTypeface(customfont);
        textView3.setTypeface(customfont);
        mencyc.setTypeface(customfont);
        ChangePage2();
    }

    public void ChangePage2(){
        final Context context = this;
        mencyc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Mencyc.class);
                startActivity(intent);
            }
        });
    }


}
