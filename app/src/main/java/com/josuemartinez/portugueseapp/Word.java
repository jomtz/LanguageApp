package com.josuemartinez.portugueseapp;

public class Word {

    private String mDefaultTranslation;

    private String mNewTranslation;

    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceID;

    public Word(String defaultTranslation, String newTranslation, int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mNewTranslation = newTranslation;
        mAudioResourceID = audioResourceID;
    }

    public Word(String defaultTranslation, String newTranslation, int imageResourceID, int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mNewTranslation = newTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceID = audioResourceID;
    }

    //Get the default translation of the method
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //Get the portuguese translation of the method
    public String getNewTranslation() {
        return mNewTranslation;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceID(){ return mAudioResourceID; }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mNewTranslation='" + mNewTranslation + '\'' +
                ", mImageResourceID=" + mImageResourceID +
                ", mAudioResourceID=" + mAudioResourceID +
                '}';
    }
}
