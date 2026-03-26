import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
package hospital;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do paciente: ");
        Paciente paciente = new Paciente(sc.nextLine());

        List<Medico> medicos = new ArrayList<>();
        medicos.add(new Medico("Dr. João", "Cardiologista"));
        medicos.add(new Medico("Dra. Maria", "Dermatologista"));
        medicos.add(new Medico("Dr. Pedro", "Ortopedista"));

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Marcar consulta");
            System.out.println("2 - Listar consultas do paciente");
            System.out.println("3 - Mostrar médico responsável");
            System.out.println("4 - Mostrar histórico de prontuários");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("\nEscolha um médico:");
                    for (int i = 0; i < medicos.size(); i++) {
                        System.out.println(i + " - " + medicos.get(i).getNome());
                    }

                    int escolha = sc.nextInt();
                    sc.nextLine();

                    Medico medico = medicos.get(escolha);

                    System.out.print("Data: ");
                    String data = sc.nextLine();

                    System.out.print("Hora: ");
                    String hora = sc.nextLine();

                    System.out.print("Descrição do prontuário: ");
                    String desc = sc.nextLine();

                    Consulta c = new Consulta c (data, hora, paciente, medico, desc);
                    paciente.adicionarConsulta(c);

                    System.out.println("✅ Consulta marcada!");
                    break;
                case 2:
                    paciente.listarConsultas();
                    break;

                case 3:
                    paciente.mostrarMedicos();
                    break;

                case 4:
                    paciente.mostrarProntuarios();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        
    }
}