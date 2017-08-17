package DojoAirlines.repositories.Impl;

import DojoAirlines.domain.Discount;
import DojoAirlines.repositories.DiscountRepository;

import java.util.HashMap;
import java.util.Map;

public class DiscountRepositoryImpl implements DiscountRepository {

    private static DiscountRepositoryImpl respository = null;

    private Map<String,Discount> DiscountTable;

    private DiscountRepositoryImpl() {
        DiscountTable = new HashMap<String, Discount>();
    }

    public static DiscountRepositoryImpl getInstance(){
        if(respository==null)
            respository = new DiscountRepositoryImpl();
        return respository;
    }

    public Discount create(Discount discount) {
        DiscountTable.put(discount.getId(),discount);
        Discount savedDiscount = DiscountTable.get(discount.getId());
        return savedDiscount;
    }

    public Discount read(String id) {
        Discount Discount = DiscountTable.get(id);
        return Discount;
    }

    public Discount update(Discount discount) {
        DiscountTable.put(discount.getId(),discount);
        Discount savedDiscount = DiscountTable.get(discount.getId());
        return savedDiscount;
    }

    public void delete(String id) {
        DiscountTable.remove(id);

    }
}
