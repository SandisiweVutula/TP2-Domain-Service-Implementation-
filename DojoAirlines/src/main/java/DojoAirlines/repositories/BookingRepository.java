package DojoAirlines.repositories;
import  DojoAirlines.domain.Booking;

public interface BookingRepository {

    Booking create(Booking booking);

    Booking read(String id);

    Booking update(Booking booking);

    void delete(String id);
}
