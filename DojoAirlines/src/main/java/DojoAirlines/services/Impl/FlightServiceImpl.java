package DojoAirlines.services.Impl;

import DojoAirlines.domain.Flight;
import DojoAirlines.repositories.FlightRepository;
import DojoAirlines.repositories.Impl.FlightRepositoryImpl;
import DojoAirlines.services.FlightService;

public class FlightServiceImpl implements FlightService{

    private static FlightServiceImpl service = null;

    FlightRepository repository = FlightRepositoryImpl.getInstance();

    public static FlightServiceImpl getInstance(){
        if(service == null)
            service = new FlightServiceImpl();
        return service;
    }

    public Flight create(Flight flight) {
        return repository.create(flight);
    }

    public Flight read(String id) {
        return repository.read(id);
    }

    public Flight update(Flight flight) {
        return repository.update(flight);
    }

    public void delete(String id) {
        repository.delete(id);

    }
}
