package com.api.crudpeaple.dto.response;

import lombok.Data;

@Data
public class PersonResponse {
    private Long id;
    private String name;
    private String cpf;
    private String age;
}
