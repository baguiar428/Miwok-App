package com.example.android.miwok;

public class Word {
//Default Translation for word. Use m for Private variables
    private String mDefaultTranslation;

    private String mMiwokTranslation;
//Contructor
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }


    //Get the default translation of the word,
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    //Get Miwok translation of a word


    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
