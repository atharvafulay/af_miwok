package com.example.android.miwok;

import android.app.Activity;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int colorID;

    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }


    public WordAdapter(Activity context, ArrayList<Word> words, int clrID){
        super(context, 0, words);
        colorID = clrID;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Word currWord = getItem(position);

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        TextView defWord = (TextView) listItemView.findViewById(R.id.englishWord);

        defWord.setText(currWord.getDef());

        TextView miwWord = (TextView) listItemView.findViewById(R.id.miwokWord);

        miwWord.setText(currWord.getMiwok());


        ImageView image = (ImageView) listItemView.findViewById(R.id.img);

        if(currWord.hasImage()){
            image.setImageResource(currWord.getImageID());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }


        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(),colorID);

        textContainer.setBackgroundColor(color);



        // this doesn't work. if there is an actual issue with an image not showing up, then I can't see it.



        return listItemView;

    }
}
