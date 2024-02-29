package mg.mtovonandrasana.client;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "specific_client")
public class SpecificClient extends Client {

    private boolean special = true;

    public SpecificClient(String name) {
        super(name);
    }
}
