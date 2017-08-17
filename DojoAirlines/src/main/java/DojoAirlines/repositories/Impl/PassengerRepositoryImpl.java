package DojoAirlines.repositories.Impl;

import DojoAirlines.domain.Passenger;
import DojoAirlines.repositories.PassengerRepository;

import java.util.HashMap;
import java.util.Map;

public class PassengerRepositoryImpl implements PassengerRepository {

    private static PassengerRepositoryImpl respository = null;

    private Map<String,Passenger> PassengerTable;

    private PassengerRepositoryImpl() {
        PassengerTable = new HashMap<String, Passenger>();
    }

    public static PassengerRepositoryImpl getInstance(){
        if(respository==null)
            respository = new PassengerRepositoryImpl();
        return respository;
    }

    public Passenger create(Passenger passenger) {
        PassengerTable.put(passenger.getId(),passenger);
        Passenger savedPassenger = PassengerTable.get(passenger.getId());
        return savedPassenger;
    }

    public Passenger read(String id) {
        Passenger passenger = PassengerTable.get(id);
        return passenger;
    }

    public Passenger update(Passenger passenger) {
        PassengerTable.put(passenger.getId(),passenger);
        Passenger savedPassenger = PassengerTable.get(passenger.getId());
        return savedPassenger;
    }

    public void delete(String id) {
        PassengerTable.remove(id);

    }
}
