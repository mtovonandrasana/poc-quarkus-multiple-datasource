package mg.mtovonandrasana;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import mg.mtovonandrasana.product.Clothe;
import mg.mtovonandrasana.product.Product;
import mg.mtovonandrasana.product.Shoe;
import mg.mtovonandrasana.product.UpdateProduct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

@QuarkusTest
class ProductCreationTest {

    final String ERROR_SHOE_CLASS_IS_NOT_ENTITY = "Class 'class mg.mtovonandrasana.product.Shoe' is not an entity class";

    @Inject
    UpdateProduct updateProduct;

    @Test
    void shouldSaveClothe() {
        var product = new Clothe("Clothe", "This is a clothe", 13);
        var savedProduct = updateProduct.save(product);

        Assertions.assertInstanceOf(Clothe.class, product);
        Assertions.assertEquals(product.getName(), savedProduct.getName());
        Assertions.assertNotNull(savedProduct.getId());
    }

    @Test
    void shouldSaveProduct() {
        var product = new Product("Product", "This is a Product", 13);
        var savedProduct = updateProduct.save(product);

        Assertions.assertInstanceOf(Product.class, product);
        Assertions.assertEquals(product.getName(), savedProduct.getName());
        Assertions.assertNotNull(savedProduct.getId());
    }

    /**
     * It failed because {@link Shoe} entity does not have a Panache Repository, or extend
     * {@link io.quarkus.hibernate.orm.panache.PanacheEntity} or {@link io.quarkus.hibernate.orm.panache.PanacheEntityBase}.
     * That causes Hibernate panache unable to find related Persistence-unit for Shoe Entity, so it use the default.
     */
    @Test
    void failedToSaveShoe() {
        var shoe = new Shoe("Puma", "This is a shoe", 19, 42);
        Executable savedProductConsumer = () -> updateProduct.save(shoe);
        Assertions.assertThrows(IllegalArgumentException.class,  savedProductConsumer, ERROR_SHOE_CLASS_IS_NOT_ENTITY);
    }

}
