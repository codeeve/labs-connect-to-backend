
package com.wasdlabs.app.labs.connect.tobackend.model;

import android.os.Parcel;
import android.os.Parcelable;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class PanelizationSummary implements Parcelable {

    @SerializedName("containsEpubBubbles")
    private Boolean mContainsEpubBubbles;
    @SerializedName("containsImageBubbles")
    private Boolean mContainsImageBubbles;

    public Boolean getContainsEpubBubbles() {
        return mContainsEpubBubbles;
    }

    public void setContainsEpubBubbles(Boolean containsEpubBubbles) {
        mContainsEpubBubbles = containsEpubBubbles;
    }

    public Boolean getContainsImageBubbles() {
        return mContainsImageBubbles;
    }

    public void setContainsImageBubbles(Boolean containsImageBubbles) {
        mContainsImageBubbles = containsImageBubbles;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.mContainsEpubBubbles);
        dest.writeValue(this.mContainsImageBubbles);
    }

    public PanelizationSummary() {
    }

    protected PanelizationSummary(Parcel in) {
        this.mContainsEpubBubbles = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.mContainsImageBubbles = (Boolean) in.readValue(Boolean.class.getClassLoader());
    }

    public static final Parcelable.Creator<PanelizationSummary> CREATOR = new Parcelable.Creator<PanelizationSummary>() {
        @Override
        public PanelizationSummary createFromParcel(Parcel source) {
            return new PanelizationSummary(source);
        }

        @Override
        public PanelizationSummary[] newArray(int size) {
            return new PanelizationSummary[size];
        }
    };
}
