public class RegistroResumos {
    private int numeroDeResumos;
    private Resumo[] resumos;
    private int cont;

    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
        this.cont = 0;
    }

    public void adiciona(String tema, String conteudo) {
        resumos[cont] = new Resumo(tema, conteudo);
        cont++;
    }

    public String[] pegaResumos() {
        String[] textos = new String[cont];
        for (int i = 0; i < cont; i++) {
            textos[i] = resumos[i].toString();
        }
        return textos;
    }

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

    public int conta() {
        return cont;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < cont; i++) {
            if ((resumos[i].getTema()).equals(tema)) {
                return true;
            }
        }
        return false;
    }
}