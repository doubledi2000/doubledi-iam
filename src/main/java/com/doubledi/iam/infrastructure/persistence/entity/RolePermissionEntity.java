package com.doubledi.iam.infrastructure.persistence.entity;

import com.doubledi.common.model.entity.AuditableEntity;
import com.doubledi.common.model.enums.Property;
import com.doubledi.common.model.validator.ValidateConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
@Table(name = "role_permission", indexes = {
        @Index(name = "role_permission_role_id_idx", columnList = "role_id"),
        @Index(name = "role_permission_deleted_idx", columnList = "deleted")
}
)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolePermissionEntity extends AuditableEntity {

    @Id
    @Column(name = "id", length = ValidateConstraint.LENGTH.ID_MAX_LENGTH, nullable = false)
    private String id;

    @Column(name = "property", length = ValidateConstraint.LENGTH.ENUM_MAX_LENGTH, nullable = false)
    @Enumerated(EnumType.STRING)
    private Property property;

    @Column(name = "role_id", length = ValidateConstraint.LENGTH.ID_MAX_LENGTH, nullable = false)
    private String roleId;

    @Column(name = "deleted")
    private Boolean deleted;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (id == null || Hibernate.getClass(o) != Hibernate.getClass(this)) return false;
        RolePermissionEntity that = (RolePermissionEntity) o;
        return id != null & Objects.equals(that.getId(), id);
    }
}
