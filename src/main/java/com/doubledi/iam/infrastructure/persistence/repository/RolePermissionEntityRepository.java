package com.doubledi.iam.infrastructure.persistence.repository;

import com.doubledi.iam.infrastructure.persistence.entity.RolePermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolePermissionEntityRepository extends JpaRepository<RolePermissionEntity, String> {
}
