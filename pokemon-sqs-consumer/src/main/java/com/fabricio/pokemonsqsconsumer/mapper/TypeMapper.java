package com.fabricio.pokemonsqsconsumer.mapper;

import com.fabricio.pokemonsqsconsumer.domain.Type;
import com.fabricio.pokemonsqsconsumer.repository.TypeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TypeMapper {

    TypeMapper INSTANCE = Mappers.getMapper(TypeMapper.class);

    TypeEntity mapFrom(final Type type);
}
