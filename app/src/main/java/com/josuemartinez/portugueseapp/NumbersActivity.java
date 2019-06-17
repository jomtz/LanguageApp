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
        words.add(new Word("one", "um", R.drawable.number_one));
        words.add(new Word("two", "dois", R.drawable.number_two));
        words.add(new Word("three", "três", R.drawable.number_three));
        words.add(new Word("four", "quatro", R.drawable.number_four));
        words.add(new Word("five", "cinco", R.drawable.number_five));
        words.add(new Word("six", "seis", R.drawable.number_six));
        words.add(new Word("seven", "sete", R.drawable.number_seven));
        words.add(new Word("eight", "oito", R.drawable.number_eight));
        words.add(new Word("nine", "nove", R.drawable.number_nine));
        words.add(new Word("ten", "dez", R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
