package com.fabricio.pokemonsqsproducer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TypesDto {

    @JsonProperty
    private String slot;
    @JsonProperty
    private TypeDto type;
}
