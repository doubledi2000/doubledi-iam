package com.doubledi.iam.room.appication.dto.request;

import com.doubledi.common.model.request.Request;
import com.doubledi.common.model.validator.ValidateConstraint;
import lombok.Builder;
import lombok.Data;
import net.bytebuddy.agent.builder.AgentBuilder;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
public class RowCreateRequest extends Request {
    @NotBlank(message = "ID_REQUIRED")
    @Size(max = ValidateConstraint.LENGTH.ID_MAX_LENGTH, message = "ID_LENGTH")
    private String id;

    @NotBlank(message = "CODE_REQUIRED")
    @Pattern(regexp = ValidateConstraint.FORMAT.CODE_PATTERN, message = "CODE_WRONG_FORMAT")
    private String code;

    @NotBlank(message = "NAME_REQUIRED")
    @Size(max = ValidateConstraint.LENGTH.NAME_MAX_LENGTH, message = "NAME_LENGTH")
    private String name;

    @NotNull(message = "NUMBER_REQUIRED")
    @Min(value = 1, message = "ROW_NUMBER_MIN")
    private Integer rowNumber;

    @NotBlank( message = "ROOM_ID_REQUIRED")
    @Size(max = ValidateConstraint.LENGTH.ID_MAX_LENGTH, message = "ROOM_ID_LENGTH")
    private String roomId;

    private List<@Valid ChairCreateRequest> chairs;
}
