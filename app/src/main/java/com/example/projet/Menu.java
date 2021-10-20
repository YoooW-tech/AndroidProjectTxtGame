package com.example.projet;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Menu extends AppCompatActivity {
    static String username;
    Boolean usershow = Boolean.FALSE;
    RelativeLayout base;
    Button btncont;
    Button btncomm;
    Button btnoption;
    Button btnnewp;
    Button btnquitt;
    Animation animslidedown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout Ll = findViewById(R.id.username);
        Ll.setAlpha(0.0f);
        base = findViewById(R.id.rootmenu);
        btncont = (Button) findViewById(R.id.menubouton1);
        btnnewp = (Button) findViewById(R.id.menubouton2);
        btncomm = findViewById(R.id.btncomm);
        btnoption = findViewById(R.id.menubouton3);
        btnquitt = findViewById(R.id.menubouton4);
        animslidedown = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
        btncomm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!(((EditText) findViewById(R.id.usernametxt)).getText().toString().matches("")))
                {
                    username = ((EditText) findViewById(R.id.usernametxt)).getText().toString();
                    //msgbox(username);
                    openActivity2();
                }
            }
        });

        btnnewp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!usershow)
                    showUsernameTxt();
            }
        });

        base.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usershow)
                    hideUsernameTxt();
            }
        });

        btnoption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOption();
            }
        });

        btnquitt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
    private void hideUsernameTxt()
    {
        usershow = Boolean.FALSE;
        RelativeLayout rlb = findViewById(R.id.menuboutonlayout);
        rlb.startAnimation(animslidedown);
        ObjectAnimator animY = ObjectAnimator.ofFloat(rlb, "Y", 1200f);
        animY.setDuration(500);
        animY.start();
        RelativeLayout Ll = findViewById(R.id.username);
        TranslateAnimation animate = new TranslateAnimation(0,-Ll.getWidth(),0,0);
        animate.setDuration(500);
        Ll.animate().alpha(0.0f);
        Ll.startAnimation(animate);
        Ll.setVisibility(View.INVISIBLE);
    }

    private void showUsernameTxt()
    {
        usershow = Boolean.TRUE;
        RelativeLayout rlb = findViewById(R.id.menuboutonlayout);
        rlb.startAnimation(animslidedown);
        ObjectAnimator animY = ObjectAnimator.ofFloat(rlb, "y", 1400f);
        animY.setDuration(500);
        animY.start();
        RelativeLayout Ll = findViewById(R.id.username);
        TranslateAnimation animate = new TranslateAnimation(-Ll.getWidth(),0,0,0);
        animate.setDuration(500);
        Ll.animate().alpha(1.0f);
        animate.setFillAfter(true);
        Ll.startAnimation(animate);
        Ll.setVisibility(View.VISIBLE);
    }

    private void openActivity2()
    {
        Intent intent = new Intent(this, ChoixPerso.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    private void openOption()
    {
        Intent intent = new Intent(this, Option.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
