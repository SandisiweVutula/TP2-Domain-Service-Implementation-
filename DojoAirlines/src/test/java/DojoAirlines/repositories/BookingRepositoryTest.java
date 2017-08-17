package DojoAirlines.repositories;
import DojoAirlines.domain.Booking;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import  DojoAirlines.factories.BookingFactory;
import java.util.HashMap;
import java.util.Map;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class BookingRepositoryTest {

    Map<String,String> values;
    BookingRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id", "1");
        values.put("seats", "10");
        values.put("number", "100");
        values.put("amount", "50");
        values.put("flightPrice", "10");
        values.put("dateToReturn", "12-08-2017");
    }

    @Test
    public void create() throws Exception {
        Booking booking = BookingFactory.getBooking(values,25, 20);
        repository.create(booking);
        assertEquals(25,booking.getBookingNumber());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Booking readBooking = repository.read("1");
        assertEquals(25,readBooking.getBookingNumber());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Booking booking = repository.read("1");
        Booking newBooking = new Booking.Builder()
                .number(22)
                .amount(values.get("20"))
                .flightPrice(values.get("30"))
                .build();
        repository.update(newBooking);
        Booking UpdateBooking = repository.read("1");
        assertEquals(22,UpdateBooking.getBookingNumber());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("1");
        Booking Booking = repository.read("1");
        assertNull(Booking);
    }

}
