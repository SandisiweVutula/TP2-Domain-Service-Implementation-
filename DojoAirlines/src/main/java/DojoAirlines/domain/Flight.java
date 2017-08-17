package DojoAirlines.domain;
import java.io.Serializable;
import java.util.Date;

public class Flight implements Serializable {

    private String id;
    private Integer flightNumber;
    private Date departureDate;
    private String departTime;
    private String departAirport;
    private String arrivalAirport;
    private String arrivalTime;
    private Integer flightDuration;
    private String flightStatus;


    private Flight() {
    }

    private Flight(Builder flight) {
        this.id = flight.id;
        this.flightNumber = flight.flightNumber;
        this.departureDate = flight.departureDate;
        this.departTime = flight.departTime;
        this.departAirport = flight.departAirport;
        this.arrivalAirport = flight.arrivalAirport;
        this.arrivalTime = flight.arrivalTime;
        this.flightDuration = flight.flightDuration;
        this.flightStatus = flight.flightStatus;
    }

    public String getId() {
        return id;
    }
    public int getFlightNumber() {
        return flightNumber;
    }
    public Date getDepartureDate() {
        return departureDate;
    }
    public String getDepartTime() {
        return departTime;
    }
    public String getDepartAirport() {
        return departAirport;
    }
    public String getArrivalAirport() {
        return arrivalAirport;
    }
    public String getArrivalTime() {
        return arrivalTime;
    }
    public int getFlightDuration() {
        return flightDuration;
    }
    public String getFlightStatus() {
        return flightStatus;
    }

    public static class Builder {

        private String id;
        private int flightNumber;
        private Date departureDate;
        private String departTime;
        private String departAirport;
        private String arrivalAirport;
        private String arrivalTime;
        private int flightDuration;
        private String flightStatus;

        public Builder cloneFlight(Flight flight) {
            this.id = flight.id;
            this.flightNumber = flight.flightNumber;
            this.departureDate = flight.departureDate;
            this.departTime = flight.departTime;
            this.departAirport = flight.departAirport;
            this.arrivalAirport = flight.arrivalAirport;
            this.arrivalTime = flight.arrivalTime;
            this.flightDuration = flight.flightDuration;
            this.flightStatus = flight.flightStatus;
            return this;
        }

        public Flight build() {
            return new Flight(this);
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
        if (!(object instanceof Flight)) {
            return false;
        }
        Flight other = (Flight) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
}
