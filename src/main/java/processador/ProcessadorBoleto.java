package processador;

import boleto.Boleto;
import fatura.Fatura;
import pagamento.Pagamento;

import java.util.List;
import java.util.stream.Collectors;

public class ProcessadorBoleto {

    public List<Pagamento> gerarPagamentos(List<Boleto> boletos) {
        return boletos.stream()
                .map(boleto -> new Pagamento(boleto.getValorPago(), boleto.getData(), "BOLETO"))
                .collect(Collectors.toList());
    }

    public void gerarPagamentosEValidarFatura(Fatura fatura, List<Boleto> boletos) {
        Double totalPago = gerarPagamentos(boletos).stream()
                .map(Pagamento::getValorPago)
                .reduce(0.0, Double::sum);
        fatura.setPaga(totalPago >= fatura.getValorTotal());
    }
}
