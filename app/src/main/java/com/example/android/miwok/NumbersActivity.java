
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","okok",R.drawable.number_one));
        words.add(new Word("two","2",R.drawable.number_two));
        words.add(new Word("three","3",R.drawable.number_three));
        words.add(new Word("four","4",R.drawable.number_four));
        words.add(new Word("five","5",R.drawable.number_five));
        words.add(new Word("six","6",R.drawable.number_six));
        words.add(new Word("seven","7",R.drawable.number_seven));
        words.add(new Word("eight","8",R.drawable.number_eight));
        words.add(new Word("one","okok",R.drawable.number_nine));
        words.add(new Word("one","okok",R.drawable.number_one));
        words.add(new Word("two","2",R.drawable.number_two));
        words.add(new Word("three","3",R.drawable.number_three));
        words.add(new Word("four","4",R.drawable.number_four));
        words.add(new Word("five","5",R.drawable.number_five));
        words.add(new Word("six","6",R.drawable.number_six));
        words.add(new Word("seven","7",R.drawable.number_seven));
        words.add(new Word("eight","8",R.drawable.number_eight));
        words.add(new Word("one","okok",R.drawable.number_nine));
        words.add(new Word("one","okok",R.drawable.number_one));
        words.add(new Word("two","2",R.drawable.number_two));
        words.add(new Word("three","3",R.drawable.number_three));
        words.add(new Word("four","4",R.drawable.number_four));
        words.add(new Word("five","5",R.drawable.number_five));
        words.add(new Word("six","6",R.drawable.number_six));
        words.add(new Word("seven","7",R.drawable.number_seven));
        words.add(new Word("eight","8",R.drawable.number_eight));
        words.add(new Word("one","okok",R.drawable.number_nine));
        words.add(new Word("one","okok",R.drawable.number_one));
        words.add(new Word("two","2",R.drawable.number_two));
        words.add(new Word("three","3",R.drawable.number_three));
        words.add(new Word("four","4",R.drawable.number_four));
        words.add(new Word("five","5",R.drawable.number_five));
        words.add(new Word("six","6",R.drawable.number_six));
        words.add(new Word("seven","7",R.drawable.number_seven));
        words.add(new Word("eight","8",R.drawable.number_eight));
        words.add(new Word("one","okok",R.drawable.number_nine));
        words.add(new Word("one","okok",R.drawable.number_one));
        words.add(new Word("two","2",R.drawable.number_two));
        words.add(new Word("three","3",R.drawable.number_three));
        words.add(new Word("four","4",R.drawable.number_four));
        words.add(new Word("five","5",R.drawable.number_five));
        words.add(new Word("six","6",R.drawable.number_six));
        words.add(new Word("seven","7",R.drawable.number_seven));
        words.add(new Word("eight","8",R.drawable.number_eight));
        words.add(new Word("one","okok",R.drawable.number_nine));




        Log.v("NumbersActivity", "Word at index 0 is: " + words.get(0)); // so this works


        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_numbers );
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}