package DojoAirlines.factories;

import DojoAirlines.domain.Staff;

import java.util.Map;

public class StaffFactory {

    public static Staff getStaff(Map<String, String> values, int staffNumber, int cell) {
        Staff staff = new Staff.Builder()
                .stufNumber(staffNumber)
                .firstname(values.get("firstname"))
                .lastname(values.get("lastname"))
                .stuffPassword(values.get("homeAddress"))
                .cell(cell)
                .emailAddress(values.get("emailAddress"))
                .build();
        return staff;

    }
}
