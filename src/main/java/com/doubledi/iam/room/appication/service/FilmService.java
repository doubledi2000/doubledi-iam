package com.doubledi.iam.room.appication.service;

import com.doubledi.iam.room.appication.domain.Film;
import com.doubledi.iam.room.appication.dto.request.FilmCreateRequest;

public interface FilmService {
    Film create(FilmCreateRequest request);

    Film update(String id, FilmCreateRequest request);

    Film getById(String id);

    void deleted(String id);
}
