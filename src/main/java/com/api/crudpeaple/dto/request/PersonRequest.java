package com.api.crudpeaple.dto.request;

import lombok.Data;

@Data
public class PersonRequest {
    private String name;
    private String cpf;
    private String age;
}
