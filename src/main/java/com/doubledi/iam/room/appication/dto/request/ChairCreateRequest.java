package com.doubledi.iam.room.appication.dto.request;

import com.doubledi.common.model.request.Request;
import com.doubledi.common.model.validator.ValidateConstraint;
import com.doubledi.iam.room.infrastructure.support.enums.ChairType;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Builder
public class ChairCreateRequest extends Request {
    @NotBlank(message = "D_REQUIRED")
    @Size(max = ValidateConstraint.LENGTH.ID_MAX_LENGTH, message = "ID_LENGTH")
    private String id;

    @NotBlank(message = "CODE_REQUIRED")
    @Pattern(regexp = ValidateConstraint.FORMAT.CODE_PATTERN, message = "CODE_WRONG_FORMAT")
    private String code;

    @NotBlank(message = "NAME_REQUIRED")
    @Size(max = ValidateConstraint.LENGTH.NAME_MAX_LENGTH, message = "NAME_LENGTH")
    private String name;

    private ChairType chairType;

    @NotBlank(message = "ROW_ID_REQUIRED")
    @Size(max = ValidateConstraint.LENGTH.ID_MAX_LENGTH, message = "ROW_ID_LENGTH")
    private String rowId;
}
