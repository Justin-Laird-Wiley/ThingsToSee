package com.example.justin.thingstosee;

/**
 * This class stores information about "things to see"; object is made up of a location,
 * a town, and a comment; can contain an image resourde ID, too
 */
public class ThingsToSee {
    //  Constant that indicates ThingsToSee objects have no stored image resource ID
    private static final int NO_IMAGE_PROVIDED = -1;

    //  Store the location
    private String mLocation;
    //  Store the town
    private String mTown;
    //  Store comment about location
    private String mComment;
    //  Set mImageId to a default of NO_IMAGE_PROVIDED (-1); changed when image resource ID is loaded by constructor
    private int mImageId = NO_IMAGE_PROVIDED;

    //  Constructor that loads location, town, comment, and image resource ID
    public ThingsToSee(String location, String town, String comment, int imageId) {
        mLocation = location;
        mTown = town;
        mComment = comment;
        mImageId = imageId;
    }

    //  Constuctor that loads location, town, comment, but no image resource ID
    public ThingsToSee(String location, String town, String comment) {
        mLocation = location;
        mTown = town;
        mComment = comment;
    }

    //  Get location
    public String getLocation() {
        return mLocation;
    }

    //  Get Town
    public String getTown() {
        return mTown;
    }

    //  Get comment
    public String getComment() {
        return mComment;
    }

    //  Get image resource ID
    public int getImageId() {
        return mImageId;
    }

    //  Boolean method that checks if object has image resource ID
    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;
    }

}
