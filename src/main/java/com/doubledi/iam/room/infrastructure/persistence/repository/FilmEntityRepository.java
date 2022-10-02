package com.doubledi.iam.room.infrastructure.persistence.repository;

import com.doubledi.iam.room.infrastructure.persistence.entity.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmEntityRepository extends JpaRepository<FilmEntity, String> {
}
