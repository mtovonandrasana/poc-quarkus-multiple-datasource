package mg.mtovonandrasana;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import mg.mtovonandrasana.store.CreateStore;
import mg.mtovonandrasana.store.Store;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
class StoreCreationTest {

    @Inject
    CreateStore createStore;

    @Test
    void shouldCreateStore() {

        Store aNewstore = new Store();
        aNewstore.name = "Nothing";
        aNewstore.address = "No where";
        aNewstore.contact = "donotsend@mail.com";
        Store createdStore = createStore.create(aNewstore);
        assertNotNull(createdStore);
        assertNotNull(createdStore.id);

    }
}
