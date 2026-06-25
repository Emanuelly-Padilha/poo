package vendaDeIngressos;

public class IngressoVip extends Ingresso {
    double taxaVip;

    public IngressoVip(double valorBase, double taxaVip) {
        super(valorBase);
        this.taxaVip = taxaVip;
    }

    @Override
    public double consultarValor() {
        return super.consultarValor() + this.taxaVip;
    }

    public void mostrarValoresAdicionais() {
        System.out.println("Taxa do ingresso VIP R$" + taxaVip);
    }
}
