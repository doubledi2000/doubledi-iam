package com.doubledi.iam.room.appication.domain.cmd;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProducerCreateCmd {
    private String id;
    private String code;
    private String name;
    private String description;
    private String representative;
    private String nationally;
}
