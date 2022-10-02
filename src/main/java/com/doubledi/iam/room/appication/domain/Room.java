package com.doubledi.iam.room.appication.domain;

import com.doubledi.common.model.domain.AuditableDomain;
import com.doubledi.common.model.validator.ValidateConstraint;
import com.doubledi.iam.room.infrastructure.support.enums.RoomStatus;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Room extends AuditableDomain {
    private String id;
    private String code;
    private String name;
    private String description;
    private RoomStatus status;
    private Boolean deleted;
    private Integer maxRow;
    private Integer maxChairPerRow;
    private String locationId;

    private Location location;
    private List<Row> rows;
}
