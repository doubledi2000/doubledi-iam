package com.doubledi.iam.infrastructure.persistence.entity;


import com.doubledi.common.model.entity.AuditableEntity;
import com.doubledi.common.model.enums.Gender;
import com.doubledi.common.model.validator.ValidateConstant;
import lombok.Data;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "user")
@Data
public class UserEntity extends AuditableEntity {

    @Id
    @Column(name = "id", length = ValidateConstant.LENGTH.ID_MAX_LENGTH, nullable = false)
    private String id;

    @Column(name = "username", length = ValidateConstant.LENGTH.CODE_MAX_LENGTH, nullable = false)
    private String username;

    @Column(name = "password", length = ValidateConstant.LENGTH.VALUE_MAX_LENGTH, nullable = false)
    private String password;

    @Column(name = "fullname", length = ValidateConstant.LENGTH.NAME_MAX_LENGTH, nullable = false)
    private String fullname;

    @Column(name = "email", length = ValidateConstant.LENGTH.EMAIL_MAX_LENGTH, nullable = false)
    private String email;

    @Column(name = "phone_number", length = ValidateConstant.LENGTH.PHONE_MAX_LENGTH, nullable = false)
    private String phoneNumber;

    @Column(name = "day_of_birth")
    private LocalDate dayOfBirth;

    @Column(name = "gender", length = ValidateConstant.LENGTH.ENUM_MAX_LENGTH)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "deleted")
    private Boolean deleted;

    @Column(name = "employee_code", length = ValidateConstant.LENGTH.CODE_MAX_LENGTH)
    private String employeeCode;

    @Column(name = "title", length = ValidateConstant.LENGTH.TITLE_MAX_LENGTH)
    private String title;

    @Column(name = "department_name", length = ValidateConstant.LENGTH.NAME_MAX_LENGTH)
    private String departmentName;

    @Column(name = "description", length = ValidateConstant.LENGTH.DESC_MAX_LENGTH)
    private String description;

    @Column(name = "status", length = ValidateConstant.LENGTH.ENUM_MAX_LENGTH)
    @Enumerated(EnumType.STRING)
    private String status;

    @Column(name = "avatar_file_id", length = ValidateConstant.LENGTH.ID_MAX_LENGTH)
    private String avatarFileId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserEntity that = (UserEntity) o;
        return id != null && Objects.equals(id, that.getId());
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(id);
    }
}
