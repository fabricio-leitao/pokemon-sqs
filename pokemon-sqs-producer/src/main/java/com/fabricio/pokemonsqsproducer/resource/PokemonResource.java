package com.fabricio.pokemonsqsproducer.resource;

import com.fabricio.pokemonsqsproducer.service.PokemonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon/")
@RequiredArgsConstructor
@Slf4j
public class PokemonResource {

    private final PokemonService pokemonService;

    @GetMapping("{id}")
    public ResponseEntity<Void> get(@PathVariable String id){
        try{
            pokemonService.consultAndPublish(id);
            return ResponseEntity.ok().build();
        } catch (RuntimeException e){
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }
}
