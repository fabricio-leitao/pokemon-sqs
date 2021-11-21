package com.fabricio.pokemonsqsconsumer.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@DynamoDBDocument
public class TypeEntity implements Serializable {

    @DynamoDBAttribute
    private String name;
}
