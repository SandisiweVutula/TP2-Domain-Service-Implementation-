package DojoAirlines.repositories.Impl;

import DojoAirlines.domain.Flight;

import DojoAirlines.repositories.FlightRepository;

import java.util.HashMap;
import java.util.Map;

public class FlightRepositoryImpl implements FlightRepository {

    private static FlightRepositoryImpl respository = null;

    private Map<String,Flight> FlightTable;

    private FlightRepositoryImpl() {
        FlightTable = new HashMap<String, Flight>();
    }

    public static FlightRepositoryImpl getInstance(){
        if(respository==null)
            respository = new FlightRepositoryImpl();
        return respository;
    }

    public Flight create(Flight flight) {
        FlightTable.put(flight.getId(),flight);
        Flight savedFlight = FlightTable.get(flight.getId());
        return savedFlight;
    }

    public Flight read(String id) {
        Flight flight = FlightTable.get(id);
        return flight;
    }

    public Flight update(Flight flight) {
        FlightTable.put(flight.getId(),flight);
        Flight savedFlight = FlightTable.get(flight.getId());
        return savedFlight;
    }

    public void delete(String id) {
        FlightTable.remove(id);

    }
}
