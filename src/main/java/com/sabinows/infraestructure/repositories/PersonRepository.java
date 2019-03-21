package com.sabinows.infraestructure.repositories;

import org.springframework.stereotype.Repository;
import com.sabinows.domain.Person;

@Repository
public class PersonRepository extends AbstractRepository<Person, Long> implements PersonRepositoryInterface {

}
