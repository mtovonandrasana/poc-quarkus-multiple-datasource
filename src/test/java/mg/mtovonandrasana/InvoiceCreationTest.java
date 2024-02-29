package mg.mtovonandrasana;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import mg.mtovonandrasana.invoice.CreateInvoice;
import mg.mtovonandrasana.invoice.Invoice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
class InvoiceCreationTest {
    @Inject
    CreateInvoice createInvoice;

    @Test
    void shouldCreateInvoice() {

        Invoice newInvoice = new Invoice();
        newInvoice.amount = 15L;

        Invoice createdInvoice = createInvoice.createAndSave(newInvoice);
        assertNotNull(createdInvoice);
        assertNotNull(createdInvoice.id);

    }
}
