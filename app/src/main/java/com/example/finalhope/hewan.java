package com.example.finalhope;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.UserManager;
import android.view.View;
import android.widget.ImageButton;

public class hewan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan);

        final MediaPlayer suara0 = MediaPlayer.create(this,R.raw.anjing);
        final MediaPlayer suara1 = MediaPlayer.create(this,R.raw.ayam);
        final MediaPlayer suara2 = MediaPlayer.create(this,R.raw.buaya);
        final MediaPlayer suara3 = MediaPlayer.create(this,R.raw.cacing);
        final MediaPlayer suara4 = MediaPlayer.create(this,R.raw.cumi2);
        final MediaPlayer suara5 = MediaPlayer.create(this,R.raw.domba);
        final MediaPlayer suara6 = MediaPlayer.create(this,R.raw.elang);
        final MediaPlayer suara7 = MediaPlayer.create(this,R.raw.flamingo);
        final MediaPlayer suara8 = MediaPlayer.create(this,R.raw.gajah);
        final MediaPlayer suara9 = MediaPlayer.create(this,R.raw.harimau);
        final MediaPlayer suara10 = MediaPlayer.create(this,R.raw.ikan);
        final MediaPlayer suara11 = MediaPlayer.create(this,R.raw.jerapah);
        final MediaPlayer suara12 = MediaPlayer.create(this,R.raw.katak);
        final MediaPlayer suara13 = MediaPlayer.create(this,R.raw.kucing);
        final MediaPlayer suara14 = MediaPlayer.create(this,R.raw.kuda);
        final MediaPlayer suara15 = MediaPlayer.create(this,R.raw.lalat);
        final MediaPlayer suara16 = MediaPlayer.create(this,R.raw.lebah);
        final MediaPlayer suara17 = MediaPlayer.create(this,R.raw.monyet);
        final MediaPlayer suara18 = MediaPlayer.create(this,R.raw.nyamuk);
        final MediaPlayer suara19 = MediaPlayer.create(this,R.raw.orangutan);
        final MediaPlayer suara20 = MediaPlayer.create(this,R.raw.panda);
        final MediaPlayer suara21 = MediaPlayer.create(this,R.raw.pinguin);
        final MediaPlayer suara22 = MediaPlayer.create(this,R.raw.quail);
        final MediaPlayer suara23 = MediaPlayer.create(this,R.raw.rubah);
        final MediaPlayer suara24 = MediaPlayer.create(this,R.raw.rusa);
        final MediaPlayer suara25 = MediaPlayer.create(this,R.raw.sapi);
        final MediaPlayer suara26 = MediaPlayer.create(this,R.raw.serigala);
        final MediaPlayer suara27 = MediaPlayer.create(this,R.raw.singa);
        final MediaPlayer suara28 = MediaPlayer.create(this,R.raw.tikus);
        final MediaPlayer suara29 = MediaPlayer.create(this,R.raw.tupai);
        final MediaPlayer suara30 = MediaPlayer.create(this,R.raw.unta);
        final MediaPlayer suara31 = MediaPlayer.create(this,R.raw.vicuna);
        final MediaPlayer suara32 = MediaPlayer.create(this,R.raw.xantus);
        final MediaPlayer suara33 = MediaPlayer.create(this,R.raw.sapi);
        final MediaPlayer suara34 = MediaPlayer.create(this,R.raw.zebra);

        ImageButton buttonsuara0 = (ImageButton) this.findViewById(R.id.anjing);
        ImageButton buttonsuara1 = (ImageButton) this.findViewById(R.id.ayam);
        ImageButton buttonsuara2 = (ImageButton) this.findViewById(R.id.buaya);
        ImageButton buttonsuara3 = (ImageButton) this.findViewById(R.id.cacing);
        ImageButton buttonsuara4 = (ImageButton) this.findViewById(R.id.cumi);
        ImageButton buttonsuara5 = (ImageButton) this.findViewById(R.id.domba);
        ImageButton buttonsuara6 = (ImageButton) this.findViewById(R.id.elang);
        ImageButton buttonsuara7 = (ImageButton) this.findViewById(R.id.flamingo);
        ImageButton buttonsuara8 = (ImageButton) this.findViewById(R.id.gajah);
        ImageButton buttonsuara9 = (ImageButton) this.findViewById(R.id.harimau);
        ImageButton buttonsuara10 = (ImageButton) this.findViewById(R.id.ikan);
        ImageButton buttonsuara11 = (ImageButton) this.findViewById(R.id.jerapah);
        ImageButton buttonsuara12 = (ImageButton) this.findViewById(R.id.katak);
        ImageButton buttonsuara13 = (ImageButton) this.findViewById(R.id.kucing);
        ImageButton buttonsuara14 = (ImageButton) this.findViewById(R.id.kuda);
        ImageButton buttonsuara15 = (ImageButton) this.findViewById(R.id.lalat);
        ImageButton buttonsuara16 = (ImageButton) this.findViewById(R.id.lebah);
        ImageButton buttonsuara17 = (ImageButton) this.findViewById(R.id.monyet);
        ImageButton buttonsuara18 = (ImageButton) this.findViewById(R.id.nyamuk);
        ImageButton buttonsuara19 = (ImageButton) this.findViewById(R.id.orangutan);
        ImageButton buttonsuara20 = (ImageButton) this.findViewById(R.id.panda);
        ImageButton buttonsuara21 = (ImageButton) this.findViewById(R.id.pinguin);
        ImageButton buttonsuara22 = (ImageButton) this.findViewById(R.id.quail);
        ImageButton buttonsuara23 = (ImageButton) this.findViewById(R.id.rubah);
        ImageButton buttonsuara24 = (ImageButton) this.findViewById(R.id.rusa);
        ImageButton buttonsuara25 = (ImageButton) this.findViewById(R.id.sapi);
        ImageButton buttonsuara26 = (ImageButton) this.findViewById(R.id.serigala);
        ImageButton buttonsuara27 = (ImageButton) this.findViewById(R.id.singa);
        ImageButton buttonsuara28 = (ImageButton) this.findViewById(R.id.tikus);
        ImageButton buttonsuara29 = (ImageButton) this.findViewById(R.id.tupai);
        ImageButton buttonsuara30 = (ImageButton) this.findViewById(R.id.unta);
        ImageButton buttonsuara31 = (ImageButton) this.findViewById(R.id.vicuna);
        ImageButton buttonsuara32 = (ImageButton) this.findViewById(R.id.xantus);
        ImageButton buttonsuara33 = (ImageButton) this.findViewById(R.id.yak);
        ImageButton buttonsuara34 = (ImageButton) this.findViewById(R.id.zebra);

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

        buttonsuara11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara11.start();
            }
        });

        buttonsuara12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara12.start();
            }
        });

        buttonsuara13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara13.start();
            }
        });

        buttonsuara14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara14.start();
            }
        });

        buttonsuara15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara15.start();
            }
        });

        buttonsuara16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara16.start();
            }
        });

        buttonsuara17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara17.start();
            }
        });

        buttonsuara18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara18.start();
            }
        });

        buttonsuara19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara19.start();
            }
        });

        buttonsuara20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara20.start();
            }
        });

        buttonsuara21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara21.start();
            }
        });

        buttonsuara22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara22.start();
            }
        });

        buttonsuara23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara23.start();
            }
        });

        buttonsuara24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara24.start();
            }
        });

        buttonsuara25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara25.start();
            }
        });

        buttonsuara26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara26.start();
            }
        });

        buttonsuara27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara27.start();
            }
        });

        buttonsuara28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara28.start();
            }
        });

        buttonsuara29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara29.start();
            }
        });

        buttonsuara30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara30.start();
            }
        });

        buttonsuara31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara31.start();
            }
        });

        buttonsuara32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara32.start();
            }
        });


        buttonsuara33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara33.start();
            }
        });

        buttonsuara34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suara34.start();
            }
        });



    }
}