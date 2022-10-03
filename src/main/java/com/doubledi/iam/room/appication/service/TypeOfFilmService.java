package com.doubledi.iam.room.appication.service;

import com.doubledi.iam.room.appication.domain.TypeOfFilm;
import com.doubledi.iam.room.appication.dto.request.TypeOfFilmCreateRequest;

public interface TypeOfFilmService {
    TypeOfFilm create(TypeOfFilmCreateRequest request);

    TypeOfFilm update(String id, TypeOfFilmCreateRequest request);

    TypeOfFilm getById(String id);

    void deleted(String id);

}
