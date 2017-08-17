package DojoAirlines.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class TravelClass implements Serializable {

    private String id;
    private Integer travelClassNumber;
    private String className;
    private Integer seatsAvailable;
    private Integer seatsBooked;
    private BigDecimal seatPrice;



    private TravelClass() {
    }

    private TravelClass(TravelClass.Builder travelClass) {
        this.id = travelClass.id;
        this.travelClassNumber = travelClass.travelClassNumber;
        this.className = travelClass.className;
        this.seatsAvailable = travelClass.seatsAvailable;
        this.seatsBooked = travelClass.seatsBooked;
        this.seatPrice = travelClass.seatPrice;
    }

    public String getId() {
        return id;
    }
    public int getTravelClassNumber() {
        return travelClassNumber;
    }
    public String getClassName() {
        return className;
    }
    public Integer getSeatsAvailable() {
        return seatsAvailable;
    }
    public int getSeatsBooked() {
        return seatsBooked;
    }
    public BigDecimal getSeatPrice() {
        return seatPrice;
    }
    public static class Builder {

        private String id;
        private int travelClassNumber;
        private String className;
        private int seatsAvailable;
        private int seatsBooked;
        private BigDecimal seatPrice;

        public TravelClass.Builder cloneTravelClass(TravelClass travelClass) {
            this.id = travelClass.id;
            this.travelClassNumber = travelClass.travelClassNumber;
            this.className = travelClass.className;
            this.seatsAvailable = travelClass.seatsAvailable;
            this.seatsBooked = travelClass.seatsBooked;
            this.seatPrice = travelClass.seatPrice;
            return this;
        }

        public TravelClass build() {
            return new TravelClass(this);
        }

        public Builder classnumber(Integer passengerNumber){
            this.travelClassNumber = passengerNumber;
            return this;
        }

        public Builder id(String value){
            this.id = value;
            return this;
        }

        public Builder classN(String value){
            this.className = value;
            return this;
        }

        public Builder seatsAvailable(int value){
            this.seatsAvailable = value;
            return this;
        }

        public Builder seatsBooked(Integer value){
            this.seatsBooked = value;
            return this;
        }

        public Builder price(BigDecimal value){
            this.seatPrice = value;
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
        if (!(object instanceof TravelClass)) {
            return false;
        }
        TravelClass other = (TravelClass) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
}
