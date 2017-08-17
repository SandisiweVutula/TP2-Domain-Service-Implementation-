package DojoAirlines.factories;

import DojoAirlines.domain.TravelClass;
import com.sun.xml.internal.ws.commons.xmlutil.Converter;

import java.util.Map;

public class TravelClassFactory {

    public static TravelClass getTravelClass(Map<String, String> values, int travelClassNumber) {
        TravelClass travelClass = new TravelClass.Builder()
                .classnumber(travelClassNumber)
                .classN(values.get("Business Class"))
                .seatsAvailable(5)
                .seatsBooked(40)
                .build();
        return travelClass;

    }
}
