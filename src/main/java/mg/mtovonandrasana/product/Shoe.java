package mg.mtovonandrasana.product;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Shoe extends Product {

    private Integer height;

    public Shoe(String name, String description, int price, Integer height) {
        super(name, description, price);
        this.height = height;
    }
}
