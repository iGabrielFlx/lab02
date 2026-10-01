public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineUsado;
    private int tempoOnlineEsperado;

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    public RegistroTempoOnline(String nomeDisciplina) {
        this(nomeDisciplina, 120);
    }

    public void adicionaTempoOnline(int tempo) {
        this.tempoOnlineUsado = tempoOnlineUsado += tempo;
    }

    public boolean atingiuMetaTempoOnline() {
        if (tempoOnlineUsado >= tempoOnlineEsperado) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return nomeDisciplina + " " + tempoOnlineUsado+ "/" + tempoOnlineEsperado;
    }

}