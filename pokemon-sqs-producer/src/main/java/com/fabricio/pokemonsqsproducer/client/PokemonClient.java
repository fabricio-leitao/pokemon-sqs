package com.fabricio.pokemonsqsproducer.client;

import com.fabricio.pokemonsqsproducer.dto.PokemonDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient(name = "pokemon", url = "https://pokeapi.co/api/v2/pokemon/")
public interface PokemonClient {

    @RequestMapping(method = RequestMethod.GET, value = "{id}", consumes = "application/json")
    PokemonDto getId(@PathVariable("id") String id);
}
