package com.doubledi.iam.room.infrastructure.persistence.repository;

import com.doubledi.iam.room.infrastructure.persistence.entity.ChairEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChairEntityRepository extends JpaRepository<ChairEntity, String> {
}
