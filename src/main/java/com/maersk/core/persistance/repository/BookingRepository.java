package com.maersk.core.persistance.repository;

import com.maersk.core.persistance.model.to.BookingRequest;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookingRepository extends ReactiveCassandraRepository<BookingRequest, String> {
}
