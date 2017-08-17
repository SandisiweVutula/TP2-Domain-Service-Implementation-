package DojoAirlines.services.Impl;

import DojoAirlines.domain.Discount;
import DojoAirlines.repositories.DiscountRepository;
import DojoAirlines.repositories.Impl.DiscountRepositoryImpl;
import DojoAirlines.services.DiscountService;

public class DiscountServiceImpl implements DiscountService{

    private static DiscountServiceImpl service = null;

    DiscountRepository repository = DiscountRepositoryImpl.getInstance();

    public static DiscountServiceImpl getInstance(){
        if(service == null)
            service = new DiscountServiceImpl();
        return service;
    }

    public Discount create(Discount discount) {
        return repository.create(discount);
    }

    public Discount read(String id) {
        return repository.read(id);
    }

    public Discount update(Discount discount) {
        return repository.update(discount);
    }

    public void delete(String id) {
        repository.delete(id);

    }
}
