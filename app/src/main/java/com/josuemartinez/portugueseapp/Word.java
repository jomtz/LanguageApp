package com.josuemartinez.portugueseapp;

public class Word {

    private String mDefaultTranslation;

    private String mPortugueseTranslation;

    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String portugueseTranslation){
        mDefaultTranslation = defaultTranslation;
        mPortugueseTranslation = portugueseTranslation;
    }

    public Word(String defaultTranslation, String portugueseTranslation, int imageResourceID){
        mDefaultTranslation = defaultTranslation;
        mPortugueseTranslation = portugueseTranslation;
        mImageResourceID = imageResourceID;
    }

    //Get the default translation of the method
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //Get the portuguese translation of the method
    public String getPortugueseTranslation() {
        return mPortugueseTranslation;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
