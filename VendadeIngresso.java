
interface ValoresAdicionais {
    void mostrarValoresAdicionais();
}

interface Localizacao {
    void exibirLocalizacao();
}

class Ingresso {

    protected double valorBase;

    public Ingresso(double valorBase) {
        this.valorBase = valorBase;
    }

    public double consultarValor() {
        return valorBase;
    }

    public void mostrarValor() {
        System.out.println("Valor do ingresso: R$ " + valorBase);
    }
}

class IngressoVIP extends Ingresso implements ValoresAdicionais {

    private double taxaVIP;

    public IngressoVIP(double valorBase, double taxaVIP) {
        super(valorBase);
        this.taxaVIP = taxaVIP;
    }

    @Override
    public void mostrarValoresAdicionais() {
        System.out.println("Valor base: R$ " + valorBase);
        System.out.println("Taxa VIP: R$ " + taxaVIP);
        System.out.println("Valor total: R$ " + (valorBase + taxaVIP));
    }
}

class CamaroteInferior extends Ingresso implements Localizacao {

    private String localizacao;

    public CamaroteInferior(double valorBase, String localizacao) {
        super(valorBase);
        this.localizacao = localizacao;
    }

    @Override
    public void exibirLocalizacao() {
        System.out.println("Localização do camarote: " + localizacao);
    }
}

class CamaroteVIP extends IngressoVIP implements Localizacao {

    private String localizacao;

    public CamaroteVIP(double valorBase, double taxaVIP, String localizacao) {
        super(valorBase, taxaVIP);
        this.localizacao = localizacao;
    }

    @Override
    public void exibirLocalizacao() {
        System.out.println("Localização do camarote VIP: " + localizacao);
    }
}

public class VendadeIngresso {

    public static void main(String[] args) {

        Ingresso ingresso = new Ingresso(100);
        ingresso.mostrarValor();

        IngressoVIP vip = new IngressoVIP(100, 50);
        vip.mostrarValoresAdicionais();

        CamaroteInferior ci = new CamaroteInferior(150, "Setor B - Fileira 3");
        ci.mostrarValor();
        ci.exibirLocalizacao();

        CamaroteVIP cvip = new CamaroteVIP(200, 80, "Área Premium");
        cvip.mostrarValoresAdicionais();
        cvip.exibirLocalizacao();
    }
}
