package DojoAirlines.repositories;

import DojoAirlines.domain.Discount;

public interface DiscountRepository {

    Discount create(Discount discount);

    Discount read(String id);

    Discount update(Discount discount);

    void delete(String id);
}
