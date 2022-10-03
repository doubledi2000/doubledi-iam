package com.doubledi.iam.room.appication.service;

import com.doubledi.iam.room.appication.domain.Location;
import com.doubledi.iam.room.appication.dto.request.LocationCreateRequest;

public interface LocationService {
    Location create(LocationCreateRequest request);

    Location update(String id, LocationCreateRequest request);

    Location getById(String id);

    void deleted(String id);
}
