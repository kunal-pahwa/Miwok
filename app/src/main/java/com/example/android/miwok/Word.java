package com.example.android.miwok;

public class Word {
    private String English_Word;
    private String Miwok_word;
    private int mImageResourceId = -1;
    private int mAudioResourceId = -1;
    public Word(String defaultTranslation, String miwokTransaation,int AudioResourceId) {
        English_Word = defaultTranslation;
        Miwok_word = miwokTransaation;
        mAudioResourceId = AudioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int image,int AudioResourceId) {
        English_Word = defaultTranslation;
        Miwok_word = miwokTranslation;
        mImageResourceId = image;
        mAudioResourceId = AudioResourceId;
    }

    public String getEnglish_Word() {
        return English_Word;
    }

    public String getMeoq_word() {
        return Miwok_word;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean isImage () {
        return mImageResourceId != -1;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
}




