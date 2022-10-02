package com.doubledi.iam.room.infrastructure.persistence.mapper;

import com.doubledi.common.model.mapper.EntityMapper;
import com.doubledi.iam.room.appication.domain.Location;
import com.doubledi.iam.room.infrastructure.persistence.entity.LocationEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocationEntityMapper extends EntityMapper<Location, LocationEntity> {
}
