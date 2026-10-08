import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasDeEstudo;
    private double notas[] = new double[4];
    private double soma;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras(int horas) {
        this.horasDeEstudo = horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota] = valorNota;
    }

    public boolean aprovado() {
        soma = 0;
        for (int i = 0; i < 4; i++) {
            if (notas[i] != 0) {
                soma += notas[i];
            }
        }
        double med = (soma/4);
        if (med >= 7.0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        int acc = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] != 0) {
                acc += notas[i];
            }
        }

        double media = (acc / 4);
        return nomeDisciplina + " " + horasDeEstudo + " " + media + " " + Arrays.toString(notas);
    }
}