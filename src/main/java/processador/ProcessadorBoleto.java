package processador;

import boleto.Boleto;
import fatura.Fatura;
import pagamento.Pagamento;

import java.util.List;
import java.util.stream.Collectors;

public class ProcessadorBoleto {

    public List<Pagamento> gerarPagamentos(Fatura fatura, List<Boleto> boletos) {
        return boletos.stream()
                .map(boleto -> new Pagamento(boleto.getValorPago(), boleto.getData(), "BOLETO"))
                .collect(Collectors.toList());
    }

    public void gerarPagamentosEValidarFatura(Fatura fatura, List<Boleto> boletos) {
        gerarPagamentos(fatura, boletos);
        fatura.setPaga(true);
    }
}
