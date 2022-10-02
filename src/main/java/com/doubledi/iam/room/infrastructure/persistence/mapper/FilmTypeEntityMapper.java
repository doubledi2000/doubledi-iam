package com.doubledi.iam.room.infrastructure.persistence.mapper;

import com.doubledi.common.model.mapper.EntityMapper;
import com.doubledi.iam.room.appication.domain.FilmType;
import com.doubledi.iam.room.infrastructure.persistence.entity.FilmTypeEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FilmTypeEntityMapper extends EntityMapper<FilmType, FilmTypeEntity> {
}
