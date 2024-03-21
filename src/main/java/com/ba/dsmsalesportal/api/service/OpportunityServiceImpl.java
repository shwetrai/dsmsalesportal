package com.ba.dsmsalesportal.api.service;

import com.ba.dsmsalesportal.api.model.Opportunity;
import com.ba.dsmsalesportal.api.repository.OpportunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OpportunityServiceImpl implements OpportunityService {

    @Autowired
    private OpportunityRepository opportunityRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Opportunity> findAll(){
        return opportunityRepository.findAll();
    }

    @Override
    public void create(Opportunity opportunity) {
        try {
            //System.out.println("Inventory ID : " + inventory.getProductID());
            opportunityRepository.insert(opportunity);

        } catch (Exception ex) {
            throw ex;
        }
    }

    @Override
    public Optional<Opportunity> findById(String id) {
        return opportunityRepository.findById(id);
    }

    @Override
    public List<Opportunity> findOpportunityByPartner(String partnerName) {
        return opportunityRepository.findOpportunityByPartner(partnerName);
    }

    @Override
    public Opportunity findAndUpdateOpportunityStatusByID (Opportunity opportunity){

        Query query = new Query().addCriteria(Criteria.where("_id").is(opportunity.getOpportunityID()));
        FindAndModifyOptions options = new FindAndModifyOptions().returnNew(true).upsert(true);

        Update updateDefinition = new Update().set("currentStatus",opportunity.getCurrentStatus());
//        updateDefinition.set("assignedTo",inventory.getAssignedTo());
//        updateDefinition.set("releasedBy",inventory.getReleasedBy());
//        updateDefinition.set("releasedDate",inventory.getReleasedDate());
        return mongoTemplate.findAndModify(query,updateDefinition,options,Opportunity.class);
    }

}
