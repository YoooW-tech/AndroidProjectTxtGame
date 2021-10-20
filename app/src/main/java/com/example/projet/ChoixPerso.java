package com.example.projet;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class ChoixPerso extends AppCompatActivity {
    RelativeLayout carte1;
    RelativeLayout carte2;
    RelativeLayout carte3;
    RelativeLayout carte4;
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    static String srcimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_perso);

        carte1 = findViewById(R.id.choixcarte1);
        carte2 = findViewById(R.id.choixcarte2);
        carte3 = findViewById(R.id.choixcarte3);
        carte4 = findViewById(R.id.choixcarte4);

        image1 = findViewById(R.id.choiximage1);
        image2 = findViewById(R.id.choiximage2);
        image3 = findViewById(R.id.choiximage3);
        image4 = findViewById(R.id.choiximage4);

        carte1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                srcimage = carte1.getTag().toString();
                openDescription(1);
            }
        });

        carte2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                srcimage = carte2.getTag().toString();
                openDescription(2);
            }
        });

        carte3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                srcimage = carte3.getTag().toString();
                openDescription(3);
            }
        });

        carte4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                srcimage = carte4.getTag().toString();
                openDescription(4);
            }
        });
    }

    private void openDescription(int x)
    {
        switch(x)
        {
            case 1:
                Intent intent1 = new Intent(this, Description.class);
                Pair[] pairs1 = new Pair[2];
                pairs1[0] = new Pair<View, String>(image1, ViewCompat.getTransitionName(image1));
                pairs1[1] = new Pair<View, String>(carte1, ViewCompat.getTransitionName(carte1));
                ActivityOptionsCompat options1 = ActivityOptionsCompat.makeSceneTransitionAnimation(ChoixPerso.this, pairs1);
                startActivity(intent1, options1.toBundle());
                break;
            case 2:
                Intent intent2 = new Intent(this, Description.class);
                Pair[] pairs2 = new Pair[2];
                pairs2[0] = new Pair<View, String>(image2, ViewCompat.getTransitionName(image2));
                pairs2[1] = new Pair<View, String>(carte2, ViewCompat.getTransitionName(carte2));
                ActivityOptionsCompat options2 = ActivityOptionsCompat.makeSceneTransitionAnimation(ChoixPerso.this, pairs2);
                startActivity(intent2, options2.toBundle());
                break;
            case 3:
                Intent intent3 = new Intent(this, Description.class);
                Pair[] pairs3 = new Pair[2];
                pairs3[0] = new Pair<View, String>(image3, ViewCompat.getTransitionName(image3));
                pairs3[1] = new Pair<View, String>(carte3, ViewCompat.getTransitionName(carte3));
                ActivityOptionsCompat options3 = ActivityOptionsCompat.makeSceneTransitionAnimation(ChoixPerso.this, pairs3);
                startActivity(intent3, options3.toBundle());
                break;
            case 4:
                Intent intent4 = new Intent(this, Description.class);
                Pair[] pairs4 = new Pair[2];
                pairs4[0] = new Pair<View, String>(image4, ViewCompat.getTransitionName(image4));
                pairs4[1] = new Pair<View, String>(carte4, ViewCompat.getTransitionName(carte4));
                ActivityOptionsCompat options4 = ActivityOptionsCompat.makeSceneTransitionAnimation(ChoixPerso.this, pairs4);
                startActivity(intent4, options4.toBundle());
                break;
        }
    }
}
