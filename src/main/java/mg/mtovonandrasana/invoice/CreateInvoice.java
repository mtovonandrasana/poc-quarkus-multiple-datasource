package mg.mtovonandrasana.invoice;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class CreateInvoice {

    @Transactional
    public Invoice createAndSave(Invoice invoice) {
        invoice.persistAndFlush();
        return invoice;
    }
}
