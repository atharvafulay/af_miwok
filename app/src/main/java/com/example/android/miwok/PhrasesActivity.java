package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","okok"));
        words.add(new Word("two","2"));
        words.add(new Word("three","3"));
        words.add(new Word("four","4"));
        words.add(new Word("five","5"));
        words.add(new Word("six","6"));
        words.add(new Word("seven","7"));
        words.add(new Word("eight","8"));
        words.add(new Word("one","okok"));
        words.add(new Word("two","2"));
        words.add(new Word("three","3"));
        words.add(new Word("four","4"));
        words.add(new Word("five","5"));
        words.add(new Word("six","6"));
        words.add(new Word("seven","7"));
        words.add(new Word("eight","8"));
        words.add(new Word("one","okok"));
        words.add(new Word("two","2"));
        words.add(new Word("three","3"));
        words.add(new Word("four","4"));
        words.add(new Word("five","5"));
        words.add(new Word("six","6"));
        words.add(new Word("seven","7"));
        words.add(new Word("eight","8"));
        words.add(new Word("one","okok"));
        words.add(new Word("two","2"));
        words.add(new Word("three","3"));
        words.add(new Word("four","4"));
        words.add(new Word("five","5"));
        words.add(new Word("six","6"));
        words.add(new Word("seven","7"));
        words.add(new Word("eight","8"));
        words.add(new Word("one","okok"));
        words.add(new Word("two","2"));
        words.add(new Word("three","3"));
        words.add(new Word("four","4"));
        words.add(new Word("five","5"));
        words.add(new Word("six","6"));
        words.add(new Word("seven","7"));
        words.add(new Word("eight","8"));
        words.add(new Word("one","okok"));
        words.add(new Word("two","2"));
        words.add(new Word("three","3"));
        words.add(new Word("four","4"));
        words.add(new Word("five","5"));
        words.add(new Word("six","6"));
        words.add(new Word("seven","7"));
        words.add(new Word("eight","8"));



        Log.v("NumbersActivity", "Word at index 0 is: " + words.get(0)); // so this works


        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
