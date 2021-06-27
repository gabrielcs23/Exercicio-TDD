package processador;

import boleto.Boleto;
import fatura.Fatura;
import pagamento.Pagamento;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorBoleto {

    public List<Pagamento> gerarPagamentos(Fatura fatura, List<Boleto> boletos) {
        List<Pagamento> pagamentos = new ArrayList<>();
        return pagamentos;
    }
}
