package com.doubledi.iam.room.appication.domain;

import com.doubledi.common.model.domain.AuditableDomain;
import com.doubledi.common.model.validator.ValidateConstraint;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Producer extends AuditableDomain {
    private String id;
    private String code;
    private String name;
    private String description;
    private String deleted;
    private String representative;
    private String nationally;

}
