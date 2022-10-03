package com.doubledi.iam.room.appication.service;

import com.doubledi.iam.room.appication.domain.Chair;
import com.doubledi.iam.room.appication.dto.request.ChairCreateRequest;

public interface ChairService {

    Chair create(ChairCreateRequest request);

    Chair update(String id, ChairCreateRequest request);

    Chair getById(String id);

    void deleted(String id);
}
