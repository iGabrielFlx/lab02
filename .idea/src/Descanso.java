public class Descanso {
    private int horasDescanso;
    private int numerosSemana;

    public void defineHorasDescanso(int horas) {
        this.horasDescanso = horas;
    }

    public void defineNumeroSemanas(int semanas) {
        this.numerosSemana = semanas;
    }

    public String getStatusGeral() {
        if ((horasDescanso / numerosSemana) >= 26) {
            return "descansado";
        }
        return "cansado";
    }
}