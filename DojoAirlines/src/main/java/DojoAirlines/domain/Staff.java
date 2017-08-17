package DojoAirlines.domain;

import java.io.Serializable;

public class Staff implements Serializable {

    private String id;
    private Integer staffNumber;
    private String name;
    private String surname;
    private Integer cellNumber;
    private String emailAddress;
    private String password;


    private Staff() {
    }

    private Staff(Staff.Builder staff) {
        this.id = staff.id;
        this.staffNumber = staff.StaffNumber;
        this.name = staff.name;
        this.surname = staff.surname;
        this.cellNumber = staff.cellNumber;
        this.emailAddress = staff.emailAddress;
        this.password = staff.password;
    }

    public String getId() {
        return id;
    }
    public int getStaffNumber() {
        return staffNumber;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getCellNumber() {
        return cellNumber;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public String getPassword() {
        return password;
    }

    public static class Builder {

        private String id;
        private Integer StaffNumber;
        private String name;
        private String surname;
        private Integer cellNumber;
        private String emailAddress;
        private String password;

        public Staff.Builder cloneStaff(Staff staff) {
            this.id = staff.id;
            this.StaffNumber = staff.staffNumber;
            this.name = staff.name;
            this.surname = staff.surname;
            this.cellNumber = staff.cellNumber;
            this.emailAddress = staff.emailAddress;
            this.password = staff.password;
            return this;
        }

        public Staff build() {
            return new Staff(this);
        }

        public Builder stufNumber(Integer passengerNumber){
            this.StaffNumber = passengerNumber;
            return this;
        }

        public Builder id(String value){
            this.id = value;
            return this;
        }

        public Builder firstname(String value){
            this.name = value;
            return this;
        }

        public Builder lastname(String value){
            this.surname = value;
            return this;
        }

        public Builder cell(Integer value){
            this.cellNumber = value;
            return this;
        }

        public Builder stuffPassword(String value){
            this.password = value;
            return this;
        }

        public Builder emailAddress(String value){
            this.emailAddress = value;
            return this;
        }
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Staff)) {
            return false;
        }
        Staff other = (Staff) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
}
