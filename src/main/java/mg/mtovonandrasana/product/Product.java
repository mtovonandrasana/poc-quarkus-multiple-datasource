package mg.mtovonandrasana.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private int price;

    public Product(String name, String description, int price) {
        super();
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
