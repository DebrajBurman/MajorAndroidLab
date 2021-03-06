package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  static int Splash_Screen=5000;
    //Variables
    Animation topAnim, bottomAnim;
    ImageView logo;
    TextView motto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);
        //Animations
        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //Hooks
        logo=findViewById(R.id.Logo);
//      appname=findViewById(R.id.AppName);
        motto=findViewById(R.id.Motto);


        logo.setAnimation(topAnim);
//      appname.setAnimation(bottomAnim);
        motto.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this, LoginPage.class);
                startActivity(intent);
                finish();
            }
        },Splash_Screen);
    }
}