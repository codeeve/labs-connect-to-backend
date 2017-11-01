
package com.wasdlabs.app.labs.connect.tobackend.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ListPrice {

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

}
