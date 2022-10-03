package com.doubledi.iam.room.appication.domain.cmd;

import com.doubledi.iam.room.appication.dto.request.ChairCreateRequest;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class RowCreateCmd {
    private String id;
    private String code;
    private String name;
    private Integer rowNumber;
    private String roomId;
    private List<ChairCreateRequest> chairs;
}
