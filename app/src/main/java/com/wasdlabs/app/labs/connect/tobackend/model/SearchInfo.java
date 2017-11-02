
package com.wasdlabs.app.labs.connect.tobackend.model;

import android.os.Parcel;
import android.os.Parcelable;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class SearchInfo implements Parcelable {

    @SerializedName("textSnippet")
    private String mTextSnippet;

    public String getTextSnippet() {
        return mTextSnippet;
    }

    public void setTextSnippet(String textSnippet) {
        mTextSnippet = textSnippet;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mTextSnippet);
    }

    public SearchInfo() {
    }

    protected SearchInfo(Parcel in) {
        this.mTextSnippet = in.readString();
    }

    public static final Parcelable.Creator<SearchInfo> CREATOR = new Parcelable.Creator<SearchInfo>() {
        @Override
        public SearchInfo createFromParcel(Parcel source) {
            return new SearchInfo(source);
        }

        @Override
        public SearchInfo[] newArray(int size) {
            return new SearchInfo[size];
        }
    };
}
