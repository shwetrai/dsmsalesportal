package com.ba.dsmsalesportal.api.repository;

import com.ba.dsmsalesportal.api.model.BillOfMaterial;
import com.ba.dsmsalesportal.api.model.Opportunity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BillOfMaterialRepository extends MongoRepository<BillOfMaterial, String> {



    @Query("{'product':?0,'size':?1}")
    BillOfMaterial findBOMByProductAndSize(String product, String size);

    @Override
    List<BillOfMaterial> findAll();


    @Override
    void delete(BillOfMaterial deleted);
}
