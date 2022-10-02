package com.doubledi.iam.room.appication.domain;

import com.doubledi.common.model.domain.AuditableDomain;
import com.doubledi.common.model.validator.ValidateConstraint;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Row  extends AuditableDomain {
    private String id;
    private String code;
    private String name;
    private Integer rowNumber;
    private Boolean deleted;
    private String roomId;

    private Room room;
    private List<Chair> chairs;
}
