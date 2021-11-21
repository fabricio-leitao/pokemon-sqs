package com.fabricio.pokemonsqsproducer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PokemonDto {

    @JsonProperty
    private String id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String height;
    @JsonProperty
    private String weight;
    @JsonProperty
    private List<TypesDto> types;
}
