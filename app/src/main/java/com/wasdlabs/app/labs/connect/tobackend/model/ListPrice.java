
package com.wasdlabs.app.labs.connect.tobackend.model;

import android.os.Parcel;
import android.os.Parcelable;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ListPrice implements Parcelable {

    @SerializedName("amount")
    private Double mAmount;
    @SerializedName("amountInMicros")
    private Long mAmountInMicros;
    @SerializedName("currencyCode")
    private String mCurrencyCode;

    public Double getAmount() {
        return mAmount;
    }

    public void setAmount(Double amount) {
        mAmount = amount;
    }

    public Long getAmountInMicros() {
        return mAmountInMicros;
    }

    public void setAmountInMicros(Long amountInMicros) {
        mAmountInMicros = amountInMicros;
    }

    public String getCurrencyCode() {
        return mCurrencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        mCurrencyCode = currencyCode;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.mAmount);
        dest.writeValue(this.mAmountInMicros);
        dest.writeString(this.mCurrencyCode);
    }

    public ListPrice() {
    }

    protected ListPrice(Parcel in) {
        this.mAmount = (Double) in.readValue(Double.class.getClassLoader());
        this.mAmountInMicros = (Long) in.readValue(Long.class.getClassLoader());
        this.mCurrencyCode = in.readString();
    }

    public static final Parcelable.Creator<ListPrice> CREATOR = new Parcelable.Creator<ListPrice>() {
        @Override
        public ListPrice createFromParcel(Parcel source) {
            return new ListPrice(source);
        }

        @Override
        public ListPrice[] newArray(int size) {
            return new ListPrice[size];
        }
    };
}
