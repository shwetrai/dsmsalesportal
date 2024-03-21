package com.ba.dsmsalesportal.api.service;

import com.ba.dsmsalesportal.api.model.Opportunity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface OpportunityService {

    void create(Opportunity opportunity);

    Optional<Opportunity> findById(String id);

    List<Opportunity> findOpportunityByPartner(String partnerName);
    List<Opportunity> findAll();


    Opportunity findAndUpdateOpportunityStatusByID(Opportunity opportunity);

}
