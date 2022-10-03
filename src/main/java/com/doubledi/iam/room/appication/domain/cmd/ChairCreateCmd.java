package com.doubledi.iam.room.appication.domain.cmd;

import com.doubledi.iam.room.infrastructure.support.enums.ChairType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChairCreateCmd {
    private String id;
    private String code;
    private String name;
    private ChairType chairType;
    private String rowId;
}
