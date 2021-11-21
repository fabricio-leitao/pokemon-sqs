package com.fabricio.pokemonsqsproducer.mapper;

import com.fabricio.pokemonsqsproducer.domain.Pokemon;
import com.fabricio.pokemonsqsproducer.dto.PokemonDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(
        uses =
        TypesMapper.class
)
public interface PokemonMapper {

    PokemonMapper INSTANCE = Mappers.getMapper(PokemonMapper.class);

    Pokemon mapFrom(final PokemonDto pokemonDto);
}
