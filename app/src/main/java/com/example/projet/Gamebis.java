package com.example.projet;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Gamebis extends AppCompatActivity {

    String d;
    static int idpanelbis = 0;
    static TypedArray listbbis;
    String[][] boutonsbis;
    String[][] elemsbis;
    TypedArray listelemsbis;
    RelativeLayout titrejeubis;
    RelativeLayout histjeubis;
    LinearLayout rootgamebis;
    Button btngridbis1;
    Button btngridbis2;
    Button btngridbis3;
    Button btngridbis4;
    TextView txttitrejeu;
    TextView txthistjeu;
    GridLayout btngridbis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamebis);
        d = ChoixPerso.srcimage; //tag
        titrejeubis = findViewById(R.id.titrejeubis);
        histjeubis = findViewById(R.id.histjeubis);
        rootgamebis = findViewById(R.id.rootgamebis);
        rootgamebis.animate().alpha(1.0F);
        rootgamebis.animate().setDuration(2000);
        btngridbis1 = findViewById(R.id.btngridbis1);
        btngridbis2 = findViewById(R.id.btngridbis2);
        btngridbis3 = findViewById(R.id.btngridbis3);
        btngridbis4 = findViewById(R.id.btngridbis4);
        btngridbis = findViewById(R.id.gridbutonbis);
        txttitrejeu = findViewById(R.id.txttitrejeubis);
        txthistjeu = findViewById(R.id.txthistjeubis);

        btngridbis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame(1);
                idpanelbis += 1;
            }
        });

        btngridbis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame(2);
                idpanelbis += 2;
            }
        });

        btngridbis3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame(3);
                idpanelbis += 3;
            }
        });

        btngridbis4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame(4);
                idpanelbis += 4;
            }
        });

        switch (d)
        {
            case "dwarf":
                // Récupèrer boutons
                listbbis = getResources().obtainTypedArray(R.array.boutonnain);
                int nbbouton1 = listbbis.length();
                boutonsbis = new String[nbbouton1][];
                for (int i = 0; i< nbbouton1; i++)
                {
                    int id = listbbis.getResourceId(i, 0);
                    if(id>0)
                    {
                        boutonsbis[i] = getResources().getStringArray(id);
                    }
                }
                listbbis.recycle();
                //
                listelemsbis = getResources().obtainTypedArray(R.array.nain);
                int taillelem1 = listelemsbis.length();
                elemsbis = new String[taillelem1][];
                for (int i = 0; i< taillelem1; i++)
                {
                    int id = listelemsbis.getResourceId(i, 0);
                    if(id>0)
                    {
                        elemsbis[i] = getResources().getStringArray(id);
                    }
                }
                listelemsbis.recycle();
                //
                idpanelbis = Game.idpanel;
                creerboutons(boutonsbis[idpanelbis].length);
                rootgamebis.setBackground(getResources().getDrawable(R.drawable.chateau_forge));
                break;
            case "dryad":
                // Récupèrer boutons
                listbbis = getResources().obtainTypedArray(R.array.boutondryad);
                int nbbouton2 = listbbis.length();
                boutonsbis = new String[nbbouton2][];
                for (int i = 0; i< nbbouton2; i++)
                {
                    int id = listbbis.getResourceId(i, 0);
                    if(id>0)
                    {
                        boutonsbis[i] = getResources().getStringArray(id);
                    }
                }
                listbbis.recycle();
                //
                listelemsbis = getResources().obtainTypedArray(R.array.dryade);
                int taillelem2 = listelemsbis.length();
                elemsbis = new String[taillelem2][];
                for (int i = 0; i< taillelem2; i++)
                {
                    int id = listelemsbis.getResourceId(i, 0);
                    if(id>0)
                    {
                        elemsbis[i] = getResources().getStringArray(id);
                    }
                }
                listelemsbis.recycle();
                //
                idpanelbis = Game.idpanel;
                creerboutons(boutonsbis[idpanelbis].length);
                rootgamebis.setBackground(getResources().getDrawable(R.drawable.background_souche));
                break;
            case "elf":
                // Récupèrer boutons
                listbbis = getResources().obtainTypedArray(R.array.boutonelf);
                int nbbouton3 = listbbis.length();
                boutonsbis = new String[nbbouton3][];
                for (int i = 0; i< nbbouton3; i++)
                {
                    int id = listbbis.getResourceId(i, 0);
                    if(id>0)
                    {
                        boutonsbis[i] = getResources().getStringArray(id);
                    }
                }
                listbbis.recycle();
                //
                listelemsbis = getResources().obtainTypedArray(R.array.elfe);
                int taillelem3 = listelemsbis.length();
                elemsbis = new String[taillelem3][];
                for (int i = 0; i< taillelem3; i++)
                {
                    int id = listelemsbis.getResourceId(i, 0);
                    if(id>0)
                    {
                        elemsbis[i] = getResources().getStringArray(id);
                    }
                }
                listelemsbis.recycle();
                //
                idpanelbis = Game.idpanel;
                creerboutons(boutonsbis[idpanelbis].length);
                rootgamebis.setBackground(getResources().getDrawable(R.drawable.background_elf));
                break;
            case "human":
                // Récupèrer boutons
                listbbis = getResources().obtainTypedArray(R.array.boutonhumain);
                int nbbouton4 = listbbis.length();
                boutonsbis = new String[nbbouton4][];
                for (int i = 0; i< nbbouton4; i++)
                {
                    int id = listbbis.getResourceId(i, 0);
                    if(id>0)
                    {
                        boutonsbis[i] = getResources().getStringArray(id);
                    }
                }
                listbbis.recycle();
                //
                listelemsbis = getResources().obtainTypedArray(R.array.humain);
                int taillelem4 = listelemsbis.length();
                elemsbis = new String[taillelem4][];
                for (int i = 0; i< taillelem4; i++)
                {
                    int id = listelemsbis.getResourceId(i, 0);
                    if(id>0)
                    {
                        elemsbis[i] = getResources().getStringArray(id);
                    }
                }
                listelemsbis.recycle();
                //
                idpanelbis = Game.idpanel;
                creerboutons(boutonsbis[idpanelbis].length);
                rootgamebis.setBackground(getResources().getDrawable(R.drawable.background_human));
                break;
        }
    }

    private void creerboutons(int i)
    {
        TranslateAnimation animate1 = new TranslateAnimation(-1200,0,0,0);
        switch (i)
        {
            case 1:
                GridLayout.LayoutParams params1a = new GridLayout.LayoutParams(btngridbis1.getLayoutParams());
                params1a.bottomMargin = 5;
                params1a.rightMargin = 40;
                params1a.leftMargin = 40;
                params1a.rowSpec = GridLayout.spec(0, 1, 1f);
                params1a.columnSpec = GridLayout.spec(0, 2, 2f);
                btngridbis2.setVisibility(View.GONE);
                btngridbis1.setLayoutParams(params1a);
                btngridbis3.setVisibility(View.GONE);
                animate1.setDuration(1000);
                animate1.setFillAfter(true);
                titrejeubis.startAnimation(animate1);
                histjeubis.startAnimation(animate1);
                btngridbis.startAnimation(animate1);
                txttitrejeu.setText(elemsbis[idpanelbis][0]);
                txthistjeu.setText(elemsbis[idpanelbis][1]);
                btngridbis1.setText(boutonsbis[idpanelbis][0]);
                break;
            case 2:
                GridLayout.LayoutParams paramsb1 = new GridLayout.LayoutParams(btngridbis1.getLayoutParams());
                paramsb1.bottomMargin = 5;
                paramsb1.rightMargin = 40;
                paramsb1.leftMargin = 40;
                paramsb1.rowSpec = GridLayout.spec(0, 1, 1f);
                paramsb1.columnSpec = GridLayout.spec(0, 2, 2f);
                GridLayout.LayoutParams paramsb2 = new GridLayout.LayoutParams(btngridbis3.getLayoutParams());
                paramsb2.bottomMargin = 5;
                paramsb2.rightMargin = 40;
                paramsb2.leftMargin = 40;
                paramsb2.rowSpec = GridLayout.spec(1, 1, 1f);
                paramsb2.columnSpec = GridLayout.spec(0, 2, 2f);
                btngridbis2.setVisibility(View.GONE);
                btngridbis1.setLayoutParams(paramsb1);
                btngridbis3.setLayoutParams(paramsb2);
                animate1.setDuration(1000);
                animate1.setFillAfter(true);
                titrejeubis.startAnimation(animate1);
                histjeubis.startAnimation(animate1);
                btngridbis.startAnimation(animate1);
                txttitrejeu.setText(elemsbis[idpanelbis][0]);
                txthistjeu.setText(elemsbis[idpanelbis][1]);
                btngridbis1.setText(boutonsbis[idpanelbis][0]);
                btngridbis3.setText(boutonsbis[idpanelbis][2]);
                break;
            case 3:
                GridLayout.LayoutParams paramsc1 = new GridLayout.LayoutParams(btngridbis3.getLayoutParams());
                paramsc1.bottomMargin = 5;
                paramsc1.rightMargin = 40;
                paramsc1.leftMargin = 40;
                paramsc1.rowSpec = GridLayout.spec(1, 1, 1f);
                paramsc1.columnSpec = GridLayout.spec(0, 2, 2f);
                btngridbis3.setLayoutParams(paramsc1);
                animate1.setDuration(1000);
                animate1.setFillAfter(true);
                titrejeubis.startAnimation(animate1);
                histjeubis.startAnimation(animate1);
                btngridbis.startAnimation(animate1);
                txttitrejeu.setText(elemsbis[idpanelbis][0]);
                txthistjeu.setText(elemsbis[idpanelbis][1]);
                btngridbis1.setText(boutonsbis[idpanelbis][0]);
                btngridbis3.setText(boutonsbis[idpanelbis][2]);
                btngridbis2.setText(boutonsbis[idpanelbis][1]);
                break;
            case 4:
                btngridbis4.setVisibility(View.VISIBLE);
                animate1.setDuration(1000);
                animate1.setFillAfter(true);
                titrejeubis.startAnimation(animate1);
                histjeubis.startAnimation(animate1);
                btngridbis.startAnimation(animate1);
                txttitrejeu.setText(elemsbis[idpanelbis][0]);
                txthistjeu.setText(elemsbis[idpanelbis][1]);
                btngridbis1.setText(boutonsbis[idpanelbis][0]);
                btngridbis3.setText(boutonsbis[idpanelbis][2]);
                btngridbis2.setText(boutonsbis[idpanelbis][1]);
                btngridbis4.setText(boutonsbis[idpanelbis][3]);
                break;
        }
    }

    void openGame(int d)
    {
        if(d==1)
        {
            TranslateAnimation animate1 = new TranslateAnimation(0,1200,0,0);
            animate1.setDuration(1000);
            animate1.setFillAfter(true);
            titrejeubis.startAnimation(animate1);
            histjeubis.startAnimation(animate1);
            btngridbis.startAnimation(animate1);
            btngridbis.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(Gamebis.this, Game.class);
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
            titrejeubis.startAnimation(animate1);
            histjeubis.startAnimation(animate1);
            btngridbis.startAnimation(animate1);
            btngridbis.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(Gamebis.this, Game.class);
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
            titrejeubis.startAnimation(animate1);
            histjeubis.startAnimation(animate1);
            btngridbis.startAnimation(animate1);
            btngridbis.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(Gamebis.this, Game.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }, 1000);
        }
        if(d==4)
        {
            btngridbis2.setText("swag");
            TranslateAnimation animate1 = new TranslateAnimation(0,1200,0,0);
            animate1.setDuration(1000);
            animate1.setFillAfter(true);
            titrejeubis.startAnimation(animate1);
            histjeubis.startAnimation(animate1);
            btngridbis.startAnimation(animate1);
            btngridbis.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(Gamebis.this, Game.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }, 1000);
        }
    }
}
