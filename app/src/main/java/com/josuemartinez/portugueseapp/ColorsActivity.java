package com.josuemartinez.portugueseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create a array of words
        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("red", "vermelha"));
        words.add(new Word("green", "verde"));
        words.add(new Word("brown","castanha"));
        words.add(new Word("gray","cinzento"));
        words.add(new Word("black","preto"));
        words.add(new Word("white","branco"));
        words.add(new Word("yellow", "amarela"));
        words.add(new Word("mustard yellow", "mostarda amarela"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
