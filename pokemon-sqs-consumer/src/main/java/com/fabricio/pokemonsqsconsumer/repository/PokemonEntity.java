package com.fabricio.pokemonsqsconsumer.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@DynamoDBTable(tableName = "pokemons")
public class PokemonEntity implements Serializable {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    @EqualsAndHashCode.Include
    private String idD;
    @DynamoDBAttribute
    private String id;
    @DynamoDBAttribute
    private String name;
    @DynamoDBAttribute
    private String height;
    @DynamoDBAttribute
    private String weight;
    @DynamoDBTypeConvertedJson
    private List<TypesEntity> types;
}
