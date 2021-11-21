package com.fabricio.pokemonsqsproducer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TypeDto {

    @JsonProperty
    private String name;
}
