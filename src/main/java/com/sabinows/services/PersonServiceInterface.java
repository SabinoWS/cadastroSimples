package com.sabinows.services;

import java.util.List;
import com.sabinows.domain.Person;

public interface PersonServiceInterface {

    void save (Person person);
    List<Person> findAll();
}

