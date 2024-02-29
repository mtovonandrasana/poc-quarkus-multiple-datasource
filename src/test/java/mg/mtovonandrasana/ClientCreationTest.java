package mg.mtovonandrasana;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import mg.mtovonandrasana.client.Client;
import mg.mtovonandrasana.client.SaveClient;
import mg.mtovonandrasana.client.SpecificClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
class ClientCreationTest {

    @Inject
    SaveClient saveClient;

    @Test
    void shouldSaveClient() {
        Client client = new SpecificClient("Rakoto");
        Client savedClient = saveClient.save(client);

        Assertions.assertInstanceOf(SpecificClient.class, client);
        Assertions.assertEquals(client.getName(), savedClient.getName());
        Assertions.assertNotNull(savedClient.getId());
    }
}
