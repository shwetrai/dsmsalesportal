package com.ba.dsmsalesportal.api.repository;

import com.ba.dsmsalesportal.api.model.Opportunity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;
public interface OpportunityRepository extends MongoRepository<Opportunity, String> {

    @Override
    Optional<Opportunity> findById(String id);

    @Query("{'partnerName':?0}")
    List<Opportunity> findOpportunityByPartner(String partnerName);

    @Override
    List<Opportunity> findAll();


    @Override
    void delete(Opportunity deleted);


}
