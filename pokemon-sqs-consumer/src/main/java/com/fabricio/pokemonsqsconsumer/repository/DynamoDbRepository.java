package com.fabricio.pokemonsqsconsumer.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.fabricio.pokemonsqsconsumer.domain.Pokemon;
import com.fabricio.pokemonsqsconsumer.mapper.PokemonMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DynamoDbRepository {

    private final DynamoDBMapper dynamoDBMapper;

    public void save(final Pokemon pokemon){
        dynamoDBMapper.save(PokemonMapper.INSTANCE.mapFrom(pokemon));
    }
}
