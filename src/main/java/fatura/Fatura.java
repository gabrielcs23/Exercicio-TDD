package fatura;

import java.util.Date;

public class Fatura {

    private final Date data;
    private final double valorTotal;
    private final String nomeCliente;
    private boolean paga;

    public Fatura(Date data, double valorTotal, String nomeCliente) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
    }

    public Date getData() {
        return data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }
}
