/**
 * Controla e monitora o tempo online do aluno dedicado a determinada disciplina, permitindo
 * adicionar horas, exibir o estado atual e verificar se a meta foi atingida.
 *
 * @author Gabriel Felix
 */
public class RegistroTempoOnline {
    /**
     * O nome da disciplina.
     */
    private String nomeDisciplina;
    /**
     * A quantidade de tempo online de dedicação utilizado.
     */
    private int tempoOnlineUsado;
    /**
     * A quantidade de tempo online de dedicação esperado.
     */
    private int tempoOnlineEsperado;

    /**
     * Um construtor que define o nome da disciplina e o tempo online de dedicação esperado.
     *
     * @param nomeDisciplina O nome da discipliana.
     * @param tempoOnlineEsperado A quantidade de tempo online esperado.
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    /**
     * Construtor que define apenas o nome da disciplina, assumindo um valor padrão de 120 horas esperadas.
     *
     * @param nomeDisciplina O nome da disciplina.
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this(nomeDisciplina, 120);
    }

    /**
     * Adiciona tempo utilizado de dedicação para a disciplina.
     *
     * @param tempo A quantidade de tempo dedicado.
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnlineUsado = tempoOnlineUsado += tempo;
    }

    /**
     * Verifica se a meta de tempo online foi atingida.
     *
     * @return true caso a meta tenha sido atingida, caso contrário, retorna false.
     */
    public boolean atingiuMetaTempoOnline() {
        if (tempoOnlineUsado >= tempoOnlineEsperado) {
            return true;
        }
        return false;
    }

    /**
     * Retorna uma representação textual contendo o nome da disciplina, o tempo online utilizado e o tempo
     * online esperado de dedicação.
     *
     * @return Uma string com os dados relacionados ao tempo online da disciplina.
     */
    @Override
    public String toString() {
        return nomeDisciplina + " " + tempoOnlineUsado+ "/" + tempoOnlineEsperado;
    }

}