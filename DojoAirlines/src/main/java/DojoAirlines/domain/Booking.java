package DojoAirlines.domain;

import java.io.Serializable;


public class Booking implements Serializable{

    private String id;
    private Integer bookingNumber;
    private Integer  seatsBooked;
    private String amountPaid;
    private String price;
    private  String returnDate;

    private Flight flight;

    private Staff staff;

    private Passenger passenger;


    private Booking() {

    }

    private Booking(Builder booking) {
        this.id = booking.id;
        this.bookingNumber = booking.bookingNumber;
        this.seatsBooked = booking.seatsBooked;
        this.amountPaid = booking.amountPaid;
        this.price = booking.price;
        this.returnDate = booking.returnDate;
        this.flight = booking.flight;
        this.staff = booking.staff;
        this.passenger = booking.passenger;
    }

    public String getBookingId() {
        return id;
    }

    public int getBookingNumber() {
        return bookingNumber;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    public String getAmountPaid() {
        return amountPaid;
    }

    public String getPrice() {
        return price;
    }

    public String getReturnDate() {
        return returnDate;
    }


    public Flight getFlight() {
        return flight;
    }
    public Staff getStaff() {
        return staff;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public static class Builder {
        private String id;
        private int bookingNumber;
        private Integer  seatsBooked;
        private String amountPaid;
        private String price;
        private String returnDate;
        private Flight flight;
        private Staff staff;
        private Passenger passenger;

        public Builder cloneBooking(Booking booking) {
            this.id = booking.id;
            this.bookingNumber = booking.bookingNumber;
            this.seatsBooked = booking.seatsBooked;
            this.amountPaid = booking.amountPaid;
            this.price = booking.price;
            this.returnDate = booking.returnDate;
            this.flight = booking.flight;
            this.staff = booking.staff;
            this.passenger = booking.passenger;
            return this;
        }

        public Booking build(){
            return new Booking(this);
        }

        public Builder number(Integer bookingNumber){
            this.bookingNumber = bookingNumber;
            return this;
        }

        public Builder seats(Integer seatsBooked){
            this.seatsBooked = seatsBooked;
            return this;
        }

        public Builder amount(String amountPaid){
            this.amountPaid = amountPaid;
            return this;
        }

        public Builder flightPrice(String price){
            this.price = price;
            return this;
        }

        public Builder dateToDeturn(String returnDate){
            this.returnDate = returnDate;
            return this;
        }

        public Builder flight(Flight add){
            this.flight = add;
            return this;
        }

        public Builder staff(Staff staff){
            this.staff = staff;
            return this;
        }

        public Builder passenger(Passenger passenger){
            this.passenger = passenger;
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
        if (!(object instanceof Booking)) {
            return false;
        }
        Booking other = (Booking) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
