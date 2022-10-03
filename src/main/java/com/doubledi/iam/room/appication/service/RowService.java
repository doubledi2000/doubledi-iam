package com.doubledi.iam.room.appication.service;

import com.doubledi.iam.room.appication.domain.Row;
import com.doubledi.iam.room.appication.dto.request.RowCreateRequest;

public interface RowService {
    Row create(RowCreateRequest request);

    Row update(String id, RowCreateRequest request);

    Row getById(String id);

    void deleted(String id);
}
