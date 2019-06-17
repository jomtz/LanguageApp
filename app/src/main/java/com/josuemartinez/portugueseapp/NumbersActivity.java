package com.josuemartinez.portugueseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create a array of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "um"));
        words.add(new Word("two", "dois"));
        words.add(new Word("three", "três"));
        words.add(new Word("four", "quatro"));
        words.add(new Word("five", "cinco"));
        words.add(new Word("six", "seis"));
        words.add(new Word("seven", "sete"));
        words.add(new Word("eight", "oito"));
        words.add(new Word("nine", "nove"));
        words.add(new Word("ten", "dez"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
