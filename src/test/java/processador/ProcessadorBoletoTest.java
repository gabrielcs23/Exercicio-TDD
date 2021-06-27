package processador;

import boleto.Boleto;
import fatura.Fatura;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pagamento.Pagamento;

import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;

public class ProcessadorBoletoTest {

    private ProcessadorBoleto processador;

    @BeforeEach
    public void inicializaProcessador() {
        processador = new ProcessadorBoleto();
    }

    @Test
    public void testGerarUmPagamento() {
        Fatura fatura = new Fatura(Date.from(Instant.now()), 1000.0, "Luiz");
        List<Boleto> boletos = new ArrayList<>();
        Boleto boleto = new Boleto("codigo", Date.from(Instant.now()), 10.0);
        boletos.add(boleto);
        List<Pagamento> pagamentos = processador.gerarPagamentos(fatura, boletos);
        Assertions.assertEquals(1, pagamentos.size());
        Assertions.assertEquals(boleto.getValorPago(), pagamentos.get(0).getValorPago());
    }

    @Test
    public void testPagarUmaFaturaPorCompleto() {
        Fatura fatura = new Fatura(Date.from(Instant.now()), 1500.0, "Luiz");
        List<Boleto> boletos = Arrays.asList(
                new Boleto("codigo", Date.from(Instant.now()), 500.0),
                new Boleto("codigo", Date.from(Instant.now()), 400.0),
                new Boleto("codigo", Date.from(Instant.now()), 600.0)
        );
        processador.gerarPagamentosEValidarFatura(fatura, boletos);
        Assertions.assertTrue(fatura.isPaga());
    }

    @Test
    public void testNaoPagarUmaFaturaPorCompleto() {
        Fatura fatura = new Fatura(Date.from(Instant.now()), 2000.0, "Luiz");
        List<Boleto> boletos = Arrays.asList(
                new Boleto("codigo", Date.from(Instant.now()), 500.0),
                new Boleto("codigo", Date.from(Instant.now()), 400.0)
        );
        processador.gerarPagamentosEValidarFatura(fatura, boletos);
        Assertions.assertFalse(fatura.isPaga());
    }

}
