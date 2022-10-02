package com.doubledi.iam.room.appication.domain;

import com.doubledi.common.model.domain.AuditableDomain;
import com.doubledi.common.model.validator.ValidateConstraint;
import com.doubledi.iam.room.infrastructure.support.enums.FilmStatus;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Film extends AuditableDomain {
    private String id;
    private String code;
    private String name;
    private Integer allowedAgeFrom;
    private FilmStatus status;
    private String description;
    private LocalDate releaseDate;
    private LocalDate ownershipDate;
    private Integer duration;
    private String producerId;
    private Boolean deleted;
}
