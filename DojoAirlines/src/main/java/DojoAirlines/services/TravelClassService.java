package DojoAirlines.services;

import DojoAirlines.domain.TravelClass;

public interface TravelClassService {
    TravelClass create(TravelClass travelClass);
    TravelClass read(String id);
    TravelClass update(TravelClass travelClass);
    void delete (String id);
}
