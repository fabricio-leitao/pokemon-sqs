package com.fabricio.pokemonsqsconsumer.messaging;

import com.fabricio.pokemonsqsconsumer.domain.Pokemon;

@FunctionalInterface
public interface PokemonConsumerSqs {

    public void consume(Pokemon pokemon);
}
