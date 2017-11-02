
package com.wasdlabs.app.labs.connect.tobackend.model;

import android.os.Parcel;
import android.os.Parcelable;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Offer implements Parcelable {

    @SerializedName("finskyOfferType")
    private Long mFinskyOfferType;
    @SerializedName("listPrice")
    private ListPrice mListPrice;
    @SerializedName("retailPrice")
    private RetailPrice mRetailPrice;

    public Long getFinskyOfferType() {
        return mFinskyOfferType;
    }

    public void setFinskyOfferType(Long finskyOfferType) {
        mFinskyOfferType = finskyOfferType;
    }

    public ListPrice getListPrice() {
        return mListPrice;
    }

    public void setListPrice(ListPrice listPrice) {
        mListPrice = listPrice;
    }

    public RetailPrice getRetailPrice() {
        return mRetailPrice;
    }

    public void setRetailPrice(RetailPrice retailPrice) {
        mRetailPrice = retailPrice;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.mFinskyOfferType);
        dest.writeParcelable(this.mListPrice, flags);
        dest.writeParcelable(this.mRetailPrice, flags);
    }

    public Offer() {
    }

    protected Offer(Parcel in) {
        this.mFinskyOfferType = (Long) in.readValue(Long.class.getClassLoader());
        this.mListPrice = in.readParcelable(ListPrice.class.getClassLoader());
        this.mRetailPrice = in.readParcelable(RetailPrice.class.getClassLoader());
    }

    public static final Parcelable.Creator<Offer> CREATOR = new Parcelable.Creator<Offer>() {
        @Override
        public Offer createFromParcel(Parcel source) {
            return new Offer(source);
        }

        @Override
        public Offer[] newArray(int size) {
            return new Offer[size];
        }
    };
}
