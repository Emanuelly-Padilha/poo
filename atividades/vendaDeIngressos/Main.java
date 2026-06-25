package vendaDeIngressos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do ingresso normal: R$");
        double valorBaseNormal = scanner.nextDouble();

        Ingresso ingressoNormal = new Ingresso(valorBaseNormal);

        System.out.print("Digite o valor base do ingresso VIP: R$");
        double valorBaseVIP = scanner.nextDouble();

        System.out.print("Digite a taxa VIP: R$");
        double taxaVIP = scanner.nextDouble();

        IngressoVip ingressoVIP = new IngressoVip(valorBaseVIP, taxaVIP);

        System.out.print("Digite o valor do ingresso camarote inferior: R$");
        double valorBaseCamarote = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite a localização do camarote inferior: ");
        String localizacaoCamarote = scanner.nextLine();

        IngressoCamaroteInferior camaroteInferior = new IngressoCamaroteInferior(valorBaseCamarote,
                localizacaoCamarote);

        System.out.println("Valor do ingresso camarote inferior: R$" + camaroteInferior.consultarValor());
        camaroteInferior.exibirLocalizacao();

        System.out.print("Digite o valor do ingresso camarote VIP: R$");
        double valorBaseCamaroteVIP = scanner.nextDouble();

        System.out.print("Digite a taxa VIP: R$");
        double taxaCamaroteVIP = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite a localização do camarote VIP: ");
        String localizacaoCamaroteVIP = scanner.nextLine();

        IngressoCamaroteVip camaroteVIP = new IngressoCamaroteVip(valorBaseCamaroteVIP, taxaCamaroteVIP,
                localizacaoCamaroteVIP);

        System.out.println("Valor total do ingresso camarote VIP: R$" + camaroteVIP.consultarValor());
        camaroteVIP.mostrarValoresAdicionais();
        camaroteVIP.exibirLocalizacao();

    }
}