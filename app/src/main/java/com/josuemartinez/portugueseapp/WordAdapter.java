package com.josuemartinez.portugueseapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView portugueseTextView = (TextView) listItemView.findViewById(R.id.portuguese_text_view);
        portugueseTextView.setText(currentWord.getPortugueseTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

//        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
//
//        if(currentWord.hasImage()) {
//            imageView.setImageResource(currentWord.getmImageResourceID());
//        }else{
//            imageView.setVisibility(View.GONE);
//        }
        // so that it can be shown in the ListView
        return listItemView;
    }
}
