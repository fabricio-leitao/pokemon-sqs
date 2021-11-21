package com.fabricio.pokemonsqsproducer.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
public class Pokemon implements Serializable {

    private String id;
    private String name;
    private String height;
    private String weight;
    private List<Types> types;

}
