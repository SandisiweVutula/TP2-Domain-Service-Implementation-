package DojoAirlines.factories;

import DojoAirlines.domain.Passenger;

import java.util.Map;

public class PassengerFactory {

    public static Passenger getPassenger(Map<String, String> values, int passengerNumber, int cell) {
        Passenger passenger = new Passenger.Builder()
                .pNumber(passengerNumber)
                .firstname(values.get("firstname"))
                .lastname(values.get("lastname"))
                .homeAddress(values.get("homeAddress"))
                .cell(cell)
                .emailAddress(values.get("emailAddress"))
                .build();
        return passenger;

    }


}
