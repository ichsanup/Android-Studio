package com.example.finalhope;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class bagianangka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagianangka);

        final MediaPlayer suara0 = MediaPlayer.create(this,R.raw.angka0);
        final MediaPlayer suara1 = MediaPlayer.create(this,R.raw.angka1);
        final MediaPlayer suara2 = MediaPlayer.create(this,R.raw.angka2);
        final MediaPlayer suara3 = MediaPlayer.create(this,R.raw.angka3);
        final MediaPlayer suara4 = MediaPlayer.create(this,R.raw.angka4);
        final MediaPlayer suara5 = MediaPlayer.create(this,R.raw.angka5);
        final MediaPlayer suara6 = MediaPlayer.create(this,R.raw.angka6);
        final MediaPlayer suara7 = MediaPlayer.create(this,R.raw.angka7);
        final MediaPlayer suara8 = MediaPlayer.create(this,R.raw.angka8);
        final MediaPlayer suara9 = MediaPlayer.create(this,R.raw.angka9);
        final MediaPlayer suara10 = MediaPlayer.create(this,R.raw.angka10);

        ImageButton buttonsuara0 = (ImageButton) this.findViewById(R.id.angka0);
        ImageButton buttonsuara1 = (ImageButton) this.findViewById(R.id.angka1);
        ImageButton buttonsuara2 = (ImageButton) this.findViewById(R.id.angka2);
        ImageButton buttonsuara3 = (ImageButton) this.findViewById(R.id.angka3);
        ImageButton buttonsuara4 = (ImageButton) this.findViewById(R.id.angka4);
        ImageButton buttonsuara5 = (ImageButton) this.findViewById(R.id.angka5);
        ImageButton buttonsuara6 = (ImageButton) this.findViewById(R.id.angka6);
        ImageButton buttonsuara7 = (ImageButton) this.findViewById(R.id.angka7);
        ImageButton buttonsuara8 = (ImageButton) this.findViewById(R.id.angka8);
        ImageButton buttonsuara9 = (ImageButton) this.findViewById(R.id.angka9);
        ImageButton buttonsuara10 = (ImageButton) this.findViewById(R.id.angka10);

        buttonsuara0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara0.start();
            }
        });

        buttonsuara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara1.start();
            }
        });

        buttonsuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara2.start();
            }
        });

        buttonsuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara3.start();
            }
        });

        buttonsuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara4.start();
            }
        });

        buttonsuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara5.start();
            }
        });

        buttonsuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara6.start();
            }
        });

        buttonsuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara7.start();
            }
        });

        buttonsuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara8.start();
            }
        });

        buttonsuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara9.start();
            }
        });

        buttonsuara10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara10.start();
            }
        });

    }
}
