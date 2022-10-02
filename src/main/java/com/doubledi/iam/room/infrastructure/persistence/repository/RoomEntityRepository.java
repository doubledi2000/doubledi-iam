package com.doubledi.iam.room.infrastructure.persistence.repository;

import com.doubledi.iam.room.infrastructure.persistence.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomEntityRepository extends JpaRepository<RoomEntity, String> {
}
