package DojoAirlines.services.Impl;

import DojoAirlines.domain.Staff;
import DojoAirlines.repositories.StaffRepository;
import DojoAirlines.repositories.Impl.StaffRepositoryImpl;
import DojoAirlines.services.StaffService;

public class StaffServiceImpl implements StaffService{

    private static StaffServiceImpl service = null;

    StaffRepository repository = StaffRepositoryImpl.getInstance();

    public static StaffServiceImpl getInstance(){
        if(service == null)
            service = new StaffServiceImpl();
        return service;
    }

    public Staff create(Staff staff) {
        return repository.create(staff);
    }

    public Staff read(String id) {
        return repository.read(id);
    }

    public Staff update(Staff staff) {
        return repository.update(staff);
    }

    public void delete(String id) {
        repository.delete(id);

    }
}
