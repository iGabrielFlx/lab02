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

    }

    public String imprimeResumos() {

    }

    public int contaResumos() {

    }

    public boolean temResumos() {

    }

}