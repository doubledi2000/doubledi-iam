package com.doubledi.iam.room.appication.domain;

import com.doubledi.common.model.domain.AuditableDomain;
import com.doubledi.iam.room.infrastructure.support.enums.TypeOfFilmStatus;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class TypeOfFilm extends AuditableDomain {
    private String id;
    private String code;
    private String name;
    private String description;
    private TypeOfFilmStatus status;
    private Boolean deleted;
}
