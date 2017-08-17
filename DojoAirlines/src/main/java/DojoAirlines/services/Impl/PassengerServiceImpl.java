package DojoAirlines.services.Impl;

import DojoAirlines.domain.Passenger;
import DojoAirlines.repositories.PassengerRepository;
import DojoAirlines.repositories.Impl.PassengerRepositoryImpl;
import DojoAirlines.services.PassengerService;

public class PassengerServiceImpl implements PassengerService{
    private static PassengerServiceImpl service = null;

    PassengerRepository repository = PassengerRepositoryImpl.getInstance();

    public static PassengerServiceImpl getInstance(){
        if(service == null)
            service = new PassengerServiceImpl();
        return service;
    }

    public Passenger create(Passenger passenger) {
        return repository.create(passenger);
    }

    public Passenger read(String id) {
        return repository.read(id);
    }

    public Passenger update(Passenger passenger) {
        return repository.update(passenger);
    }

    public void delete(String id) {
        repository.delete(id);

    }
}
