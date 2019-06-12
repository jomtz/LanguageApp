package com.josuemartinez.portugueseapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //Set the clicklistener on that View
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent numbersIntent = new Intent(MainActivity.this, MainActivity.class);
                //Start new activity
                startActivity(numbersIntent);
            }
        });
    }


    public void openPhrasesList(View view){
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }
    public void openFamilyList(View view){
        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }
    public void openColorsList(View view){
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }
}
