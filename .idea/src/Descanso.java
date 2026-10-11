public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;

    public void defineHorasDescanso(int horas) {
        this.horasDescanso = horas;
    }

    public void defineNumeroSemanas(int semanas) {
        this.numeroSemanas = semanas;
    }

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