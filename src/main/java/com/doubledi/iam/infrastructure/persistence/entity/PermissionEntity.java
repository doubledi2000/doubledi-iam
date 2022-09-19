package com.doubledi.iam.infrastructure.persistence.entity;

import com.doubledi.common.model.entity.AuditableEntity;
import com.doubledi.common.model.validator.ValidateConstant;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "permission")
@Data
public class PermissionEntity extends AuditableEntity {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "scope", length = ValidateConstant.LENGTH.ENUM_MAX_LENGTH, nullable = false)
    @Enumerated(EnumType.STRING)
    private String scope;

    @Column(name = "resoure_code", length = ValidateConstant.LENGTH.CODE_MAX_LENGTH, nullable = false)
    private String resourceCode;

    @Column(name = "deleted", nullable = false)
    private String deleted;
}
