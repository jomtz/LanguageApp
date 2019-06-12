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
        ArrayList<String> words=new ArrayList<String>();
        words.add(new String("one"));
        words.add(new String("two"));
        words.add(new String("three"));
        words.add(new String("four"));
        words.add(new String("five"));
        words.add(new String("six"));
        words.add(new String("seven"));
        words.add(new String("eight"));
        words.add(new String("nine"));
        words.add(new String("ten"));

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
