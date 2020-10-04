package com.example.catergory;

import com.google.firebase.database.Exclude;

public class Upload {
    private String mName;
    private String mImageUrl;
    private String mDownloadUrl;
    private String mKey;

    public Upload() {
        //empty constructor needed
    }
    public Upload(String name, String imageUrl,String downloadUrl)  {
        if (name.trim().equals("")) {
            name = "No Name";
        }
        mName = name;
        mImageUrl = imageUrl;
        mDownloadUrl = downloadUrl;

    }
    public String getName() {
        return mName;
    }
    public void setName(String name) {
        mName = name;
    }
    public String getImageUrl() {
        return mImageUrl;
    }
    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public String getDownloadUrl() {
        return mDownloadUrl;
    }
    public void setDowloadUrl(String dowloadUrl) {
        mDownloadUrl = dowloadUrl;
    }

    @Exclude
    public String getKey() {
        return mKey;
    }
    @Exclude
    public void setKey(String key) {
        mKey = key;
    }
}