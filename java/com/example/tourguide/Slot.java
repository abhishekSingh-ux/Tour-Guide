package com.example.tourguide;

import android.widget.ImageView;
import android.widget.TextView;

public class Slot {
    //declaring the states/variables
    private String mNameText;
    private String mReviewText;
    private int mSideImageView=-1;

    //An appropriate constructor with image fragment
    public Slot(String nameText, String reviewText, int sideImageView) {
        mNameText= nameText;
        mReviewText=reviewText;
        mSideImageView= sideImageView;
    }
    //Another constructor for fragment without image
    public Slot(String nameText, String reviewText) {
        mNameText= nameText;
        mReviewText=reviewText;
    }

    //Setting the methods
    public String getmNameText() {
        return mNameText;
    }

    public String getmReviewText() {
        return mReviewText;
    }

    public int getmSideImageView() {
        return mSideImageView;
    }

    public boolean hasImage(){ return mSideImageView!=-1; }
}
