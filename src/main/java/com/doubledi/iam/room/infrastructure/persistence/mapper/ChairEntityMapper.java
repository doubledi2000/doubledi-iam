package com.doubledi.iam.room.infrastructure.persistence.mapper;

import com.doubledi.common.model.mapper.EntityMapper;
import com.doubledi.iam.room.appication.domain.Chair;
import com.doubledi.iam.room.infrastructure.persistence.entity.ChairEntity;
import org.hibernate.annotations.Entity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ChairEntityMapper extends EntityMapper<Chair, ChairEntity> {
}
