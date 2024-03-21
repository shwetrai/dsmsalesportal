package com.ba.dsmsalesportal.api.model;

import org.springframework.stereotype.Component;
import java.util.List;
@Component
public class Pipeline {

    private List<Opportunity> instances;

    public List<Opportunity> getInstances() {
        return instances;
    }

    public void setInstances(List<Opportunity> instances) {
        this.instances = instances;
    }
}
