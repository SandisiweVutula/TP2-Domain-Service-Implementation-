package DojoAirlines.factories;
import DojoAirlines.domain.Booking;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;
import static org.testng.Assert.assertEquals;


public class BookingFactoryTest {

    Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("seats","10");
        values.put("number","100");
        values.put("amount","50");
        values.put("flightPrice","10");
        values.put("dateToReturn","12-08-2017");
    }

    @Test
    public void getBooking() throws Exception {
        Booking booking = BookingFactory.getBooking(values,25, 100);
        assertEquals(null,booking.getAmountPaid());
    }
}
