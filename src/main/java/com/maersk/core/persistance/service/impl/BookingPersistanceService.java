package com.maersk.core.persistance.service.impl;

import com.maersk.core.persistance.model.to.BookingRequest;
import com.maersk.core.persistance.repository.BookingRepository;
import com.maersk.core.persistance.service.IBookingPersistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class BookingPersistanceService implements IBookingPersistanceService {

    private BookingRepository bookingRepository;

    @Override
    public Mono<BookingRequest> persistBooking(final BookingRequest bookingRequest) {
        return bookingRepository.save(bookingRequest);
    }

    @Autowired
    public void setBookingRepository(final BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

}
