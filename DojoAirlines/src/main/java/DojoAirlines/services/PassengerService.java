package DojoAirlines.services;

import DojoAirlines.domain.Passenger;

public interface PassengerService {
    Passenger create(Passenger passenger);
    Passenger read(String id);
    Passenger update(Passenger passenger);
    void delete (String id);
}
