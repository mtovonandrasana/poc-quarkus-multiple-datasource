package mg.mtovonandrasana.product;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Clothe extends Product {

    private Integer height;
    private Integer width;

    public Clothe(String name, String description, int price) {
        super(name, description, price);
    }
}
