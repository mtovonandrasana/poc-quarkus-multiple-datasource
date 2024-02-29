package mg.mtovonandrasana.product;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class UpdateProduct {
    @Inject
    ProductRepository productRepository;

    @Transactional
    public Product save(Product product) {
        productRepository.persist(product);
        return product;
    }
}
