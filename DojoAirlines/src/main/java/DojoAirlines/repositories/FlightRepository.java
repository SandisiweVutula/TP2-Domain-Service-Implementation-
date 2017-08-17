package DojoAirlines.repositories;

import DojoAirlines.domain.Flight;

public interface FlightRepository {

    Flight create(Flight flight);

    Flight read(String id);

    Flight update(Flight flight);

    void delete(String id);
}


