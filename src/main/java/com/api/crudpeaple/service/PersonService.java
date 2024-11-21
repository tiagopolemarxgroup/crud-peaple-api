package com.api.crudpeaple.service;

import com.api.crudpeaple.dto.request.PersonRequest;
import com.api.crudpeaple.dto.response.PersonResponse;
import java.util.List;

public interface PersonService {
    PersonResponse save(PersonRequest personRequest);
    PersonResponse findById(Long id);
    List<PersonResponse> findAll();
    PersonResponse update(PersonRequest personRequest);
    void deleteById(Long id);
}
