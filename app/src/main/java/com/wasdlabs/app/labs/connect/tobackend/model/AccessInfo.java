
package com.wasdlabs.app.labs.connect.tobackend.model;

import android.os.Parcel;
import android.os.Parcelable;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class AccessInfo implements Parcelable {

    @SerializedName("accessViewStatus")
    private String mAccessViewStatus;
    @SerializedName("country")
    private String mCountry;
    @SerializedName("embeddable")
    private Boolean mEmbeddable;
    @SerializedName("epub")
    private Epub mEpub;
    @SerializedName("pdf")
    private Pdf mPdf;
    @SerializedName("publicDomain")
    private Boolean mPublicDomain;
    @SerializedName("quoteSharingAllowed")
    private Boolean mQuoteSharingAllowed;
    @SerializedName("textToSpeechPermission")
    private String mTextToSpeechPermission;
    @SerializedName("viewability")
    private String mViewability;
    @SerializedName("webReaderLink")
    private String mWebReaderLink;

    public String getAccessViewStatus() {
        return mAccessViewStatus;
    }

    public void setAccessViewStatus(String accessViewStatus) {
        mAccessViewStatus = accessViewStatus;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public Boolean getEmbeddable() {
        return mEmbeddable;
    }

    public void setEmbeddable(Boolean embeddable) {
        mEmbeddable = embeddable;
    }

    public Epub getEpub() {
        return mEpub;
    }

    public void setEpub(Epub epub) {
        mEpub = epub;
    }

    public Pdf getPdf() {
        return mPdf;
    }

    public void setPdf(Pdf pdf) {
        mPdf = pdf;
    }

    public Boolean getPublicDomain() {
        return mPublicDomain;
    }

    public void setPublicDomain(Boolean publicDomain) {
        mPublicDomain = publicDomain;
    }

    public Boolean getQuoteSharingAllowed() {
        return mQuoteSharingAllowed;
    }

    public void setQuoteSharingAllowed(Boolean quoteSharingAllowed) {
        mQuoteSharingAllowed = quoteSharingAllowed;
    }

    public String getTextToSpeechPermission() {
        return mTextToSpeechPermission;
    }

    public void setTextToSpeechPermission(String textToSpeechPermission) {
        mTextToSpeechPermission = textToSpeechPermission;
    }

    public String getViewability() {
        return mViewability;
    }

    public void setViewability(String viewability) {
        mViewability = viewability;
    }

    public String getWebReaderLink() {
        return mWebReaderLink;
    }

    public void setWebReaderLink(String webReaderLink) {
        mWebReaderLink = webReaderLink;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mAccessViewStatus);
        dest.writeString(this.mCountry);
        dest.writeValue(this.mEmbeddable);
        dest.writeParcelable(this.mEpub, flags);
        dest.writeParcelable(this.mPdf, flags);
        dest.writeValue(this.mPublicDomain);
        dest.writeValue(this.mQuoteSharingAllowed);
        dest.writeString(this.mTextToSpeechPermission);
        dest.writeString(this.mViewability);
        dest.writeString(this.mWebReaderLink);
    }

    public AccessInfo() {
    }

    protected AccessInfo(Parcel in) {
        this.mAccessViewStatus = in.readString();
        this.mCountry = in.readString();
        this.mEmbeddable = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.mEpub = in.readParcelable(Epub.class.getClassLoader());
        this.mPdf = in.readParcelable(Pdf.class.getClassLoader());
        this.mPublicDomain = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.mQuoteSharingAllowed = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.mTextToSpeechPermission = in.readString();
        this.mViewability = in.readString();
        this.mWebReaderLink = in.readString();
    }

    public static final Parcelable.Creator<AccessInfo> CREATOR = new Parcelable.Creator<AccessInfo>() {
        @Override
        public AccessInfo createFromParcel(Parcel source) {
            return new AccessInfo(source);
        }

        @Override
        public AccessInfo[] newArray(int size) {
            return new AccessInfo[size];
        }
    };
}
