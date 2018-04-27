/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ActionMode;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("MainActivity","onCreate");

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);
        TextView family = (TextView) findViewById(R.id.family);
        TextView colors = (TextView) findViewById(R.id.colors);
        TextView phrases = (TextView) findViewById(R.id.phrases);

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        String[] numbEng = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] numbMiw = new String[10];

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, FamilyMembersActivity.class);
                startActivity(numbersIntent);
            }
        });

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(numbersIntent);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(numbersIntent);
            }
        });
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.v("MainActivity","onStart");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.v("MainActivity","onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("MainActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("MainActivity","onPause");
    }

    @Override
    protected void onDestroy() {
        Log.v("MainActivity","onDestroy");
        super.onDestroy();

    }




    //    public void openNumbersList(View view){
//        Intent num = new Intent(this, NumbersActivity.class);
//
//
//
//        startActivity(num);
//    }
//
//    public void openFamilyList(View view){
//        Intent fm = new Intent(this, FamilyMembersActivity.class);
//        startActivity(fm);
//    }
//
//    public void openColorsList(View view){
//        Intent col = new Intent(this, ColorsActivity.class);
//        startActivity(col);
//    }
//
//    public void openPhrasesList(View view){
//        Intent phr = new Intent(this, PhrasesActivity.class);
//        startActivity(phr);
//    }
}
