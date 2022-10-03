package com.doubledi.iam.room.appication.service;

import com.doubledi.iam.room.appication.domain.Room;
import com.doubledi.iam.room.appication.dto.request.RoomCreateRequest;

public interface RoomService {
    Room create(RoomCreateRequest request);

    Room update(String id, RoomCreateRequest request);

    Room getById(String id);

    void deleted(String id);
}
