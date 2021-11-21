package com.fabricio.pokemonsqsconsumer.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fabricio.pokemonsqsconsumer.domain.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DynamoDBDocument
public class TypesEntity {

    @DynamoDBAttribute
    private String slot;
    @DynamoDBAttribute
    private Type type;
}
