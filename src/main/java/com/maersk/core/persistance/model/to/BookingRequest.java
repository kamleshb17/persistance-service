package com.maersk.core.persistance.model.to;


import com.maersk.core.persistance.model.ContainerType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.Objects;

@Table(value = "booking")
public class BookingRequest implements Serializable {
    @PrimaryKey
    private String bookingReference;
    private long containerSize;
    private ContainerType containerType;
    private String origin;
    private String destination;
    private int quantity;

    protected BookingRequest() {
    }

    public BookingRequest(String bookingReference, long containerSize, ContainerType containerType, String origin, String destination, int quantity) {
        this.bookingReference = bookingReference;
        this.containerSize = containerSize;
        this.containerType = containerType;
        this.origin = origin;
        this.destination = destination;
        this.quantity = quantity;
    }

    public String getBookingReference() {
        return bookingReference;
    }

    public long getContainerSize() {
        return containerSize;
    }

    public ContainerType getContainerType() {
        return containerType;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingRequest bookingRequest = (BookingRequest) o;
        return getContainerSize() == bookingRequest.getContainerSize() &&
                getQuantity() == bookingRequest.getQuantity() &&
                Objects.equals(getBookingReference(), bookingRequest.getBookingReference()) &&
                getContainerType() == bookingRequest.getContainerType() &&
                Objects.equals(getOrigin(), bookingRequest.getOrigin()) &&
                Objects.equals(getDestination(), bookingRequest.getDestination());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookingReference(), getContainerSize(), getContainerType(), getOrigin(), getDestination(), getQuantity());
    }
}
