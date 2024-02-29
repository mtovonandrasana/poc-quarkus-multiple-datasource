package mg.mtovonandrasana.store;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class CreateStore {

    @Transactional
    public Store create(Store store) {
        store.persist();
        return store;
    }
}
