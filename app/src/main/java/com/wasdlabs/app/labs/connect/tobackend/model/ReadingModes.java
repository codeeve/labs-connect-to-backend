
package com.wasdlabs.app.labs.connect.tobackend.model;

import android.os.Parcel;
import android.os.Parcelable;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ReadingModes implements Parcelable {

    @SerializedName("image")
    private Boolean mImage;
    @SerializedName("text")
    private Boolean mText;

    public Boolean getImage() {
        return mImage;
    }

    public void setImage(Boolean image) {
        mImage = image;
    }

    public Boolean getText() {
        return mText;
    }

    public void setText(Boolean text) {
        mText = text;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.mImage);
        dest.writeValue(this.mText);
    }

    public ReadingModes() {
    }

    protected ReadingModes(Parcel in) {
        this.mImage = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.mText = (Boolean) in.readValue(Boolean.class.getClassLoader());
    }

    public static final Parcelable.Creator<ReadingModes> CREATOR = new Parcelable.Creator<ReadingModes>() {
        @Override
        public ReadingModes createFromParcel(Parcel source) {
            return new ReadingModes(source);
        }

        @Override
        public ReadingModes[] newArray(int size) {
            return new ReadingModes[size];
        }
    };
}
