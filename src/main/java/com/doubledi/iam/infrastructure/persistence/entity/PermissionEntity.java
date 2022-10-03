package com.doubledi.iam.infrastructure.persistence.entity;

import com.doubledi.common.model.entity.AuditableEntity;
import com.doubledi.common.model.enums.Scope;
import com.doubledi.common.model.validator.ValidateConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "permission")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PermissionEntity extends AuditableEntity {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "scope", length = ValidateConstraint.LENGTH.ENUM_MAX_LENGTH, nullable = false)
    @Enumerated(EnumType.STRING)
    private Scope scope;

    @Column(name = "resoure_code", length = ValidateConstraint.LENGTH.CODE_MAX_LENGTH, nullable = false)
    private String resourceCode;

    @Column(name = "name", length = ValidateConstraint.LENGTH.NAME_MAX_LENGTH, nullable = false)
    private String name;

    @Column(name = "deleted", nullable = false)
    private Boolean deleted;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || Hibernate.getClass(o) != Hibernate.getClass(this)) return false;
//        PermissionEntity that = (PermissionEntity) o;
//        return id != null && Objects.equals(that.id, id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(id);
//    }
}
