package com.example.projet;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.*;

public class Game extends AppCompatActivity {

    String d;
    TypedArray listb;
    static int idpanel;
    String[][] boutons;
    String[][] elems;
    TypedArray listelems;
    RelativeLayout titrejeu;
    RelativeLayout histjeu;
    LinearLayout rootgame;
    Button btngrid1;
    Button btngrid2;
    Button btngrid3;
    Button btngrid4;
    TextView txttitrejeu;
    TextView txthistjeu;
    GridLayout btngrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        d = ChoixPerso.srcimage; //tag
        titrejeu = findViewById(R.id.titrejeu);
        histjeu = findViewById(R.id.histjeu);
        rootgame = findViewById(R.id.rootgame);
        rootgame.animate().alpha(1.0F);
        rootgame.animate().setDuration(2000);
        btngrid1 = findViewById(R.id.btngrid1);
        btngrid2 = findViewById(R.id.btngrid2);
        btngrid3 = findViewById(R.id.btngrid3);
        btngrid4 = findViewById(R.id.btngrid4);
        btngrid = findViewById(R.id.gridbuton);
        txttitrejeu = findViewById(R.id.txttitrejeu);
        txthistjeu = findViewById(R.id.txthistjeu);

        btngrid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameBis(1);
                idpanel += 1;
            }
        });

        btngrid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameBis(2);
                idpanel += 2;
            }
        });

        btngrid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameBis(3);
                idpanel += 3;
            }
        });

        btngrid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameBis(4);
                idpanel += 4;
            }
        });

        switch (d)
        {
            case "dwarf":
                // Récupèrer boutons
                listb = getResources().obtainTypedArray(R.array.boutonnain);
                int nbbouton1 = listb.length();
                boutons = new String[nbbouton1][];
                for (int i = 0; i< nbbouton1; i++)
                {
                    int id = listb.getResourceId(i, 0);
                    if(id>0)
                    {
                        boutons[i] = getResources().getStringArray(id);
                    }
                }
                listb.recycle();
                //
                listelems = getResources().obtainTypedArray(R.array.nain);
                int taillelem1 = listelems.length();
                elems = new String[taillelem1][];
                for (int i = 0; i< taillelem1; i++)
                {
                    int id = listelems.getResourceId(i, 0);
                    if(id>0)
                    {
                        elems[i] = getResources().getStringArray(id);
                    }
                }
                listelems.recycle();
                //
                if(Gamebis.idpanelbis != 0)
                {
                    idpanel = Gamebis.idpanelbis;
                    creerboutons(boutons[idpanel].length);
                }
                else {
                    creerboutons(boutons[0].length);
                    idpanel = 0;
                }
                rootgame.setBackground(getResources().getDrawable(R.drawable.chateau_forge));
                break;
            case "dryad":
                // Récupèrer boutons
                listb = getResources().obtainTypedArray(R.array.boutondryad);
                int nbbouton2 = listb.length();
                boutons = new String[nbbouton2][];
                for (int i = 0; i< nbbouton2; i++)
                {
                    int id = listb.getResourceId(i, 0);
                    if(id>0)
                    {
                        boutons[i] = getResources().getStringArray(id);
                    }
                }
                listb.recycle();
                //
                listelems = getResources().obtainTypedArray(R.array.dryade);
                int taillelem2 = listelems.length();
                elems = new String[taillelem2][];
                for (int i = 0; i< taillelem2; i++)
                {
                    int id = listelems.getResourceId(i, 0);
                    if(id>0)
                    {
                        elems[i] = getResources().getStringArray(id);
                    }
                }
                listelems.recycle();
                //
                if(Gamebis.idpanelbis != 0)
                {
                    idpanel = Gamebis.idpanelbis;
                    creerboutons(boutons[idpanel].length);
                }
                else
                {
                    creerboutons(boutons[0].length);
                    idpanel = 0;
                }
                rootgame.setBackground(getResources().getDrawable(R.drawable.background_souche));
                break;
            case "elf":
                // Récupèrer boutons
                listb = getResources().obtainTypedArray(R.array.boutonelf);
                int nbbouton3 = listb.length();
                boutons = new String[nbbouton3][];
                for (int i = 0; i< nbbouton3; i++)
                {
                    int id = listb.getResourceId(i, 0);
                    if(id>0)
                    {
                        boutons[i] = getResources().getStringArray(id);
                    }
                }
                listb.recycle();
                //
                listelems = getResources().obtainTypedArray(R.array.elfe);
                int taillelem3 = listelems.length();
                elems = new String[taillelem3][];
                for (int i = 0; i< taillelem3; i++)
                {
                    int id = listelems.getResourceId(i, 0);
                    if(id>0)
                    {
                        elems[i] = getResources().getStringArray(id);
                    }
                }
                listelems.recycle();
                //
                if(Gamebis.idpanelbis != 0)
                {
                    idpanel = Gamebis.idpanelbis;
                    creerboutons(boutons[idpanel].length);
                }
                else
                {
                    creerboutons(boutons[0].length);
                    idpanel = 0;
                }
                rootgame.setBackground(getResources().getDrawable(R.drawable.background_elf));
                break;
            case "human":
                // Récupèrer boutons
                listb = getResources().obtainTypedArray(R.array.boutonhumain);
                int nbbouton4 = listb.length();
                boutons = new String[nbbouton4][];
                for (int i = 0; i< nbbouton4; i++)
                {
                    int id = listb.getResourceId(i, 0);
                    if(id>0)
                    {
                        boutons[i] = getResources().getStringArray(id);
                    }
                }
                listb.recycle();
                //
                listelems = getResources().obtainTypedArray(R.array.humain);
                int taillelem4 = listelems.length();
                elems = new String[taillelem4][];
                for (int i = 0; i< taillelem4; i++)
                {
                    int id = listelems.getResourceId(i, 0);
                    if(id>0)
                    {
                        elems[i] = getResources().getStringArray(id);
                    }
                }
                listelems.recycle();
                //
                if(Gamebis.idpanelbis != 0)
                {
                    idpanel = Gamebis.idpanelbis;
                    creerboutons(boutons[idpanel].length);
                }
                else
                {
                    creerboutons(boutons[0].length);
                    idpanel = 0;
                }
                rootgame.setBackground(getResources().getDrawable(R.drawable.background_human));
                break;
        }
    }

    private void creerboutons(int i)
    {
        TranslateAnimation animate1 = new TranslateAnimation(-1200,0,0,0);
        switch (i)
        {
            case 1:
                GridLayout.LayoutParams params1a = new GridLayout.LayoutParams(btngrid1.getLayoutParams());
                params1a.bottomMargin = 5;
                params1a.rightMargin = 40;
                params1a.leftMargin = 40;
                params1a.rowSpec = GridLayout.spec(0, 1, 1f);
                params1a.columnSpec = GridLayout.spec(0, 2, 2f);
                btngrid2.setVisibility(View.GONE);
                btngrid1.setLayoutParams(params1a);
                btngrid3.setVisibility(View.GONE);
                animate1.setDuration(1000);
                animate1.setFillAfter(true);
                titrejeu.startAnimation(animate1);
                histjeu.startAnimation(animate1);
                btngrid.startAnimation(animate1);
                txttitrejeu.setText(elems[idpanel][0]);
                txthistjeu.setText(elems[idpanel][1]);
                btngrid1.setText(boutons[idpanel][0]);
                break;
            case 2:
                GridLayout.LayoutParams paramsb1 = new GridLayout.LayoutParams(btngrid1.getLayoutParams());
                paramsb1.bottomMargin = 5;
                paramsb1.rightMargin = 40;
                paramsb1.leftMargin = 40;
                paramsb1.rowSpec = GridLayout.spec(0, 1, 1f);
                paramsb1.columnSpec = GridLayout.spec(0, 2, 2f);
                GridLayout.LayoutParams paramsb2 = new GridLayout.LayoutParams(btngrid3.getLayoutParams());
                paramsb2.bottomMargin = 5;
                paramsb2.rightMargin = 40;
                paramsb2.leftMargin = 40;
                paramsb2.rowSpec = GridLayout.spec(1, 1, 1f);
                paramsb2.columnSpec = GridLayout.spec(0, 2, 2f);
                btngrid2.setVisibility(View.GONE);
                btngrid1.setLayoutParams(paramsb1);
                btngrid3.setLayoutParams(paramsb2);
                animate1.setDuration(1000);
                animate1.setFillAfter(true);
                titrejeu.startAnimation(animate1);
                histjeu.startAnimation(animate1);
                btngrid.startAnimation(animate1);
                txttitrejeu.setText(elems[idpanel][0]);
                txthistjeu.setText(elems[idpanel][1]);
                btngrid1.setText(boutons[idpanel][0]);
                btngrid3.setText(boutons[idpanel][1]);
                break;
            case 3:
                GridLayout.LayoutParams paramsc1 = new GridLayout.LayoutParams(btngrid3.getLayoutParams());
                paramsc1.bottomMargin = 5;
                paramsc1.rightMargin = 40;
                paramsc1.leftMargin = 40;
                paramsc1.rowSpec = GridLayout.spec(1, 1, 1f);
                paramsc1.columnSpec = GridLayout.spec(0, 2, 2f);
                btngrid3.setLayoutParams(paramsc1);
                animate1.setDuration(1000);
                animate1.setFillAfter(true);
                titrejeu.startAnimation(animate1);
                histjeu.startAnimation(animate1);
                btngrid.startAnimation(animate1);
                txttitrejeu.setText(elems[idpanel][0]);
                txthistjeu.setText(elems[idpanel][1]);
                btngrid1.setText(boutons[idpanel][0]);
                btngrid3.setText(boutons[idpanel][2]);
                btngrid2.setText(boutons[idpanel][1]);
                break;
            case 4:
                btngrid4.setVisibility(View.VISIBLE);
                animate1.setDuration(1000);
                animate1.setFillAfter(true);
                titrejeu.startAnimation(animate1);
                histjeu.startAnimation(animate1);
                btngrid.startAnimation(animate1);
                txttitrejeu.setText(elems[idpanel][0]);
                txthistjeu.setText(elems[idpanel][1]);
                btngrid1.setText(boutons[idpanel][0]);
                btngrid3.setText(boutons[idpanel][2]);
                btngrid2.setText(boutons[idpanel][1]);
                btngrid4.setText(boutons[idpanel][3]);
                break;
        }
    }

    void openGameBis(int d)
    {
        if(d==1)
        {
            TranslateAnimation animate1 = new TranslateAnimation(0,1200,0,0);
            animate1.setDuration(1000);
            animate1.setFillAfter(true);
            titrejeu.startAnimation(animate1);
            histjeu.startAnimation(animate1);
            btngrid.startAnimation(animate1);
            btngrid.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(Game.this, Gamebis.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }, 1000);
        }
        if(d==2)
        {
            TranslateAnimation animate1 = new TranslateAnimation(0,1200,0,0);
            animate1.setDuration(1000);
            animate1.setFillAfter(true);
            titrejeu.startAnimation(animate1);
            histjeu.startAnimation(animate1);
            btngrid.startAnimation(animate1);
            btngrid.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(Game.this, Gamebis.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }, 1000);
        }
        if(d==3)
        {
            TranslateAnimation animate1 = new TranslateAnimation(0,1200,0,0);
            animate1.setDuration(1000);
            animate1.setFillAfter(true);
            titrejeu.startAnimation(animate1);
            histjeu.startAnimation(animate1);
            btngrid.startAnimation(animate1);
            btngrid.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(Game.this, Gamebis.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }, 1000);
        }
        if(d==4)
        {
            TranslateAnimation animate1 = new TranslateAnimation(0,1200,0,0);
            animate1.setDuration(1000);
            animate1.setFillAfter(true);
            titrejeu.startAnimation(animate1);
            histjeu.startAnimation(animate1);
            btngrid.startAnimation(animate1);
            btngrid.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(Game.this, Gamebis.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }, 1000);
        }
    }
}
