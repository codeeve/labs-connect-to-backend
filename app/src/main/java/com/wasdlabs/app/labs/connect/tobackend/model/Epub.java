
package com.wasdlabs.app.labs.connect.tobackend.model;

import android.os.Parcel;
import android.os.Parcelable;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Epub implements Parcelable {

    @SerializedName("acsTokenLink")
    private String mAcsTokenLink;
    @SerializedName("isAvailable")
    private Boolean mIsAvailable;

    public String getAcsTokenLink() {
        return mAcsTokenLink;
    }

    public void setAcsTokenLink(String acsTokenLink) {
        mAcsTokenLink = acsTokenLink;
    }

    public Boolean getIsAvailable() {
        return mIsAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        mIsAvailable = isAvailable;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mAcsTokenLink);
        dest.writeValue(this.mIsAvailable);
    }

    public Epub() {
    }

    protected Epub(Parcel in) {
        this.mAcsTokenLink = in.readString();
        this.mIsAvailable = (Boolean) in.readValue(Boolean.class.getClassLoader());
    }

    public static final Parcelable.Creator<Epub> CREATOR = new Parcelable.Creator<Epub>() {
        @Override
        public Epub createFromParcel(Parcel source) {
            return new Epub(source);
        }

        @Override
        public Epub[] newArray(int size) {
            return new Epub[size];
        }
    };
}
