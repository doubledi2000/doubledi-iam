package com.doubledi.iam.infrastructure.persistence.entity;

import com.doubledi.common.model.entity.AuditableEntity;
import com.doubledi.common.model.validator.ValidateConstraint;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "user_role", indexes = {
        @Index(name = "user_role_deleted_idx", columnList = "deleted")
})
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRoleEntity extends AuditableEntity {
    @Id
    @Column(name = "id", length = ValidateConstraint.LENGTH.ID_MAX_LENGTH, nullable = false)
    private String id;

    @Column(name = "user_id", length = ValidateConstraint.LENGTH.ID_MAX_LENGTH, nullable = false)
    private String userId;

    @Column(name = "role_id", length = ValidateConstraint.LENGTH.ID_MAX_LENGTH, nullable = false)
    private String roleId;

    @Column(name = "deleted", nullable = false)
    private Boolean deleted;


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || Hibernate.getClass(o) != Hibernate.getClass(this)) return false;
//        UserRoleEntity that = (UserRoleEntity) o;
//        return o != null && Objects.equals(that.getId(), id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(id);
//    }
}
