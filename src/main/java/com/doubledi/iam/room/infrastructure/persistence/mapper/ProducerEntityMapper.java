package com.doubledi.iam.room.infrastructure.persistence.mapper;

import com.doubledi.common.model.mapper.EntityMapper;
import com.doubledi.iam.room.appication.domain.Producer;
import com.doubledi.iam.room.infrastructure.persistence.entity.ProducerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProducerEntityMapper extends EntityMapper<Producer, ProducerEntity> {
}
