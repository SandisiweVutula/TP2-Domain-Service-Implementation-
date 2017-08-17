package DojoAirlines.factories;

import DojoAirlines.domain.Booking;
import java.math.BigDecimal;

import java.util.Map;

public class BookingFactory {

    public static Booking getBooking(Map<String, String> values, int seats, int flightNumber) {
        Booking booking = new Booking.Builder()
                .seats(seats)
                .number(flightNumber)
                .amount(values.get(new BigDecimal(100)))
                .flightPrice(values.get(new BigDecimal(100)))
                .dateToDeturn(values.get("12-08-2017"))
                .build();
        return booking;

    }
}
