package com.doubledi.iam.room.appication.domain.cmd;

import com.doubledi.iam.room.infrastructure.support.enums.LocationStatus;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LocationCreateCmd {
    private String id;
    private String code;
    private String name;
    private LocationStatus status;
}
