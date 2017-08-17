package DojoAirlines.repositories.Impl;

import  DojoAirlines.domain.Booking;
import DojoAirlines.repositories.BookingRepository;

import java.util.HashMap;
import java.util.Map;

public class BookingRepositoryImpl implements BookingRepository {

    private static BookingRepositoryImpl respository = null;

    private Map<String,Booking> BookingTable;

    private BookingRepositoryImpl() {
        BookingTable = new HashMap<String, Booking>();
    }

    public static BookingRepositoryImpl getInstance(){
        if(respository==null)
            respository = new BookingRepositoryImpl();
        return respository;
    }

    public Booking create(Booking booking) {
        BookingTable.put(booking.getBookingId(),booking);
        Booking savedBooking = BookingTable.get(booking.getBookingId());
        return savedBooking;
    }

    public Booking read(String id) {
        Booking Booking = BookingTable.get(id);
        return Booking;
    }

    public Booking update(Booking booking) {
        BookingTable.put(booking.getBookingId(),booking);
        Booking savedBooking = BookingTable.get(booking.getBookingId());
        return savedBooking;
    }

    public void delete(String id) {
        BookingTable.remove(id);

    }
    
}
