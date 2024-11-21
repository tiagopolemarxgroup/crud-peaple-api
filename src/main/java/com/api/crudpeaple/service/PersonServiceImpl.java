package com.api.crudpeaple.service;

import com.api.crudpeaple.dto.request.PersonRequest;
import com.api.crudpeaple.dto.response.PersonResponse;
import com.api.crudpeaple.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Primary
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    @Override
    public PersonResponse save(PersonRequest personRequest) {
        return null;
    }

    @Override
    public PersonResponse findById(Long id) {
        return null;
    }

    @Override
    public List<PersonResponse> findAll() {
        return List.of();
    }

    @Override
    public PersonResponse update(PersonRequest personRequest) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
