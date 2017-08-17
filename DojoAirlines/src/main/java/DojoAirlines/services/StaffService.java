package DojoAirlines.services;

import DojoAirlines.domain.Staff;

public interface StaffService {
    Staff create(Staff staff);
    Staff read(String id);
    Staff update(Staff staff);
    void delete (String id);
}
