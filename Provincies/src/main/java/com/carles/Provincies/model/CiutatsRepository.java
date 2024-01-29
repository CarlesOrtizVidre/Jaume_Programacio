package com.carles.Provincies.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface CiutatsRepository extends CrudRepository<Ciutat,Long> {



}



