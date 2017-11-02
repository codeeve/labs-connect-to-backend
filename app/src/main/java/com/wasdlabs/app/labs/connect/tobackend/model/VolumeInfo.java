
package com.wasdlabs.app.labs.connect.tobackend.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class VolumeInfo implements Parcelable {

    @SerializedName("allowAnonLogging")
    private Boolean mAllowAnonLogging;
    @SerializedName("authors")
    private List<String> mAuthors;
    @SerializedName("averageRating")
    private Double mAverageRating;
    @SerializedName("canonicalVolumeLink")
    private String mCanonicalVolumeLink;
    @SerializedName("categories")
    private List<String> mCategories;
    @SerializedName("contentVersion")
    private String mContentVersion;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("imageLinks")
    private ImageLinks mImageLinks;
    @SerializedName("industryIdentifiers")
    private List<IndustryIdentifier> mIndustryIdentifiers;
    @SerializedName("infoLink")
    private String mInfoLink;
    @SerializedName("language")
    private String mLanguage;
    @SerializedName("maturityRating")
    private String mMaturityRating;
    @SerializedName("pageCount")
    private Long mPageCount;
    @SerializedName("panelizationSummary")
    private PanelizationSummary mPanelizationSummary;
    @SerializedName("previewLink")
    private String mPreviewLink;
    @SerializedName("printType")
    private String mPrintType;
    @SerializedName("publishedDate")
    private String mPublishedDate;
    @SerializedName("publisher")
    private String mPublisher;
    @SerializedName("ratingsCount")
    private Long mRatingsCount;
    @SerializedName("readingModes")
    private ReadingModes mReadingModes;
    @SerializedName("subtitle")
    private String mSubtitle;
    @SerializedName("title")
    private String mTitle;

    public Boolean getAllowAnonLogging() {
        return mAllowAnonLogging;
    }

    public void setAllowAnonLogging(Boolean allowAnonLogging) {
        mAllowAnonLogging = allowAnonLogging;
    }

    public List<String> getAuthors() {
        return mAuthors;
    }

    public void setAuthors(List<String> authors) {
        mAuthors = authors;
    }

    public Double getAverageRating() {
        return mAverageRating;
    }

    public void setAverageRating(Double averageRating) {
        mAverageRating = averageRating;
    }

    public String getCanonicalVolumeLink() {
        return mCanonicalVolumeLink;
    }

    public void setCanonicalVolumeLink(String canonicalVolumeLink) {
        mCanonicalVolumeLink = canonicalVolumeLink;
    }

    public List<String> getCategories() {
        return mCategories;
    }

    public void setCategories(List<String> categories) {
        mCategories = categories;
    }

    public String getContentVersion() {
        return mContentVersion;
    }

    public void setContentVersion(String contentVersion) {
        mContentVersion = contentVersion;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public ImageLinks getImageLinks() {
        return mImageLinks;
    }

    public void setImageLinks(ImageLinks imageLinks) {
        mImageLinks = imageLinks;
    }

    public List<IndustryIdentifier> getIndustryIdentifiers() {
        return mIndustryIdentifiers;
    }

    public void setIndustryIdentifiers(List<IndustryIdentifier> industryIdentifiers) {
        mIndustryIdentifiers = industryIdentifiers;
    }

    public String getInfoLink() {
        return mInfoLink;
    }

    public void setInfoLink(String infoLink) {
        mInfoLink = infoLink;
    }

    public String getLanguage() {
        return mLanguage;
    }

    public void setLanguage(String language) {
        mLanguage = language;
    }

    public String getMaturityRating() {
        return mMaturityRating;
    }

    public void setMaturityRating(String maturityRating) {
        mMaturityRating = maturityRating;
    }

    public Long getPageCount() {
        return mPageCount;
    }

    public void setPageCount(Long pageCount) {
        mPageCount = pageCount;
    }

    public PanelizationSummary getPanelizationSummary() {
        return mPanelizationSummary;
    }

    public void setPanelizationSummary(PanelizationSummary panelizationSummary) {
        mPanelizationSummary = panelizationSummary;
    }

    public String getPreviewLink() {
        return mPreviewLink;
    }

    public void setPreviewLink(String previewLink) {
        mPreviewLink = previewLink;
    }

    public String getPrintType() {
        return mPrintType;
    }

    public void setPrintType(String printType) {
        mPrintType = printType;
    }

    public String getPublishedDate() {
        return mPublishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        mPublishedDate = publishedDate;
    }

    public String getPublisher() {
        return mPublisher;
    }

    public void setPublisher(String publisher) {
        mPublisher = publisher;
    }

    public Long getRatingsCount() {
        return mRatingsCount;
    }

    public void setRatingsCount(Long ratingsCount) {
        mRatingsCount = ratingsCount;
    }

    public ReadingModes getReadingModes() {
        return mReadingModes;
    }

    public void setReadingModes(ReadingModes readingModes) {
        mReadingModes = readingModes;
    }

    public String getSubtitle() {
        return mSubtitle;
    }

    public void setSubtitle(String subtitle) {
        mSubtitle = subtitle;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.mAllowAnonLogging);
        dest.writeStringList(this.mAuthors);
        dest.writeValue(this.mAverageRating);
        dest.writeString(this.mCanonicalVolumeLink);
        dest.writeStringList(this.mCategories);
        dest.writeString(this.mContentVersion);
        dest.writeString(this.mDescription);
        dest.writeParcelable(this.mImageLinks, flags);
        dest.writeTypedList(this.mIndustryIdentifiers);
        dest.writeString(this.mInfoLink);
        dest.writeString(this.mLanguage);
        dest.writeString(this.mMaturityRating);
        dest.writeValue(this.mPageCount);
        dest.writeParcelable(this.mPanelizationSummary, flags);
        dest.writeString(this.mPreviewLink);
        dest.writeString(this.mPrintType);
        dest.writeString(this.mPublishedDate);
        dest.writeString(this.mPublisher);
        dest.writeValue(this.mRatingsCount);
        dest.writeParcelable(this.mReadingModes, flags);
        dest.writeString(this.mSubtitle);
        dest.writeString(this.mTitle);
    }

    public VolumeInfo() {
    }

    protected VolumeInfo(Parcel in) {
        this.mAllowAnonLogging = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.mAuthors = in.createStringArrayList();
        this.mAverageRating = (Double) in.readValue(Double.class.getClassLoader());
        this.mCanonicalVolumeLink = in.readString();
        this.mCategories = in.createStringArrayList();
        this.mContentVersion = in.readString();
        this.mDescription = in.readString();
        this.mImageLinks = in.readParcelable(ImageLinks.class.getClassLoader());
        this.mIndustryIdentifiers = in.createTypedArrayList(IndustryIdentifier.CREATOR);
        this.mInfoLink = in.readString();
        this.mLanguage = in.readString();
        this.mMaturityRating = in.readString();
        this.mPageCount = (Long) in.readValue(Long.class.getClassLoader());
        this.mPanelizationSummary = in.readParcelable(PanelizationSummary.class.getClassLoader());
        this.mPreviewLink = in.readString();
        this.mPrintType = in.readString();
        this.mPublishedDate = in.readString();
        this.mPublisher = in.readString();
        this.mRatingsCount = (Long) in.readValue(Long.class.getClassLoader());
        this.mReadingModes = in.readParcelable(ReadingModes.class.getClassLoader());
        this.mSubtitle = in.readString();
        this.mTitle = in.readString();
    }

    public static final Parcelable.Creator<VolumeInfo> CREATOR = new Parcelable.Creator<VolumeInfo>() {
        @Override
        public VolumeInfo createFromParcel(Parcel source) {
            return new VolumeInfo(source);
        }

        @Override
        public VolumeInfo[] newArray(int size) {
            return new VolumeInfo[size];
        }
    };
}
