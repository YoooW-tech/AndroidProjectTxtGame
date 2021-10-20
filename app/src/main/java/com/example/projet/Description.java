package com.example.projet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Description extends AppCompatActivity {

    String d;
    ImageView img;
    String prenom;
    String race;
    String age;
    Button btnvalid;
    TextView txtnom;
    TextView txtrace;
    TextView txtage;
    TextView txthist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        txtnom = findViewById(R.id.txtnom);
        txtrace = findViewById(R.id.txtrace);
        txtage = findViewById(R.id.txtage);
        txthist = findViewById(R.id.txthist);
        btnvalid = findViewById(R.id.btnvalid);
        img = findViewById(R.id.imgdesc);
        d = ChoixPerso.srcimage;
        switch (d)
        {
            case "dwarf":
                img.setImageDrawable(getResources().getDrawable(R.drawable.nain_miniature));
                prenom = getResources().getString(R.string.namedwarf);
                race = getResources().getString(R.string.racedwarf);
                age = getResources().getString(R.string.agedwarf);
                txtnom.setText("Prénom : " + prenom);
                txtage.setText("Âge : " + age);
                txtrace.setText("Race : " + race);
                txthist.setText(R.string.histdwarf);
                txthist.setMovementMethod(new ScrollingMovementMethod());
                btnvalid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Description.this, Game.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                    }
                });
                break;
            case "dryad":
                img.setImageDrawable(getResources().getDrawable(R.drawable.dryade_miniature));
                prenom = getResources().getString(R.string.namedryad);
                race = getResources().getString(R.string.racedryad);
                age = getResources().getString(R.string.agedryad);
                txtnom.setText("Prénom : " + prenom);
                txtage.setText("Âge : " + age);
                txtrace.setText("Race : " + race);
                txthist.setText(R.string.histdryad);
                txthist.setMovementMethod(new ScrollingMovementMethod());
                btnvalid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Description.this, Game.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                    }
                });
                break;
            case "elf":
                img.setImageDrawable(getResources().getDrawable(R.drawable.elfeclem2));
                prenom = getResources().getString(R.string.nameelf);
                race = getResources().getString(R.string.raceelf);
                age = getResources().getString(R.string.ageelf);
                txtnom.setText("Prénom : " + prenom);
                txtage.setText("Âge : " + age);
                txtrace.setText("Race : " + race);
                txthist.setText(R.string.histelf);
                txthist.setMovementMethod(new ScrollingMovementMethod());
                btnvalid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Description.this, Game.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                    }
                });
                break;
            case "human":
                img.setImageDrawable(getResources().getDrawable(R.drawable.humain));
                prenom = getResources().getString(R.string.namehuman);
                race = getResources().getString(R.string.racehuman);
                age = getResources().getString(R.string.agehuman);
                txtnom.setText("Prénom : " + prenom);
                txtage.setText("Âge : " + age);
                txtrace.setText("Race : " + race);
                txthist.setText(R.string.histhuman);
                txthist.setMovementMethod(new ScrollingMovementMethod());
                btnvalid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Description.this, Game.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                    }
                });
                break;
        }

        //final ImageButton retour = findViewById(R.id.btnretour);
        //retour.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //finishAfterTransition();
        //    }
        //});
    }
}
