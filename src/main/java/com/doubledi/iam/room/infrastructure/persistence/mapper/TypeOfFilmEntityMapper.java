package com.doubledi.iam.room.infrastructure.persistence.mapper;

import com.doubledi.common.model.mapper.EntityMapper;
import com.doubledi.iam.room.appication.domain.TypeOfFilm;
import com.doubledi.iam.room.infrastructure.persistence.entity.TypeOfFilmEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TypeOfFilmEntityMapper extends EntityMapper<TypeOfFilm, TypeOfFilmEntity> {
}
