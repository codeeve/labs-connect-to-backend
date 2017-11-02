
package com.wasdlabs.app.labs.connect.tobackend.model;

import android.os.Parcel;
import android.os.Parcelable;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ImageLinks implements Parcelable {

    @SerializedName("smallThumbnail")
    private String mSmallThumbnail;
    @SerializedName("thumbnail")
    private String mThumbnail;

    public String getSmallThumbnail() {
        return mSmallThumbnail;
    }

    public void setSmallThumbnail(String smallThumbnail) {
        mSmallThumbnail = smallThumbnail;
    }

    public String getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(String thumbnail) {
        mThumbnail = thumbnail;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mSmallThumbnail);
        dest.writeString(this.mThumbnail);
    }

    public ImageLinks() {
    }

    protected ImageLinks(Parcel in) {
        this.mSmallThumbnail = in.readString();
        this.mThumbnail = in.readString();
    }

    public static final Parcelable.Creator<ImageLinks> CREATOR = new Parcelable.Creator<ImageLinks>() {
        @Override
        public ImageLinks createFromParcel(Parcel source) {
            return new ImageLinks(source);
        }

        @Override
        public ImageLinks[] newArray(int size) {
            return new ImageLinks[size];
        }
    };
}
