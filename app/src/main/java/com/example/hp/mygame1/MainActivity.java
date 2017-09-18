package com.example.hp.mygame1;

import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    // Screen Size
    private int screenWidth;
    private int screenHeight;

    // Images
    private ImageView arrowUp;

    //position
    private float arrowUpX;
    private float arrowUpY;

    //Classes
    private Handler handler= new Handler();
    private Timer timer = new Timer();

    private static final String TAG = "Myuol";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrowUp=(ImageView)findViewById(R.id.arrow_up);
        // get Screen Size
        WindowManager wm = getWindowManager();
        Display display=wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        screenWidth=size.x;
        screenHeight=size.y;

        Log.d(TAG, "onCreate is called");

        // Move to Out of Screen
   /*     arrowUp.setX(-80.0f);
        arrowUp.setY(-80.0f);*/

        // start timer
    /*    timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        changepos();
                    }
                });
            }
        },0,20);
        */

    }
    public void changepos(){
        // Up
        arrowUpY -=10;
        if(arrowUp.getY()+arrowUp.getHeight()<0){
            arrowUpX=(float)Math.floor(Math.random()*(screenWidth-arrowUp.getWidth()));
            arrowUpY= screenHeight+100.0f;
        }
        arrowUp.setX(arrowUpX);
        arrowUp.setY(arrowUpY);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause ismmmmmmm");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart is mmmmmmmmmm");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume is called");
    }

    public void methodNextPage(View view) {
        Intent next = new Intent(this, SecondPage.class);
        startActivity(next);
    }

    public void methodForCall(View view) {
        /*
        Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("www.google.com"));*/
        Intent i=new Intent();
        i= i.createChooser(i,"please select anything");

        startActivity(i);
    }
}
