package vendaDeIngressos;

public class IngressoCamaroteVip extends Ingresso {
    double taxaVip;
    String localizacao;

    public IngressoCamaroteVip(double valorBase, double taxaVip, String localizacao) {
        super(valorBase);
        this.taxaVip = taxaVip;
        this.localizacao = localizacao;
    }

    @Override
    public double consultarValor() {
        return super.consultarValor() + this.taxaVip;
    }

    public void mostrarValoresAdicionais() {
        System.out.println("Taxa do ingresso VIP R$" + taxaVip);
    }

    public void exibirLocalizacao() {
        System.out.println("Localização: " + this.localizacao);
    }
}
