package com.example.projet;

import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class Option extends AppCompatActivity {
    AudioManager audiom;
    SeekBar s1;
    TextView txt1;
    ImageButton imgbuttonRTR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        s1 = findViewById(R.id.seekBar1);
        audiom = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        s1.setProgress(audiom.getStreamVolume(AudioManager.STREAM_MUSIC));
        txt1 = findViewById(R.id.textView1);
        txt1.setText(String.valueOf(s1.getProgress()));
        s1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txt1.setText(String.valueOf(s1.getProgress()));
                audiom.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }


}
