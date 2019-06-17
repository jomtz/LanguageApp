package com.josuemartinez.portugueseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create a array of words
        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("Where are you going?", "Onde você vai?"));
        words.add(new Word("What is your name?", "Qual é o seu nome?"));
        words.add(new Word("My name is...","Meu nome é..."));
        words.add(new Word("How are you feeling?","Como você está se sentindo?"));
        words.add(new Word("I’m feeling good.","Eu estou me sentindo bem."));
        words.add(new Word("Are you coming?","Você está vindo?"));
        words.add(new Word("Yes, I’m coming.", "Sim, estou indo"));
        words.add(new Word("I’m coming.", "Estou chegando."));
        words.add(new Word("Let’s go.", "Vamos lá."));
        words.add(new Word("Come here.", "Venha aqui."));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
