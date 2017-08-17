package DojoAirlines.services;

import DojoAirlines.domain.Booking;
import DojoAirlines.factories.BookingFactory;
import DojoAirlines.services.Impl.BookingServiceImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertNull;


public class BookingServiceTest {

    BookingService service;
    Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new BookingServiceImpl();
        values = new HashMap<String, String>();
        values.put("id", "1");
        values.put("seats", "25");
        values.put("number", "100");
        values.put("amount", "50");
        values.put("flightPrice", "10");
        values.put("dateToReturn", "12-08-2017");
    }

    @Test
    public void testCreate() throws Exception {
        Booking Booking = BookingFactory.getBooking(values,25, 100);
        service.create(Booking);
        assertEquals(25,Booking.getSeatsBooked());
    }

    @Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception {
        Booking readBooking = service.read("1");
        assertEquals(25,readBooking.getSeatsBooked());
    }

    @Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {

        Booking newBooking = new Booking.Builder()
                .number(22)
                .amount(values.get("amount"))
                .flightPrice(values.get("flightPrice"))
                .build();
        service.update(newBooking);
        Booking UpdateBooking = service.read("1");
        assertEquals(22,UpdateBooking.getSeatsBooked());
    }

    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        service.delete("1");
        Booking Booking = service.read("1");
        assertNull(Booking);
    }
}
