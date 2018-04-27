package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","okok",R.drawable.family_daughter));
        words.add(new Word("two","2",R.drawable.family_son));
        words.add(new Word("three","3",R.drawable.family_father));
        words.add(new Word("four","4",R.drawable.family_grandfather));
        words.add(new Word("five","5",R.drawable.family_grandfather));
        words.add(new Word("six","6",R.drawable.family_grandmother));
        words.add(new Word("seven","7",R.drawable.family_mother));
        words.add(new Word("eight","8",R.drawable.family_older_brother));
        words.add(new Word("one","okok",R.drawable.family_older_sister));
        words.add(new Word("two","2",R.drawable.family_younger_brother));
        words.add(new Word("one","okok",R.drawable.family_daughter));
        words.add(new Word("two","2",R.drawable.family_son));
        words.add(new Word("three","3",R.drawable.family_father));
        words.add(new Word("four","4",R.drawable.family_grandfather));
        words.add(new Word("five","5",R.drawable.family_grandfather));
        words.add(new Word("six","6",R.drawable.family_grandmother));
        words.add(new Word("seven","7",R.drawable.family_mother));
        words.add(new Word("eight","8",R.drawable.family_older_brother));
        words.add(new Word("one","okok",R.drawable.family_older_sister));
        words.add(new Word("two","2",R.drawable.family_younger_brother));
        words.add(new Word("three","3",R.drawable.family_younger_sister));
        words.add(new Word("one","okok",R.drawable.family_daughter));
        words.add(new Word("two","2",R.drawable.family_son));
        words.add(new Word("three","3",R.drawable.family_father));
        words.add(new Word("four","4",R.drawable.family_grandfather));
        words.add(new Word("five","5",R.drawable.family_grandfather));
        words.add(new Word("six","6",R.drawable.family_grandmother));
        words.add(new Word("seven","7",R.drawable.family_mother));
        words.add(new Word("eight","8",R.drawable.family_older_brother));
        words.add(new Word("one","okok",R.drawable.family_older_sister));
        words.add(new Word("two","2",R.drawable.family_younger_brother));
        words.add(new Word("three","3",R.drawable.family_younger_sister));
        words.add(new Word("one","okok",R.drawable.family_daughter));
        words.add(new Word("two","2",R.drawable.family_son));
        words.add(new Word("three","3",R.drawable.family_father));
        words.add(new Word("four","4",R.drawable.family_grandfather));
        words.add(new Word("five","5",R.drawable.family_grandfather));
        words.add(new Word("six","6",R.drawable.family_grandmother));
        words.add(new Word("seven","7",R.drawable.family_mother));
        words.add(new Word("eight","8",R.drawable.family_older_brother));
        words.add(new Word("one","okok",R.drawable.family_older_sister));
        words.add(new Word("two","2",R.drawable.family_younger_brother));
        words.add(new Word("three","3",R.drawable.family_younger_sister));




        Log.v("NumbersActivity", "Word at index 0 is: " + words.get(0)); // so this works


        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
