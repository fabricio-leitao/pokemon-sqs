package com.fabricio.pokemonsqsproducer.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Type implements Serializable {
    private String name;
}
