package com.example.actab.happybirthday;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.birthday_song);

        Button playButton = findViewById(R.id.play);
        playButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mediaPlayer.start();
            }
        });

        Button pauseButton = findViewById(R.id.pause);
        pauseButton.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View view){
                mediaPlayer.pause();
            }
        });

    }

}


