package com.doubledi.iam.room.appication.dto.request;

import com.doubledi.common.model.request.Request;
import com.doubledi.common.model.validator.ValidateConstraint;
import com.doubledi.iam.room.infrastructure.support.enums.FilmStatus;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class FilmCreateRequest extends Request {
    @NotBlank(message = "ID_REQUIRED")
    @Size(max = ValidateConstraint.LENGTH.ID_MAX_LENGTH, message = "ID_LENGTH")
    private String id;

    @NotBlank(message = "CODE_REQUIRED")
    @Pattern(regexp = ValidateConstraint.FORMAT.CODE_PATTERN, message = "CODE_WRONG_FORMAT")
    private String code;

    @NotBlank(message = "NAME_REQUIRED")
    @Size(max = ValidateConstraint.LENGTH.NAME_MAX_LENGTH, message = "NAME_LENGTH")
    private String name;

    @NotNull(message = "ALLOWED_AGE_FROM_REQUIRED")
    @Min(value = 0, message = "ALLOWED_AGE_FROM_MIN")
    private Integer allowedAgeFrom;

    private FilmStatus status;

    @Size(max = ValidateConstraint.LENGTH.DESC_MAX_LENGTH)
    private String description;

    private LocalDate releaseDate;

    private LocalDate ownershipDate;

    @NotNull(message = "DURATION_REQUIRED")
    @Min(value = 1, message = "DURATION_MIN")
    private Integer duration;

    @NotBlank(message = "PRODUCER_REQUIRED")
    @Size(max = ValidateConstraint.LENGTH.ID_MAX_LENGTH)
    private String producerId;

//    @NotEmpty(message = "TYPE_OF_FILM_REQUIED")
    private List<String> typeOfFilmIds;
}
