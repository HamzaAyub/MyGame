package com.example.hp.mygame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
    }

    public void methodPreviousPage(View view) {
        Intent previous = new Intent(this, MainActivity.class);
        startActivity(previous);
    }
}
