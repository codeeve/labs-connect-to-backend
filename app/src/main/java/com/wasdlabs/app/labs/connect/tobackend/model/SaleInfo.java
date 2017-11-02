
package com.wasdlabs.app.labs.connect.tobackend.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class SaleInfo implements Parcelable {

    @SerializedName("buyLink")
    private String mBuyLink;
    @SerializedName("country")
    private String mCountry;
    @SerializedName("isEbook")
    private Boolean mIsEbook;
    @SerializedName("listPrice")
    private ListPrice mListPrice;
    @SerializedName("offers")
    private List<Offer> mOffers;
    @SerializedName("retailPrice")
    private RetailPrice mRetailPrice;
    @SerializedName("saleability")
    private String mSaleability;

    public String getBuyLink() {
        return mBuyLink;
    }

    public void setBuyLink(String buyLink) {
        mBuyLink = buyLink;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public Boolean getIsEbook() {
        return mIsEbook;
    }

    public void setIsEbook(Boolean isEbook) {
        mIsEbook = isEbook;
    }

    public ListPrice getListPrice() {
        return mListPrice;
    }

    public void setListPrice(ListPrice listPrice) {
        mListPrice = listPrice;
    }

    public List<Offer> getOffers() {
        return mOffers;
    }

    public void setOffers(List<Offer> offers) {
        mOffers = offers;
    }

    public RetailPrice getRetailPrice() {
        return mRetailPrice;
    }

    public void setRetailPrice(RetailPrice retailPrice) {
        mRetailPrice = retailPrice;
    }

    public String getSaleability() {
        return mSaleability;
    }

    public void setSaleability(String saleability) {
        mSaleability = saleability;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mBuyLink);
        dest.writeString(this.mCountry);
        dest.writeValue(this.mIsEbook);
        dest.writeParcelable(this.mListPrice, flags);
        dest.writeList(this.mOffers);
        dest.writeParcelable(this.mRetailPrice, flags);
        dest.writeString(this.mSaleability);
    }

    public SaleInfo() {
    }

    protected SaleInfo(Parcel in) {
        this.mBuyLink = in.readString();
        this.mCountry = in.readString();
        this.mIsEbook = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.mListPrice = in.readParcelable(ListPrice.class.getClassLoader());
        this.mOffers = new ArrayList<Offer>();
        in.readList(this.mOffers, Offer.class.getClassLoader());
        this.mRetailPrice = in.readParcelable(RetailPrice.class.getClassLoader());
        this.mSaleability = in.readString();
    }

    public static final Parcelable.Creator<SaleInfo> CREATOR = new Parcelable.Creator<SaleInfo>() {
        @Override
        public SaleInfo createFromParcel(Parcel source) {
            return new SaleInfo(source);
        }

        @Override
        public SaleInfo[] newArray(int size) {
            return new SaleInfo[size];
        }
    };
}
