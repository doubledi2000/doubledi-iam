package com.doubledi.iam.room.infrastructure.persistence.entity;

import com.doubledi.common.model.validator.ValidateConstraint;
import com.doubledi.iam.room.infrastructure.support.enums.ChairType;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "chair", indexes = {
        @Index(name = "chair_deleted_idx", columnList = "deleted"),
        @Index(name = "chair_row_id_idx", columnList = "row_id")
})
public class ChairEntity {
    @Id
    @Column(name = "id", length = ValidateConstraint.LENGTH.ID_MAX_LENGTH)
    private String id;

    @Column(name = "code", length = ValidateConstraint.LENGTH.CODE_MAX_LENGTH)
    private String code;

    @Column(name = "name", length = ValidateConstraint.LENGTH.NAME_MAX_LENGTH)
    private String name;

    @Column(name = "chair_type", length = ValidateConstraint.LENGTH.ENUM_MAX_LENGTH)
    private ChairType chairType;

    @Column(name = "deleted")
    private Boolean deleted;

    @Column(name = "row_id", length = ValidateConstraint.LENGTH.ID_MAX_LENGTH)
    private String rowId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(o) != Hibernate.getClass(this)) return false;
        ChairEntity that = (ChairEntity) o;
        return id != null && Objects.equals(that.id, id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
