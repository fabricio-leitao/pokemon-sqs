package com.fabricio.pokemonsqsproducer.mapper;

import com.fabricio.pokemonsqsproducer.domain.Types;
import com.fabricio.pokemonsqsproducer.dto.TypesDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = TypeMapper.class)
public interface TypesMapper {

    TypesMapper INSTANCE = Mappers.getMapper(TypesMapper.class);

    List<Types> mapFrom(final List<TypesDto> typesDto);
}
