package mg.mtovonandrasana.invoice;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Invoice extends PanacheEntity {

    public Long amount;
    public boolean payed = false;
}
