package com.fabricio.pokemonsqsproducer.service;

import com.fabricio.pokemonsqsproducer.client.PokemonClient;
import com.fabricio.pokemonsqsproducer.domain.Pokemon;
import com.fabricio.pokemonsqsproducer.dto.PokemonDto;
import com.fabricio.pokemonsqsproducer.mapper.PokemonMapper;
import com.fabricio.pokemonsqsproducer.messaging.PokemonPublisher;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PokemonService {

    private final PokemonClient pokemonClient;
    private final PokemonPublisher pokemonPublisher;

    public void consultAndPublish(String id){
        final PokemonDto pokemonDto = pokemonClient.getId(id);
        final Pokemon pokemon = PokemonMapper.INSTANCE.mapFrom(pokemonDto);
        log.info(String.format("Pokemon: %s" , pokemon));
        pokemonPublisher.publish(pokemon);
    }
}
