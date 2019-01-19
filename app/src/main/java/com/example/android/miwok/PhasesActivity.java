package com.example.android.miwok;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhasesActivity extends AppCompatActivity {


    private MediaPlayer media;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phases);
        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going?","minto wuksus",R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name?" ,"tinnә oyaase'nә",R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is..","oyaaset...",R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling?","michәksәs?",R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I’m feeling good.","kuchi achit",R.raw.phrase_im_feeling_good));
        words.add(new Word("Are you coming?","әәnәs'aa?",R.raw.phrase_are_you_coming));
        words.add(new Word("Yes, I’m coming." ,"hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        words.add(new Word("I’m coming." ,"әәnәm",R.raw.phrase_im_coming));
        words.add(new Word("Let’s go." ,"yoowutis",R.raw.phrase_lets_go));
        words.add(new Word("Come here.","әnni'nem",R.raw.phrase_come_here));
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        int color = Color.parseColor("#16AFCA");
        WordAdapter itemsAdapter = new WordAdapter(this, words,color);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
                releaseMediaPlayer();
                media = MediaPlayer.create(PhasesActivity.this,word.getmAudioResourceId());
                media.start();

                media.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        releaseMediaPlayer();
                    }
                });
            }
        });
    }
    public void releaseMediaPlayer() {
        if(media != null) {
            media.release();
            media = null;
        }
    }
}
