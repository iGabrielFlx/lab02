import java.util.Arrays;

/**
 * Representa uma disciplina cursada pelo aluno, permitindo o controle das horas de estudo,
 * cadastro de notas e pesos, além do cálculo da média, que pode ser aritmética ou ponderada.
 *
 * @author Gabriel Felix
 */
public class Disciplina {
    /**
     * O nome da disciplina.
     */
    private String nomeDisciplina;
    /**
     * A quantidade de horas de estudo.
     */
    private int horasDeEstudo;
    /**
     * As notas da disciplina.
     */
    private double[] notas;
    /**
     * Os pesos correspondentes às notas da disciplina.
     */
    private int[] pesos;

    /**
     * Construtor que define o nome da disciplina cursada, e inicializa a disciplina
     * com 4 notas e pesos iguais a 1.
     *
     * @param nomeDisciplina O nome da disciplina cursada.
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[4];
        this.pesos = new int[] {1, 1, 1, 1};
    }

    /**
     * Construtor que define o nome da disciplina cursada e a quantidade de notas,
     * e inicializa a disciplina com pesos iguais a 1.
     *
     * @param nomeDisciplina O nome da disciplina cursada.
     * @param qtdNotas A quantidade de notas da disciplina.
     */
    public Disciplina(String nomeDisciplina, int qtdNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[qtdNotas];
        this.pesos = new int[qtdNotas];

        for (int i = 0; i < qtdNotas; i++) {
            this.pesos[i] = 1;
        }
    }

    /**
     * Construtor que define o nome da disciplina cursada, a quantidade de notas e os pesos atribuídos a cada nota.
     *
     * @param nomeDisciplina O nome da disciplina cursada.
     * @param qtdNotas A quantidade de notas da disciplina.
     * @param pesos Os valores dos pesos atribuídos a cada nota.
     */
    public Disciplina(String nomeDisciplina, int qtdNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[qtdNotas];
        this.pesos = pesos;
    }

    /**
     * Define ou acumula a quantidade total de horas de estudo para a disciplina.
     *
     * @param horas A quantidade total de horas de estudo a ser adicionada.
     */
    public void cadastraHoras(int horas) {
        this.horasDeEstudo = horas;
    }

    /**
     * Define ou cadastra a nota de determinada avaliação da disciplina.
     *
     * @param nota O número da nota a ser definida ou cadastrada.
     * @param valorNota O valor obtido para a nota.
     */
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    /**
     * Calcula a média (aritmética ou ponderada) da disciplina, considerando os pesos definidos.
     *
     * @return O valor da média calculada.
     */
    public double calculaMedia() {
        /**
         * O valor da nota multiplicado pelo peso correspondente.
         */
        double somaPonderada = 0;
        /**
         * A soma de todos os pesos.
         */
        int somaPesos = 0;
        for (int i = 0; i < notas.length; i++) {
            somaPesos += pesos[i];
            somaPonderada += notas[i] * pesos[i];
        }

        if (somaPesos == 0) {
            return 0;
        }

        return somaPonderada / somaPesos;
    }

    /**
     * Verifica se o aluno foi aprovado na disciplina (obteve uma média igual ou acima de 7.0).
     *
     * @return true se a média calculada for acima de 7.0, caso contrário, retorna false.
     */
    public boolean aprovado() {
        /**
         * A média total da disciplina.
         */
        double media = calculaMedia();
        return media >= 7;
    }

    /**
     * Retorna uma representação em texto da disciplina, com o seu nome, a quantidade de horas de estudo,
     * a média obtida e as notas da disciplina.
     *
     * @return Uma string com os dados da disciplina.
     */
    @Override
    public String toString() {
        double media = calculaMedia();
        return nomeDisciplina + " " + horasDeEstudo + " " + media + " " + Arrays.toString(notas);
    }

}