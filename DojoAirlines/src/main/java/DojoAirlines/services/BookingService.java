package DojoAirlines.services;

import DojoAirlines.domain.Booking;

public interface BookingService {

    Booking create(Booking booking);
    Booking read(String id);
    Booking update(Booking booking);
    void delete (String id);

}
