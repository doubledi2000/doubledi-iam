package com.doubledi.iam.room.appication.domain.cmd;

import com.doubledi.iam.room.appication.dto.request.RowCreateRequest;
import com.doubledi.iam.room.infrastructure.support.enums.RoomStatus;
import lombok.Builder;
import lombok.Data;

import javax.validation.Valid;
import java.util.List;

@Data
@Builder
public class RoomCreateCmd {
    private String id;
    private String code;
    private String name;
    private String description;
    private RoomStatus status;
    private Integer maxRow;
    private Integer maxChairPerRow;
    private String locationId;
    List<@Valid RowCreateRequest> rows;
}
