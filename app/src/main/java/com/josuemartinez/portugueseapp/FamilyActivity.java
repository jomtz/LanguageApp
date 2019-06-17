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
        words.add(new Word("father", "pai", R.drawable.family_father));
        words.add(new Word("mother", "mãe", R.drawable.family_mother));
        words.add(new Word("son","filho", R.drawable.family_son));
        words.add(new Word("daughter","filha", R.drawable.family_daughter));
        words.add(new Word("brother","irmão", R.drawable.family_younger_brother));
        words.add(new Word("sister","irmã", R.drawable.family_younger_sister));
        words.add(new Word("uncle", "tio", R.drawable.family_older_brother));
        words.add(new Word("aunt", "tia", R.drawable.family_older_sister));
        words.add(new Word("grandmother", "avó", R.drawable.family_grandmother));
        words.add(new Word("grandfather", "avô", R.drawable.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
