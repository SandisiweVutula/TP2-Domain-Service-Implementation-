package DojoAirlines.factories;

import DojoAirlines.domain.Discount;

import java.util.Map;

public class DiscountFactory {
    public static Discount getDiscount(Map<String, String> values, int discount) {
        Discount discounts = new Discount.Builder()
                .discount(discount)
                .build();
        return discounts;
    }
}
