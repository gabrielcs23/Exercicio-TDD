package boleto;

import java.util.Date;

public class Boleto {

    private final String codigo;
    private final Date data;
    private final double valorPago;

    public Boleto(String codigo, Date data, double valorPago) {
        this.codigo = codigo;
        this.data = data;
        this.valorPago = valorPago;
    }

    public String getCodigo() {
        return codigo;
    }

    public Date getData() {
        return data;
    }

    public double getValorPago() {
        return valorPago;
    }
}
