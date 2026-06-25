package hospital;


public class Consulta {
    private String data;
    private Paciente paciente;
    private Medico medico;
    private Prontuario prontuario;
     private String hora;

    public Consulta(String data, Paciente paciente, Medico medico, String hora, String descricaoProntuario) {
        this.data = data;
        this.paciente = paciente;
        this.hora = hora;
        this.medico = medico;
        this.prontuario = new Prontuario(descricaoProntuario);
    }

    public String getData() {
        return data;
    }

    public Medico getMedico() {
        return medico;
    }

      public String getHora() {
        return hora;
    }
    public Prontuario getProntuario() {
        return prontuario;
    }
}
