package com.ba.dsmsalesportal.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document ("opportunity")
public class Opportunity {

    @Id
    private String opportunityID;
    @Field
    private String partnerName;

    @Field
    private String description;

    @Field
    private String product;

    @Field
    private String category;

    @Field
    private String startDate;

    @Field
    private String endDate;

    @Field
    private String currentStatus;

    @Field
    private String gsiContact;
    //private String OPPORTUNITYID", "DESCRIPTION", "PRODUCT", "CATEGORY", "STARTDATE", "ENDDATE", "CURRENTSTATUS", "GSICONTACT"


    public String getOpportunityID() {
        return opportunityID;
    }

    public void setOpportunityID(String opportunityID) {
        this.opportunityID = opportunityID;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getGsiContact() {
        return gsiContact;
    }

    public void setGsiContact(String gsiContact) {
        this.gsiContact = gsiContact;
    }
}
