package com.example.isve1901.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG =
            SynthesizerActivity.class.getName();
    private Button eButton;
    private Button mEButton;
    private Button aButton;
    private Button bButton;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpA;
    private MediaPlayer mpB;


    //this text does not matter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        eButton = (Button)findViewById(R.id.eButton);
        mEButton = (Button)findViewById(R.id.mEButton);
        aButton = (Button)findViewById(R.id.aButton);
        bButton = (Button)findViewById(R.id.bButton);

        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);



        eButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i(TAG, "eButton Clicked");

                mpE.seekTo(0);
                mpE.start();

            }
        });
        mEButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mpF.seekTo(0);
                Log.i(TAG, "mEButton Clicked");
                mpF.start();
            }
        });

        aButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i(TAG, "aButton Clicked");

                mpA.seekTo(0);
                mpA.start();

            }
        });

        bButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i(TAG, "bButton Clicked");

                mpB.seekTo(0);
                mpB.start();

            }
        });


    }
}
