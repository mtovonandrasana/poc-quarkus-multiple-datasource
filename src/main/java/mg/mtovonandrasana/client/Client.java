package mg.mtovonandrasana.client;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Client {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Client(String name) {
        this.name = name;
    }
}
