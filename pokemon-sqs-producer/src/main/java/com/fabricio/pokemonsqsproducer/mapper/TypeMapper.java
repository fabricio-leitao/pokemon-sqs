package com.fabricio.pokemonsqsproducer.mapper;

import com.fabricio.pokemonsqsproducer.domain.Type;
import com.fabricio.pokemonsqsproducer.dto.TypeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TypeMapper {

    TypeMapper INSTANCE = Mappers.getMapper(TypeMapper.class);

    Type mapFrom(final TypeDto typeDto);
}
