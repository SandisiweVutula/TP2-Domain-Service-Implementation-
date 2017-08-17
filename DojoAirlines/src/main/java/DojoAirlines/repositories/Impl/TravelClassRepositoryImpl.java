package DojoAirlines.repositories.Impl;

import DojoAirlines.domain.TravelClass;
import DojoAirlines.repositories.TravelClassRepository;

import java.util.HashMap;
import java.util.Map;

public class TravelClassRepositoryImpl  implements TravelClassRepository {

    private static TravelClassRepositoryImpl respository = null;

    private Map<String,TravelClass> TravelClassTable;

    private TravelClassRepositoryImpl() {
        TravelClassTable = new HashMap<String, TravelClass>();
    }

    public static TravelClassRepositoryImpl getInstance(){
        if(respository==null)
            respository = new TravelClassRepositoryImpl();
        return respository;
    }

    public TravelClass create(TravelClass travelClass) {
        TravelClassTable.put(travelClass.getId(),travelClass);
        TravelClass savedTravelClass = TravelClassTable.get(travelClass.getId());
        return savedTravelClass;
    }

    public TravelClass read(String id) {
        TravelClass travelClass = TravelClassTable.get(id);
        return travelClass;
    }

    public TravelClass update(TravelClass travelClass) {
        TravelClassTable.put(travelClass.getId(),travelClass);
        TravelClass savedTravelClass = TravelClassTable.get(travelClass.getId());
        return savedTravelClass;
    }

    public void delete(String id) {
        TravelClassTable.remove(id);

    }
}
