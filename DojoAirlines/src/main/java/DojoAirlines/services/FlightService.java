package DojoAirlines.services;

import DojoAirlines.domain.Flight;

public interface FlightService {

    Flight create(Flight flight);
    Flight read(String id);
    Flight update(Flight flight);
    void delete (String id);
}
