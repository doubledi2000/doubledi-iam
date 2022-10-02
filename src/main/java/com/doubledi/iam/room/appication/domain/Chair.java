package com.doubledi.iam.room.appication.domain;

import com.doubledi.common.model.domain.AuditableDomain;
import com.doubledi.common.model.validator.ValidateConstraint;
import com.doubledi.iam.room.infrastructure.support.enums.ChairType;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Chair extends AuditableDomain {
    private String id;
    private String code;
    private String name;
    private ChairType chairType;
    private Boolean deleted;
    private String rowId;

}
