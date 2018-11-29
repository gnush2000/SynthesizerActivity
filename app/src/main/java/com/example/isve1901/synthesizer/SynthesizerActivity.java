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
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    //this text does not matter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        eButton = (Button)findViewById(R.id.eButton);
        mEButton = (Button)findViewById(R.id.mEButton);

        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);

        mpE.seekTo(0);

        eButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i(TAG, "Button 1 Clicked");

                mpE.start();

            }
        });
        mEButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mpF.seekTo(0);
                Log.i(TAG, "Button 1 Clicked");
            }
        });
        mpF.start();

    }
}
