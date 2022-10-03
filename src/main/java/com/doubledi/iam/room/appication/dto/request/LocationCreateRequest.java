package com.doubledi.iam.room.appication.dto.request;

import com.doubledi.common.model.request.Request;
import com.doubledi.common.model.validator.ValidateConstraint;
import com.doubledi.iam.room.infrastructure.support.enums.LocationStatus;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Data
@Builder
public class LocationCreateRequest extends Request {
    @NotBlank(message = "ID_REQUIRED")
    @Size(max = ValidateConstraint.LENGTH.ID_MAX_LENGTH, message = "ID_LENGTH")
    private String id;

    @NotBlank(message = "CODE_REQUIRED")
    @Pattern(regexp = ValidateConstraint.FORMAT.CODE_PATTERN, message = "CODE_WRONG_PATTERN")
    private String code;

    @NotBlank(message = "NAME_REQUIRED")
    @Size(max = ValidateConstraint.LENGTH.NAME_MAX_LENGTH)
    private String name;

    private LocationStatus status;

}
