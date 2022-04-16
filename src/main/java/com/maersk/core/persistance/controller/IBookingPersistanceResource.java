package com.maersk.core.persistance.controller;

import com.maersk.core.persistance.model.to.BookingRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController

public interface IBookingPersistanceResource {

    public String path = "/api/bookings/";
    @RequestMapping(path)
    Mono<String> getBookingReference(final @RequestBody BookingRequest bookingRequest);
}
