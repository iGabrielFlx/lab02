import java.util.Arrays;

/**
 * Gerencia uma coleção limitada de resumos, permitindo cadastrar, contar, buscar e exibir
 * os registros armazenados.
 *
 * @author Gabriel Felix
 */
public class RegistroResumos {
    /**
     * A quantidade de resumos.
     */
    private int numeroDeResumos;
    /**
     * A coleção limitada de resumos.
     */
    private Resumo[] resumos;
    /**
     * Um contador que registra a quantidade de resumos cadastrados.
     */
    private int cont;

    /**
     * Construtor que inicializa o registro com determinada capacidade de resumos.
     *
     * @param numeroDeResumos A quantidade de registros que serão armazenados.
     */
    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
        this.cont = 0;
    }

    /**
     * Adiciona um novo resumo a coleção.
     *
     * @param tema O tema do resumo.
     * @param conteudo O conteúdo correspondente ao resumo.
     */
    public void adiciona(String tema, String conteudo) {
        resumos[cont] = new Resumo(tema, conteudo);
        cont++;
    }

    /**
     * Retorna um array de Strings contendo a representação textual dos resumos.
     *
     * @return Um array com os resumos fornecidos.
     */
    public String[] pegaResumos() {
        String[] textos = new String[cont];
        for (int i = 0; i < cont; i++) {
            textos[i] = resumos[i].toString();
        }
        return textos;
    }

    /**
     * Retorna uma representação textual dos resumos armazenados, além da quantidade de resumos cadastrados.
     *
     * @return Uma String contendo a quantidade e os temas dos resumos.
     */
    public String imprimeResumos() {
        String resumosTextual = "";
        for (int i = 0; i < cont; i++) {
            if (i == cont - 1) {
                resumosTextual += resumos[i].getTema();
            } else {
                resumosTextual += resumos[i].getTema() + " | ";
            }
        }

        return "- " + cont + " resumo(s) cadastrado(s)\n" +
                "- " + resumosTextual;
    }

    /**
     * Contabiliza a quantidade de resumos que existem atualmente.
     *
     * @return A quantidade de resumos existentes.
     */
    public int conta() {
        return cont;
    }

    /**
     * Verifica se já existe algum resumo cadastrado com o tema especificado.
     *
     * @param tema O tema do resumo.
     * @return true se o tema já existir, caso contrário, retorna false.
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < cont; i++) {
            if ((resumos[i].getTema()).equals(tema)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Busca resumos cujo conteúdo contenha uma determinada palavra-chave e retorna os respectivos resumos.
     *
     * @param chaveDeBusca O termo procurado dentro dos conteúdos.
     * @return Um array de Strings com os resumos que contenham a palavra-chave.
     */
    public String[] busca(String chaveDeBusca) {
        int qtdEncontrados = 0;
        for (int i = 0; i < cont; i++) {
            if ((resumos[i].getConteudo()).contains(chaveDeBusca)) {
                qtdEncontrados++;
            }
        }

        String[] textosBuscados = new String[qtdEncontrados];
        int indice = 0;
        for (int i = 0; i < cont; i++) {
            if ((resumos[i].getConteudo()).contains(chaveDeBusca)) {
                textosBuscados[indice] = resumos[i].getTema();
                indice++;
            }
        }

        Arrays.sort(textosBuscados);
        return textosBuscados;
    }
}