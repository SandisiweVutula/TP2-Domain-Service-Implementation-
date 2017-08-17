package DojoAirlines.repositories;

import DojoAirlines.domain.TravelClass;

public interface TravelClassRepository {
    
    TravelClass create(TravelClass TravelClass);

    TravelClass read(String id);

    TravelClass update(TravelClass TravelClass);

    void delete(String id);
}
