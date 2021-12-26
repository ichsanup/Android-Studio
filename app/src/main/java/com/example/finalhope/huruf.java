package com.example.finalhope;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;

public class huruf extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf);


        final MediaPlayer suaraa = MediaPlayer.create(this,R.raw.hurufa);
        final MediaPlayer suarab = MediaPlayer.create(this,R.raw.hurufb);
        final MediaPlayer suarac = MediaPlayer.create(this,R.raw.hurufc);
        final MediaPlayer suarad = MediaPlayer.create(this,R.raw.hurufd);
        final MediaPlayer suarae = MediaPlayer.create(this,R.raw.hurufe);
        final MediaPlayer suaraf = MediaPlayer.create(this,R.raw.huruff);
        final MediaPlayer suarag = MediaPlayer.create(this,R.raw.hurufg);
        final MediaPlayer suarah = MediaPlayer.create(this,R.raw.hurufh);
        final MediaPlayer suarai = MediaPlayer.create(this,R.raw.hurufi);
        final MediaPlayer suaraj = MediaPlayer.create(this,R.raw.hurufj);
        final MediaPlayer suarak = MediaPlayer.create(this,R.raw.hurufk);
        final MediaPlayer suaral = MediaPlayer.create(this,R.raw.hurufl);
        final MediaPlayer suaram = MediaPlayer.create(this,R.raw.hurufm);
        final MediaPlayer suaran = MediaPlayer.create(this,R.raw.hurufn);
        final MediaPlayer suarao = MediaPlayer.create(this,R.raw.hurufo);
        final MediaPlayer suarap = MediaPlayer.create(this,R.raw.hurufp);
        final MediaPlayer suaraq = MediaPlayer.create(this,R.raw.hurufq);
        final MediaPlayer suarar = MediaPlayer.create(this,R.raw.hurufr);
        final MediaPlayer suaras = MediaPlayer.create(this,R.raw.hurufs);
        final MediaPlayer suarat = MediaPlayer.create(this,R.raw.huruft);
        final MediaPlayer suarau = MediaPlayer.create(this,R.raw.hurufu);
        final MediaPlayer suarav = MediaPlayer.create(this,R.raw.hurufv);
        final MediaPlayer suaraw = MediaPlayer.create(this,R.raw.hurufw);
        final MediaPlayer suarax = MediaPlayer.create(this,R.raw.hurufx);
        final MediaPlayer suaray = MediaPlayer.create(this,R.raw.hurufy);
        final MediaPlayer suaraz = MediaPlayer.create(this,R.raw.hurufz);

        ImageButton buttonsuaraa = (ImageButton) this.findViewById(R.id.A);
        ImageButton buttonsuarab = (ImageButton) this.findViewById(R.id.B);
        ImageButton buttonsuarac = (ImageButton) this.findViewById(R.id.C);
        ImageButton buttonsuarad = (ImageButton) this.findViewById(R.id.D);
        ImageButton buttonsuarae = (ImageButton) this.findViewById(R.id.E);
        ImageButton buttonsuaraf = (ImageButton) this.findViewById(R.id.F);
        ImageButton buttonsuarag = (ImageButton) this.findViewById(R.id.G);
        ImageButton buttonsuarah = (ImageButton) this.findViewById(R.id.H);
        ImageButton buttonsuarai = (ImageButton) this.findViewById(R.id.I);
        ImageButton buttonsuaraj = (ImageButton) this.findViewById(R.id.J);
        ImageButton buttonsuarak = (ImageButton) this.findViewById(R.id.K);
        ImageButton buttonsuaral = (ImageButton) this.findViewById(R.id.L);
        ImageButton buttonsuaram = (ImageButton) this.findViewById(R.id.M);
        ImageButton buttonsuaran = (ImageButton) this.findViewById(R.id.N);
        ImageButton buttonsuarao = (ImageButton) this.findViewById(R.id.O);
        ImageButton buttonsuarap = (ImageButton) this.findViewById(R.id.P);
        ImageButton buttonsuaraq = (ImageButton) this.findViewById(R.id.Q);
        ImageButton buttonsuarar = (ImageButton) this.findViewById(R.id.R);
        ImageButton buttonsuaras = (ImageButton) this.findViewById(R.id.S);
        ImageButton buttonsuarat = (ImageButton) this.findViewById(R.id.T);
        ImageButton buttonsuarau = (ImageButton) this.findViewById(R.id.U);
        ImageButton buttonsuarav = (ImageButton) this.findViewById(R.id.V);
        ImageButton buttonsuaraw = (ImageButton) this.findViewById(R.id.W);
        ImageButton buttonsuarax = (ImageButton) this.findViewById(R.id.X);
        ImageButton buttonsuaray = (ImageButton) this.findViewById(R.id.Y);
        ImageButton buttonsuaraz = (ImageButton) this.findViewById(R.id.Z);

        buttonsuaraa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraa.start();
            }
        });

        buttonsuarab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarab.start();
            }
        });

        buttonsuarac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarac.start();
            }
        });

        buttonsuarad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarad.start();
            }
        });

        buttonsuarae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarae.start();
            }
        });

        buttonsuaraf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraf.start();
            }
        });

        buttonsuarag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarag.start();
            }
        });

        buttonsuarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarah.start();
            }
        });

        buttonsuarai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarai.start();
            }
        });

        buttonsuaraj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraj.start();
            }
        });

        buttonsuarak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarak.start();
            }
        });

        buttonsuaral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaral.start();
            }
        });

        buttonsuaram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaram.start();
            }
        });

        buttonsuaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaran.start();
            }
        });

        buttonsuarao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarao.start();
            }
        });

        buttonsuarap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarap.start();
            }
        });

        buttonsuaraq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraq.start();
            }
        });

        buttonsuarar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarar.start();
            }
        });

        buttonsuaras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaras.start();
            }
        });

        buttonsuarat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarat.start();
            }
        });

        buttonsuarau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarau.start();
            }
        });

        buttonsuarav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarav.start();
            }
        });

        buttonsuaraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraw.start();
            }
        });

        buttonsuarax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suarax.start();
            }
        });

        buttonsuaray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaray.start();
            }
        });

        buttonsuaraz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraz.start();
            }
        });

    }
}