package com.fabricio.pokemonsqsconsumer.mapper;

import com.fabricio.pokemonsqsconsumer.domain.Types;
import com.fabricio.pokemonsqsconsumer.repository.TypesEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = TypeMapper.class)
public interface TypesMapper {

    TypesMapper INSTANCE = Mappers.getMapper(TypesMapper.class);

    List<TypesEntity> mapFrom(final List<Types> types);
}
