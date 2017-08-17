package DojoAirlines.domain;

import java.io.Serializable;

public class Passenger implements Serializable {

    private String id;
    private Integer PassengerNumber;
    private String name;
    private String surname;
    private String adddress;
    private Integer cellNumber;
    private String emailAddress;


    private Passenger() {
    }

    private Passenger(Passenger.Builder passenger) {
        this.id = passenger.id;
        this.PassengerNumber = passenger.PassengerNumber;
        this.name = passenger.name;
        this.surname = passenger.surname;
        this.adddress = passenger.address;
        this.cellNumber = passenger.cellNumber;
        this.emailAddress = passenger.emailAddress;
    }

    public String getId() {
        return id;
    }
    public int getPassengerNumber() {
        return PassengerNumber;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getAdddress() {
        return adddress;
    }
    public int getCellNumber() {
        return cellNumber;
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    public static class Builder {

        private String id;
        private Integer PassengerNumber;
        private String name;
        private String surname;
        private String address;
        private Integer cellNumber;
        private String emailAddress;

        public Passenger.Builder clonePassenger(Passenger passenger) {
            this.id = passenger.id;
            this.PassengerNumber = passenger.PassengerNumber;
            this.name = passenger.name;
            this.surname = passenger.surname;
            this.address = passenger.adddress;
            this.cellNumber = passenger.cellNumber;
            this.emailAddress = passenger.emailAddress;
            return this;
        }

        public Passenger build() {
            return new Passenger(this);
        }

        public Builder pNumber(Integer passengerNumber){
            this.PassengerNumber = passengerNumber;
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

        public Builder homeAddress(String value){
            this.address = value;
            return this;
        }

        public Builder cell(int value){
            this.cellNumber = value;
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
        if (!(object instanceof Passenger)) {
            return false;
        }
        Passenger other = (Passenger) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
}
