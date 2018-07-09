package com.example.android.miwok;

public class Word {
//Default Translation for word. Use m for Private variables
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

//Contructor
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }


    //Get the default translation of the word,
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //Get Miwok translation of a word
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //Get image ID
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //Returns whether or not there is an image for this word.
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
