package com.api.crudpeaple.repository;

import com.api.crudpeaple.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {


}
