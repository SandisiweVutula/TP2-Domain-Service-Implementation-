package DojoAirlines.repositories.Impl;

import DojoAirlines.domain.Staff;
import DojoAirlines.repositories.StaffRepository;

import java.util.HashMap;
import java.util.Map;

public class StaffRepositoryImpl implements StaffRepository {

    private static StaffRepositoryImpl respository = null;

    private Map<String,Staff> StaffTable;

    private StaffRepositoryImpl() {
        StaffTable = new HashMap<String, Staff>();
    }

    public static StaffRepositoryImpl getInstance(){
        if(respository==null)
            respository = new StaffRepositoryImpl();
        return respository;
    }

    public Staff create(Staff staff) {
        StaffTable.put(staff.getId(),staff);
        Staff savedStaff = StaffTable.get(staff.getId());
        return savedStaff;
    }

    public Staff read(String id) {
        Staff staff = StaffTable.get(id);
        return staff;
    }

    public Staff update(Staff staff) {
        StaffTable.put(staff.getId(),staff);
        Staff savedStaff = StaffTable.get(staff.getId());
        return savedStaff;
    }

    public void delete(String id) {
        StaffTable.remove(id);

    }
}
