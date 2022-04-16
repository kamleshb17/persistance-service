package com.maersk.core.persistance.service;

import com.maersk.core.persistance.model.to.BookingRequest;
import reactor.core.publisher.Mono;

public interface IBookingPersistanceService {

    Mono<BookingRequest> persistBooking(final BookingRequest bookingRequest);
}
