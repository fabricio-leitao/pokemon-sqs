package com.fabricio.pokemonsqsconsumer.mapper;

import com.fabricio.pokemonsqsconsumer.domain.Pokemon;
import com.fabricio.pokemonsqsconsumer.repository.PokemonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(
        uses =
        TypesMapper.class
)
public interface PokemonMapper {

    PokemonMapper INSTANCE = Mappers.getMapper(PokemonMapper.class);

    @Mapping(target = "idD", ignore = true)
    PokemonEntity mapFrom(final Pokemon pokemon);
}
