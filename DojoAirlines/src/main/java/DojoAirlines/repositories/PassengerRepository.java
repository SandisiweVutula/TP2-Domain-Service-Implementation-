package DojoAirlines.repositories;

import DojoAirlines.domain.Passenger;

public interface PassengerRepository {
    Passenger create(Passenger passenger);

    Passenger read(String id);

    Passenger update(Passenger passenger);

    void delete(String id);
}
