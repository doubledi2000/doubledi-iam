package com.doubledi.iam.room.infrastructure.persistence.entity;

import com.doubledi.common.model.entity.AuditableEntity;
import com.doubledi.common.model.validator.ValidateConstraint;
import com.doubledi.iam.infrastructure.persistence.entity.RoleEntity;
import com.doubledi.iam.room.infrastructure.support.enums.LocationStatus;
import lombok.Data;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "location", indexes = {
        @Index(name = "location_deleted_idx", columnList = "deleted")
})
@Data
public class LocationEntity extends AuditableEntity {
    @Id
    @Column(name ="id",length = ValidateConstraint.LENGTH.ID_MAX_LENGTH, nullable = false)
    private String id;

    @Column(name = "code", length = ValidateConstraint.LENGTH.CODE_MAX_LENGTH)
    private String code;

    @Column(name = "name", length = ValidateConstraint.LENGTH.NAME_MAX_LENGTH)
    private String name;

    @Column(name = "status", length = ValidateConstraint.LENGTH.ENUM_MAX_LENGTH)
    @Enumerated(EnumType.STRING)
    private LocationStatus status;

    @Column(name = "deleted")
    private Boolean deleted;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(o) != Hibernate.getClass(this)) return false;
        LocationEntity that = (LocationEntity) o;
        return id != null && Objects.equals(that.id, id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
