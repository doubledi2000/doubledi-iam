package com.doubledi.iam.infrastructure.persistence.repository;

import com.doubledi.iam.infrastructure.persistence.entity.PermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionEntityRepository extends JpaRepository<PermissionEntity, String> {
}
