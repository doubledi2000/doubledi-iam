package com.doubledi.iam.room.appication.domain.cmd;

import com.doubledi.iam.room.infrastructure.support.enums.TypeOfFilmStatus;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TypeOfFilmCreateCmd {
    private String id;
    private String code;
    private String name;
    private String description;
    private TypeOfFilmStatus status;
}
