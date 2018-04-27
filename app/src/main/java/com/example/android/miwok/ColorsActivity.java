package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","okok",R.drawable.color_black));
        words.add(new Word("two","2",R.drawable.color_brown));
        words.add(new Word("three","3",R.drawable.color_dusty_yellow));
        words.add(new Word("four","4",R.drawable.color_gray));
        words.add(new Word("five","5",R.drawable.color_green));
        words.add(new Word("six","6",R.drawable.color_mustard_yellow));
        words.add(new Word("seven","7",R.drawable.color_red));
        words.add(new Word("eight","8",R.drawable.color_white));
        words.add(new Word("one","okok",R.drawable.color_black));
        words.add(new Word("two","2",R.drawable.color_brown));
        words.add(new Word("three","3",R.drawable.color_dusty_yellow));
        words.add(new Word("four","4",R.drawable.color_gray));
        words.add(new Word("five","5",R.drawable.color_green));
        words.add(new Word("six","6",R.drawable.color_mustard_yellow));
        words.add(new Word("seven","7",R.drawable.color_red));
        words.add(new Word("eight","8",R.drawable.color_white));
        words.add(new Word("one","okok",R.drawable.color_black));
        words.add(new Word("two","2",R.drawable.color_brown));
        words.add(new Word("three","3",R.drawable.color_dusty_yellow));
        words.add(new Word("four","4",R.drawable.color_gray));
        words.add(new Word("five","5",R.drawable.color_green));
        words.add(new Word("six","6",R.drawable.color_mustard_yellow));
        words.add(new Word("seven","7",R.drawable.color_red));
        words.add(new Word("eight","8",R.drawable.color_white));



        Log.v("NumbersActivity", "Word at index 0 is: " + words.get(0)); // so this works


        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
