package DojoAirlines.services.Impl;

import DojoAirlines.domain.TravelClass;
import DojoAirlines.repositories.Impl.TravelClassRepositoryImpl;
import DojoAirlines.repositories.TravelClassRepository;
import DojoAirlines.services.TravelClassService;

public class TravelClassServiceImpl implements TravelClassService{

    private static TravelClassServiceImpl service = null;

    TravelClassRepository repository = TravelClassRepositoryImpl.getInstance();

    public static TravelClassServiceImpl getInstance(){
        if(service == null)
            service = new TravelClassServiceImpl();
        return service;
    }

    public TravelClass create(TravelClass travelClass) {
        return repository.create(travelClass);
    }

    public TravelClass read(String id) {
        return repository.read(id);
    }

    public TravelClass update(TravelClass travelClass) {
        return repository.update(travelClass);
    }

    public void delete(String id) {
        repository.delete(id);

    }
}
