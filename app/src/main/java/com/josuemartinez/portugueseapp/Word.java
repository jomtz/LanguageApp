package com.josuemartinez.portugueseapp;

public class Word {

    private String mDefaultTranslation;

    private String mPortugueseTranslation;

    public Word(String defaultTranslation, String portugueseTranslation){
        mDefaultTranslation = defaultTranslation;
        mPortugueseTranslation = portugueseTranslation;
    }

    //Get the default translation of the method
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //Get the portuguese translation of the method
    public String getPortugueseTranslation() {
        return mPortugueseTranslation;
    }

}
