
package com.wasdlabs.app.labs.connect.tobackend.model;

import android.os.Parcel;
import android.os.Parcelable;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Pdf implements Parcelable {

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

    public Pdf() {
    }

    protected Pdf(Parcel in) {
        this.mAcsTokenLink = in.readString();
        this.mIsAvailable = (Boolean) in.readValue(Boolean.class.getClassLoader());
    }

    public static final Parcelable.Creator<Pdf> CREATOR = new Parcelable.Creator<Pdf>() {
        @Override
        public Pdf createFromParcel(Parcel source) {
            return new Pdf(source);
        }

        @Override
        public Pdf[] newArray(int size) {
            return new Pdf[size];
        }
    };
}
