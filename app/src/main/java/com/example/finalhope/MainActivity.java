package com.example.finalhope;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton pindah;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(getBaseContext(),R.raw.soundtrack);
        mp.start();

        pindah = (ImageButton) findViewById(R.id.button1);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Utama.class);
                startActivity(intent);
                mp.stop();

            }
        });

        pindah = (ImageButton) findViewById(R.id.button2);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,tentang.class);
                startActivity(intent);
                mp.stop();

            }
        });
    }
}