package com.doubledi.iam.room.infrastructure.persistence.mapper;

import com.doubledi.common.model.mapper.EntityMapper;
import com.doubledi.iam.room.appication.domain.Film;
import com.doubledi.iam.room.infrastructure.persistence.entity.FilmEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FilmEntityMapper extends EntityMapper<Film, FilmEntity> {
}
