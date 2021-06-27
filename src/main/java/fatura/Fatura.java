package fatura;

import java.util.Date;

public class Fatura {

    private Date data;
    private double valorTotal;
    private String nomeCliente;
    private boolean pagamentoConcluido;

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

    public boolean isPagamentoConcluido() {
        return pagamentoConcluido;
    }

    public void setPagamentoConcluido(boolean pagamentoConcluido) {
        this.pagamentoConcluido = pagamentoConcluido;
    }
}
