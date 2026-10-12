/**
 * Representa e gerencia a rotina de descanso do aluno, permitindo registrar suas horas de descanso
 * e o número de semanas decorridas para a avaliação do seu estado geral.
 *
 * @author Gabriel Felix
 */
public class Descanso {
    /**
     * A quantidade de horas de descanso do aluno.
     */
    private int horasDescanso;
    /**
     * O número de semanas decorridas.
     */
    private int numeroSemanas;

    /**
     * Define a quantidade total de horas de descanso acumuladas pelo aluno.
     *
     * @param horas A quantidade total de horas dedicadas ao descanso.
     */
    public void defineHorasDescanso(int horas) {
        this.horasDescanso = horas;
    }

    /**
     * Define o número de semanas decorridas para o cálculo da rotina de descanso do aluno.
     *
     * @param semanas O número de semanas decorridas para o cálculo da rotina de descanso.
     */
    public void defineNumeroSemanas(int semanas) {
        this.numeroSemanas = semanas;
    }

    /**
     * Realiza o cálculo da rotina de descanso do aluno, verificando se ele atingiu a meta de
     * 26 horas ou mais de descanso. Se sim, o aluno é considerado descansado. Caso contrário,
     * ele é considerado cansado.
     *
     * @return Uma string contendo "cansado" ou "descansado".
     */
    public String getStatusGeral() {
        if (numeroSemanas == 0) {
            return "cansado";
        }

        if ((horasDescanso / numeroSemanas) >= 26) {
            return "descansado";
        }
        return "cansado";
    }
}