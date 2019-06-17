package com.josuemartinez.portugueseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create a array of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "pai"));
        words.add(new Word("mother", "mãe"));
        words.add(new Word("son","filho"));
        words.add(new Word("daughter","filha"));
        words.add(new Word("brother","irmão"));
        words.add(new Word("sister","irmã"));
        words.add(new Word("cousin", "primo/prima"));
        words.add(new Word("uncle", "tio"));
        words.add(new Word("grandmother", "avó"));
        words.add(new Word("grandfather", "avô"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
