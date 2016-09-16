package com.varun.hangover.models;

/**
 * Created by Administrator on 16 Sep,2016.
 */
public class LiquorModel {

    private String liquorId;
    private String liquorName;
    private String liquorAbout;
    private String liquorLikes;
    private String liquorLogo;
    private String brandName;
    private String typeName;

    public String getLiquorId() {
        return liquorId;
    }

    public void setLiquorId(String liquorId) {
        this.liquorId = liquorId;
    }

    public String getLiquorName() {
        return liquorName;
    }

    public void setLiquorName(String liquorName) {
        this.liquorName = liquorName;
    }

    public String getLiquorAbout() {
        return liquorAbout;
    }

    public void setLiquorAbout(String liquorAbout) {
        this.liquorAbout = liquorAbout;
    }

    public String getLiquorLikes() {
        return liquorLikes;
    }

    public void setLiquorLikes(String liquorLikes) {
        this.liquorLikes = liquorLikes;
    }

    public String getLiquorLogo() {
        return liquorLogo;
    }

    public void setLiquorLogo(String liquorLogo) {
        this.liquorLogo = liquorLogo;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
