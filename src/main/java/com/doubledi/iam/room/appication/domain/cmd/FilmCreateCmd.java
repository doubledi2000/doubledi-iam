package com.doubledi.iam.room.appication.domain.cmd;

import com.doubledi.iam.room.infrastructure.support.enums.FilmStatus;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class FilmCreateCmd {
    private String id;
    private String code;
    private String name;
    private Integer allowedAgeFrom;
    private FilmStatus status;
    private String description;
    private LocalDate releaseDate;
    private LocalDate ownershipDate;
    private Integer duration;
    private String producerId;
    private List<String> typeOfFilmIds;
}
