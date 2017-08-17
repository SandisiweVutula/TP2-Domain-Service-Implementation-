package DojoAirlines.repositories;

import DojoAirlines.domain.Staff;

public interface StaffRepository {

    Staff create(Staff staff);

    Staff read(String id);

    Staff update(Staff staff);

    void delete(String id);
}
