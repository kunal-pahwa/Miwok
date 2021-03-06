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

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        final TextView numbers = (TextView)findViewById(R.id.numbers);
        //final LinearLayout colorChange = (LinearLayout) findViewById(R.id.Listi);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          //      colorChange.setBackgroundColor(0xFFFFFF);
                Intent i = new Intent(getApplicationContext(),NumbersActivity.class);
                startActivity(i);
            }
        }) ;


        final TextView colors = (TextView)findViewById(R.id.colors);

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //    colorChange.setBackgroundColor(0x7CFC00);
                Intent i = new Intent(getApplicationContext(),ColorsActivity.class);
                startActivity(i);
            }
        }) ;


        TextView phrases = (TextView)findViewById(R.id.phrases);

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  colorChange.setBackgroundColor(0x0000FF);

                Intent i = new Intent(getApplicationContext(),PhasesActivity.class);
                startActivity(i);
            }
        }) ;



        TextView Family = (TextView)findViewById(R.id.family);

        Family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //colorChange.setBackgroundColor(0x00FF00);
                Intent i = new Intent(getApplicationContext(),FamilyActivity.class);
                startActivity(i);
            }
        }) ;
    }

}
