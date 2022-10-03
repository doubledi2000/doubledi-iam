package com.doubledi.iam.room.appication.service;

import com.doubledi.iam.room.appication.domain.Producer;
import com.doubledi.iam.room.appication.dto.request.ProducerCreateRequest;

public interface ProducerService {
    Producer create(ProducerCreateRequest request);

    Producer update(String id, ProducerCreateRequest request);

    Producer getById(String id);

    void deleted(String id);
}
