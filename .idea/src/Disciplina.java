public class Disciplina {
    private String nomeDisciplina;
    private int horasDeEstudo;
    private double[4] notas;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras(int horas) {
        this.horasDeEstudo = horas;
    }

    public void cadastraNota(int nota, double valorNota) {

    }

    /** public boolean aprovado() {

    }

    @Override
    public String toString() {

    }

}