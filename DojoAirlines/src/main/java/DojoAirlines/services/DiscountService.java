package DojoAirlines.services;

import DojoAirlines.domain.Discount;

public interface DiscountService {

    Discount create(Discount discount);
    Discount read(String id);
    Discount update(Discount discount);
    void delete (String id);
}
