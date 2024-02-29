package mg.mtovonandrasana.client;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class SaveClient {

    @Inject ClientRepository clientRepository;

    @Transactional
    public Client save(Client client) {
        clientRepository.persist(client);
        return client;
    }

    public Client get(Long clientId) {
        return clientRepository.findById(clientId);
    }
}
