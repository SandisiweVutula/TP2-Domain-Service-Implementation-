package DojoAirlines.services.Impl;
import  DojoAirlines.repositories.BookingRepository;
import DojoAirlines.repositories.Impl.BookingRepositoryImpl;

import DojoAirlines.domain.Booking;
import DojoAirlines.services.BookingService;

public class BookingServiceImpl implements BookingService {

    private static BookingServiceImpl service = null;

    BookingRepository repository = BookingRepositoryImpl.getInstance();

    public static BookingServiceImpl getInstance(){
        if(service == null)
            service = new BookingServiceImpl();
        return service;
    }

    public Booking create(Booking booking) {
        return repository.create(booking);
    }

    public Booking read(String id) {
        return repository.read(id);
    }

    public Booking update(Booking booking) {
        return repository.update(booking);
    }

    public void delete(String id) {
        repository.delete(id);

    }
}
