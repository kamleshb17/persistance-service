package com.maersk.core.persistance.controller.impl;

import com.maersk.core.persistance.controller.IBookingPersistanceResource;
import com.maersk.core.persistance.model.to.BookingRequest;
import com.maersk.core.persistance.service.IBookingPersistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
public class BookingPersistanceResource implements IBookingPersistanceResource {

    private IBookingPersistanceService persistanceService;


    @Autowired
    public void setPersistanceService(IBookingPersistanceService persistanceService) {
        this.persistanceService = persistanceService;
    }

    @Override
    @PostMapping("getBookingReference")
    public Mono<String> getBookingReference(@RequestBody BookingRequest bookingRequest) {
        final Mono<BookingRequest> bookingRequestMono = persistanceService.persistBooking(bookingRequest);
        return Mono.just(bookingRequest.getBookingReference());
    }
}
