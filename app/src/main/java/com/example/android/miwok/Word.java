package com.example.android.miwok;

import android.content.Context;
import android.media.Image;

import java.util.ArrayList;

public class Word {

private String miwok;
private String def;
private static final int DEFAULT_IMAGE_ID = -1;
private int imageID = DEFAULT_IMAGE_ID;


public Word(String def, String miw){
    miwok = miw;
    this.def = def;
}

    public Word(String def, String miw, int imgID){
        miwok = miw;
        this.def = def;
        imageID = imgID;
    }

public String getDef(){
    return def;
}

public String getMiwok(){
    return miwok;
}

public int getImageID() {
    return imageID;
}

public boolean hasImage(){
    return (imageID != DEFAULT_IMAGE_ID);
}


}
