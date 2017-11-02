
package com.wasdlabs.app.labs.connect.tobackend.model;

import android.os.Parcel;
import android.os.Parcelable;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Item implements Parcelable {

    @SerializedName("accessInfo")
    private AccessInfo mAccessInfo;
    @SerializedName("etag")
    private String mEtag;
    @SerializedName("id")
    private String mId;
    @SerializedName("kind")
    private String mKind;
    @SerializedName("saleInfo")
    private SaleInfo mSaleInfo;
    @SerializedName("searchInfo")
    private SearchInfo mSearchInfo;
    @SerializedName("selfLink")
    private String mSelfLink;
    @SerializedName("volumeInfo")
    private VolumeInfo mVolumeInfo;

    public AccessInfo getAccessInfo() {
        return mAccessInfo;
    }

    public void setAccessInfo(AccessInfo accessInfo) {
        mAccessInfo = accessInfo;
    }

    public String getEtag() {
        return mEtag;
    }

    public void setEtag(String etag) {
        mEtag = etag;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getKind() {
        return mKind;
    }

    public void setKind(String kind) {
        mKind = kind;
    }

    public SaleInfo getSaleInfo() {
        return mSaleInfo;
    }

    public void setSaleInfo(SaleInfo saleInfo) {
        mSaleInfo = saleInfo;
    }

    public SearchInfo getSearchInfo() {
        return mSearchInfo;
    }

    public void setSearchInfo(SearchInfo searchInfo) {
        mSearchInfo = searchInfo;
    }

    public String getSelfLink() {
        return mSelfLink;
    }

    public void setSelfLink(String selfLink) {
        mSelfLink = selfLink;
    }

    public VolumeInfo getVolumeInfo() {
        return mVolumeInfo;
    }

    public void setVolumeInfo(VolumeInfo volumeInfo) {
        mVolumeInfo = volumeInfo;
    }

    public Item() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.mAccessInfo, flags);
        dest.writeString(this.mEtag);
        dest.writeString(this.mId);
        dest.writeString(this.mKind);
        dest.writeParcelable(this.mSaleInfo, flags);
        dest.writeParcelable(this.mSearchInfo, flags);
        dest.writeString(this.mSelfLink);
        dest.writeParcelable(this.mVolumeInfo, flags);
    }

    protected Item(Parcel in) {
        this.mAccessInfo = in.readParcelable(AccessInfo.class.getClassLoader());
        this.mEtag = in.readString();
        this.mId = in.readString();
        this.mKind = in.readString();
        this.mSaleInfo = in.readParcelable(SaleInfo.class.getClassLoader());
        this.mSearchInfo = in.readParcelable(SearchInfo.class.getClassLoader());
        this.mSelfLink = in.readString();
        this.mVolumeInfo = in.readParcelable(VolumeInfo.class.getClassLoader());
    }

    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel source) {
            return new Item(source);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };
}
