
package com.wasdlabs.app.labs.connect.tobackend.model;

import android.os.Parcel;
import android.os.Parcelable;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class IndustryIdentifier implements Parcelable {

    @SerializedName("identifier")
    private String mIdentifier;
    @SerializedName("type")
    private String mType;

    public String getIdentifier() {
        return mIdentifier;
    }

    public void setIdentifier(String identifier) {
        mIdentifier = identifier;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mIdentifier);
        dest.writeString(this.mType);
    }

    public IndustryIdentifier() {
    }

    protected IndustryIdentifier(Parcel in) {
        this.mIdentifier = in.readString();
        this.mType = in.readString();
    }

    public static final Parcelable.Creator<IndustryIdentifier> CREATOR = new Parcelable.Creator<IndustryIdentifier>() {
        @Override
        public IndustryIdentifier createFromParcel(Parcel source) {
            return new IndustryIdentifier(source);
        }

        @Override
        public IndustryIdentifier[] newArray(int size) {
            return new IndustryIdentifier[size];
        }
    };
}
