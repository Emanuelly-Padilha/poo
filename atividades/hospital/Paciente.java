package hospital;


import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nome;
    private List<Consulta> consultas;

    public Paciente(String nome) {
        this.nome = nome;
        this.consultas = new ArrayList<>();
    }

    public void adiionarconsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public void listarConsultas() {
        for (Consulta c   : consultas) {
             System.out.println(c.getData() + " às " + c.getHora());
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Consulta> getconsultas() {
        return consultas;
    }
    

public void mostrarMedicos() {
    System.out.println("\n Médicos responsáveis:");
    for (Consulta c : consultas) {
        System.out.println(c.getMedico().getNome());
    }
}

public void mostrarProntuarios() {
    System.out.println("\n Histórico de prontuários:");
    for (Consulta c : consultas) {
        System.out.println(c.getProntuario().getDescricao());
    }
}
}
