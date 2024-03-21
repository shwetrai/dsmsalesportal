package com.ba.dsmsalesportal.api.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

@Component
@Document("bom")
public class BillOfMaterial {

    @Field
    private String product;
    @Field
    private String category;
    @Field
    private String size;

    @Field
    private String partNumber;
    @Field
    private Integer licenseEntitlement;

    @Field
    private Integer listPrice;

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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public Integer getLicenseEntitlement() {
        return licenseEntitlement;
    }

    public void setLicenseEntitlement(Integer licenseEntitlement) {
        this.licenseEntitlement = licenseEntitlement;
    }

    public Integer getListPrice() {
        return listPrice;
    }

    public void setListPrice(Integer listPrice) {
        this.listPrice = listPrice;
    }
    // "PRODUCT", "CATEGORY", "SIZE", "PART_NUMBER", "LICENSE_ENTITLEMENT", "LIST_PRICE"
}
