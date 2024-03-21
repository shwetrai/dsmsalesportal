package com.ba.dsmsalesportal.api.service;

import com.ba.dsmsalesportal.api.model.BillOfMaterial;
import com.ba.dsmsalesportal.api.model.Opportunity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BillOfMaterialService {

    void create(BillOfMaterial billOfMaterial);
    BillOfMaterial findBOMByProductAndSize(String product, String size);
}
