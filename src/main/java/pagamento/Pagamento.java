package pagamento;

import java.util.Date;

public class Pagamento {

    private final double valorPago;
    private final Date data;
    private final String tipoPagamento;

    public Pagamento(double valorPago, Date data, String tipoPagamento) {
        this.valorPago = valorPago;
        this.data = data;
        this.tipoPagamento = tipoPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public Date getData() {
        return data;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }
}
