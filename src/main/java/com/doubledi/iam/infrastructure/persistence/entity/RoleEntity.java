package com.doubledi.iam.infrastructure.persistence.entity;

import com.doubledi.common.model.entity.AuditableEntity;
import com.doubledi.common.model.validator.ValidateConstant;
import com.doubledi.iam.infrastructure.support.enums.RoleLevel;
import com.doubledi.iam.infrastructure.support.enums.RoleStatus;
import lombok.Data;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "role", indexes = {
        @Index(name = "role_code_idx", columnList = "code"),
        @Index(name = "role_deleted_idx", columnList = "deleted")
})
@Data
public class RoleEntity extends AuditableEntity {

    @Id
    @Column(name = "id", length = ValidateConstant.LENGTH.ID_MAX_LENGTH, nullable = false)
    private String id;

    @Column(name = "code", length = ValidateConstant.LENGTH.CODE_MAX_LENGTH, nullable = false)
    private String code;

    @Column(name = "name", length = ValidateConstant.LENGTH.NAME_MAX_LENGTH, nullable = false)
    private String name;

    @Column(name = "description", length = ValidateConstant.LENGTH.DESC_MAX_LENGTH)
    private String description;

    @Column(name = "is_root", nullable = false)
    private Boolean isRoot;

    @Column(name = "deleted", nullable = false)
    private Boolean deleted;

    @Column(name = "status", length = ValidateConstant.LENGTH.ENUM_MAX_LENGTH, nullable = false)
    @Enumerated(EnumType.STRING)
    private RoleStatus status;

    @Column(name = "role_level", length = ValidateConstant.LENGTH.ENUM_MAX_LENGTH)
    @Enumerated(EnumType.STRING)
    private RoleLevel roleLevel;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(o) != Hibernate.getClass(this)) return false;
        RoleEntity that = (RoleEntity) o;
        return id != null && Objects.equals(that.id, id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
