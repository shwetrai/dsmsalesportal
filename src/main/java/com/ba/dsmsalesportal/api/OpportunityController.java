package com.ba.dsmsalesportal.api;

import com.ba.dsmsalesportal.api.model.BOMItems;
import com.ba.dsmsalesportal.api.model.BillOfMaterial;
import com.ba.dsmsalesportal.api.model.Opportunity;
import com.ba.dsmsalesportal.api.model.Pipeline;
import com.ba.dsmsalesportal.api.service.BillOfMaterialServiceImpl;
import com.ba.dsmsalesportal.api.service.OpportunityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class OpportunityController {

    @Autowired
    private OpportunityServiceImpl opportunityServiceImpl;

    @Autowired
    private BillOfMaterialServiceImpl billOfMaterialServiceImpl;

    @Autowired
    private Pipeline pipeline;

    @Autowired
    private BOMItems bomItems;

    @Autowired
    private BillOfMaterial billOfMaterial;

    @GetMapping (value = "/opportunities/{partnerName}")
    public Pipeline getPipelineByPartnerName(@PathVariable("partnerName") String partnerName){
        List<Opportunity> opportunityList = opportunityServiceImpl.findOpportunityByPartner(partnerName);
        pipeline.setInstances(opportunityList);
        return pipeline;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/opportunity/update")
    public String updateOpportunity(@RequestBody Opportunity opportunity){
        opportunityServiceImpl.findAndUpdateOpportunityStatusByID(opportunity);
        return "Opportunity : "+opportunity.getOpportunityID() +" has been updated";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/opportunity/create")
    public String createOpportunity (@RequestBody Opportunity opportunity){
        try {
            System.out.println("Create Operation");

            opportunityServiceImpl.create(opportunity);

        }catch (Exception exception){
            exception.printStackTrace();
        }
        return " Opportunity Created";
    }

    // ********************* BILL OF MATERIAL **************
    @GetMapping (value = "/bom/{product}/{size}")
    public BOMItems getBOM(@PathVariable("product") String product, @PathVariable("size") String size){

        billOfMaterial =  billOfMaterialServiceImpl.findBOMByProductAndSize(product, size);
        List<BillOfMaterial> list = new ArrayList<BillOfMaterial>();
        list.add(billOfMaterial);
        bomItems.setInstances(list);

        return bomItems;

    }


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/bom/create")
    public String createOpportunity (@RequestBody BillOfMaterial billOfMaterial){
        try {
            System.out.println("Create Operation");

            billOfMaterialServiceImpl.create(billOfMaterial);

        }catch (Exception exception){
            exception.printStackTrace();
        }
        return "BOM Created";
    }
}
