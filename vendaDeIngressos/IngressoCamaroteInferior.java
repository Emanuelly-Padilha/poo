package vendaDeIngressos;

public class IngressoCamaroteInferior extends Ingresso {

    String localizacao;

    public IngressoCamaroteInferior(double valorBase, String localizacao) {
        super(valorBase);
        this.localizacao = localizacao;
    }

    public void exibirLocalizacao() {
        System.out.println("Localização: " + this.localizacao);
    }
}
