/**
 * Representa um resumo de estudo, contendo um tema específico e seu respectivo conteúdo.
 *
 * @author Gabriel Felix
 */
public class Resumo {
    /**
     * O tema específico do resumo.
     */
    private String tema;
    /**
     * O conteúdo atribuído ao resumo.
     */
    private String conteudo;

    /**
     * Construtor que inicializa o resumo com seu tema e o seu respectivo conteúdo.
     *
     * @param tema O tema central do resumo.
     * @param conteudo O texto discritivo atribuído ao resumo.
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Retorna o conteúdo textual do resumo.
     *
     * @return Uma string contendo o conteúdo do resumo.
     */
    public String getConteudo() {
        return conteudo;
    }

    /**
     * Retorna o tema do resumo.
     *
     * @return Uma string contendo o tema correspondente ao resumo.
     */
    public String getTema() {
        return tema;
    }

    /**
     * Retorna uma representação textual do resumo, com tema e conteúdo.
     *
     * @return Uma string com tema e conteúdo correpondentes ao resumo.
     */
    @Override
    public String toString() {
        return getTema() + ":" + " " + getConteudo();
    }
}
