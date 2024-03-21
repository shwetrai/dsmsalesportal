package com.ba.dsmsalesportal.api.service;

import com.ba.dsmsalesportal.api.model.BillOfMaterial;
import com.ba.dsmsalesportal.api.model.Opportunity;
import com.ba.dsmsalesportal.api.repository.BillOfMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillOfMaterialServiceImpl implements BillOfMaterialService{

    @Autowired
    private BillOfMaterialRepository billOfMaterialRepository;

    @Override
    public void create(BillOfMaterial billOfMaterial) {
        try {
            //System.out.println("Inventory ID : " + inventory.getProductID());
            billOfMaterialRepository.insert(billOfMaterial);

        } catch (Exception ex) {
            throw ex;
        }
    }
    @Override
    public BillOfMaterial findBOMByProductAndSize(String product, String size){
        return billOfMaterialRepository.findBOMByProductAndSize(product,size);

    }
}
