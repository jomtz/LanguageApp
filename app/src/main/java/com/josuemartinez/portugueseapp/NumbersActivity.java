package com.josuemartinez.portugueseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Create a array of words
        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("one", "um"));
        words.add(new Word("two", "um"));
        words.add(new Word("three", "um"));
        words.add(new Word("four", "um"));
        words.add(new Word("five", "um"));
        words.add(new Word("six", "um"));
        words.add(new Word("seven", "um"));
        words.add(new Word("eight", "um"));
        words.add(new Word("nine", "um"));
        words.add(new Word("ten", "um"));

        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
