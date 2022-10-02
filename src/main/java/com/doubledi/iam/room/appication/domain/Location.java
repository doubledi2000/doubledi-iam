package com.doubledi.iam.room.appication.domain;

import com.doubledi.common.model.domain.AuditableDomain;
import com.doubledi.iam.room.infrastructure.support.enums.LocationStatus;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Location extends AuditableDomain {
    private String id;
    private String code;
    private String name;
    private LocationStatus status;
    private Boolean deleted;

}
