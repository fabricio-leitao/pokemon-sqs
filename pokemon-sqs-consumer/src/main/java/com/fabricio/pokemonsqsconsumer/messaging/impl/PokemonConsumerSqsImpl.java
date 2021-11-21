package com.fabricio.pokemonsqsconsumer.messaging.impl;

import com.fabricio.pokemonsqsconsumer.domain.Pokemon;
import com.fabricio.pokemonsqsconsumer.messaging.ConsumerSqs;
import com.fabricio.pokemonsqsconsumer.messaging.PokemonConsumerSqs;
import com.fabricio.pokemonsqsconsumer.repository.DynamoDbRepository;
import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ConsumerSqs
@RequiredArgsConstructor
public class PokemonConsumerSqsImpl implements PokemonConsumerSqs {

    private final DynamoDbRepository dynamoDbRepository;

    @SqsListener(value = "data_queue", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    @Override
    public void consume(Pokemon pokemon) {
        dynamoDbRepository.save(pokemon);
        log.info(String.format("%s catalogado com sucesso!", pokemon));
    }
}
