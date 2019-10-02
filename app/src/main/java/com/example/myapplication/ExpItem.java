package com.example.myapplication;

public class ExpItem {
    private String mImageUrl;
    private String mOwnerName;
    private String mStars;
    private String mRepoDesc;
    private String mRepoName;

    public ExpItem(String imageUrl, String ownerName, String stars, String description, String repoName) {
        mImageUrl = imageUrl;
        mOwnerName = ownerName;
        mStars = stars;
        mRepoDesc=description;
        mRepoName=repoName;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getOwnerName() {
        return mOwnerName;
    }

    public String getStarCount() {
        return mStars;
    }

    public String getRepoName() {
        return mRepoName;
    }

    public String getRepoDesc() {
        return mRepoDesc;
    }
}