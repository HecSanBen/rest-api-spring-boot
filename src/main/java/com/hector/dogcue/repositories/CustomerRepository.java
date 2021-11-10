package com.hector.dogcue.repositories;

import com.hector.dogcue.models.CustomerModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerModel, Long> {

}
