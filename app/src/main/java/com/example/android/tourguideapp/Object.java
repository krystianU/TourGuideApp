package com.example.android.tourguideapp;

/**
 * Created by tit0 on 27.06.2017.
 */

public class Object {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mObjectName;
    private String mObjectStreet;
    private String mObjectInfo1;
    private Integer mImageResourceId = NO_IMAGE_PROVIDED;

    public Object(String objectName, String objectStreet, String objectInfo1){
        mObjectName = objectName;
        mObjectStreet = objectStreet;
        mObjectInfo1 = objectInfo1;
    }

    public Object(String objectName, String objectStreet, String objectInfo1, Integer imageResourceId) {
        mObjectName = objectName;
        mObjectStreet = objectStreet;
        mObjectInfo1 = objectInfo1;
        mImageResourceId = imageResourceId;
    }

    public String getObjectName(){
        return mObjectName;
    }
    public String getObjectStreet(){
        return mObjectStreet;
    }
    public String getObjectInfo1(){
        return mObjectInfo1;
    }
    public boolean hasImage(){return mImageResourceId != NO_IMAGE_PROVIDED;}
    public Integer getImageResourceId(){return mImageResourceId;}
}
