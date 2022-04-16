package com.maersk.core.persistance.model.to;

import com.maersk.core.persistance.model.ContainerType;

public class BookingRequestBuilder {
    private String bookingReference;
    private long containerSize;
    private ContainerType containerType;
    private String origin;
    private String destination;
    private int quantity;

    public BookingRequestBuilder withBookingReference(String bookingReference) {
        this.bookingReference = bookingReference;
        return this;
    }

    public BookingRequestBuilder withContainerSize(long containerSize) {
        this.containerSize = containerSize;
        return this;
    }

    public BookingRequestBuilder withContainerType(ContainerType containerType) {
        this.containerType = containerType;
        return this;
    }

    public BookingRequestBuilder withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public BookingRequestBuilder withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public BookingRequestBuilder withQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public BookingRequest create() {
        return new BookingRequest(bookingReference, containerSize, containerType, origin, destination, quantity);
    }
}