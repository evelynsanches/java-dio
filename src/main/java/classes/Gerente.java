package classes;

public class Gerente {

    private double valorImposto;

    public double getValorImposto() {
        return valorImposto;
    }
    public void setValorImposto(double valorImposto) {
        this.valorImposto = valorImposto;
    }

    public double calculaImposto() {
        return this.valorImposto * 0.01;
    }
}
