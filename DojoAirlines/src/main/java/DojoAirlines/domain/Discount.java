package DojoAirlines.domain;

import java.io.Serializable;

public class Discount  implements Serializable {

    private String id;
    private Integer discountPercentage;


    private Discount() {
    }

    private Discount(Builder discount) {
        this.id = discount.id;
        this.discountPercentage = discount.discountPercentage;
    }

    public String getId() {
        return id;
    }
    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public static class Builder {

        private String id;
        private int discountPercentage;

        public Builder discount(int discountPercentage) {
            this.discountPercentage = discountPercentage;
            return this;
        }

        public Builder cloneDiscount(Discount discount) {
            this.id = discount.id;
            this.discountPercentage = discount.discountPercentage;

            return this;
        }

        public Discount build() {
            return new Discount(this);
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
        if (!(object instanceof Discount)) {
            return false;
        }
        Discount other = (Discount) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
}
