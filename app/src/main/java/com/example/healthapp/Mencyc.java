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

public class Mencyc extends Activity {
    Button Sym;
    VideoView videoView1;
    TextView textView;
    TextView textView1;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menstural_cycle_info);
        Sym = findViewById(R.id.button4);
        textView = findViewById(R.id.textView8);
        textView1 = findViewById(R.id.textView9);
        textView2 = findViewById(R.id.textView10);
        videoView1 = findViewById(R.id.videoView2);
        videoView1.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video2);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView1);
        videoView1.setMediaController(mediaController);
        Typeface customfont = Typeface.createFromAsset(getAssets(),"fonts/Sansita-Regular.ttf");
        textView1.setTypeface(customfont);
        textView2.setTypeface(customfont);
        textView.setTypeface(customfont);
        Sym.setTypeface(customfont);
        ChangePage3();
    }

    public void ChangePage3() {
        final Context context = this;
        Sym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Symptom.class);
                startActivity(intent);
            }
        });
    }

}
