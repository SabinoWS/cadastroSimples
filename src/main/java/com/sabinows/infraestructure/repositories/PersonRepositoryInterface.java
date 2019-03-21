package com.sabinows.infraestructure.repositories;

import java.util.List;
import com.sabinows.domain.Person;

public interface PersonRepositoryInterface {

    void save(Person person);
    List<Person> findAll();
}
