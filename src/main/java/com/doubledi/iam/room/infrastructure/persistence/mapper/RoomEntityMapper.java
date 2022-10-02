package com.doubledi.iam.room.infrastructure.persistence.mapper;

import com.doubledi.common.model.mapper.EntityMapper;
import com.doubledi.iam.room.appication.domain.Room;
import com.doubledi.iam.room.infrastructure.persistence.entity.RoomEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoomEntityMapper extends EntityMapper<Room, RoomEntity> {
}
