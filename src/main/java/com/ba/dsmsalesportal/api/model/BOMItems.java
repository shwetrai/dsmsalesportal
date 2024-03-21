package com.ba.dsmsalesportal.api.model;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BOMItems {

    private List<BillOfMaterial> instances;

    public List<BillOfMaterial> getInstances() {
        return instances;
    }

    public void setInstances(List<BillOfMaterial> instances) {
        this.instances = instances;
    }
}
