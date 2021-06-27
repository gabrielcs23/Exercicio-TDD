package processador;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProcessadorBoletoTest {

    private ProcessadorBoleto processador;

    @BeforeEach
    public void inicializaProcessador() {
        processador = new ProcessadorBoleto();
    }

    @Test
    public void testGerarPagamentos() {
        assertNotNull(processador.gerarPagamentos());
    }

}
