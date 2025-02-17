package visitor;

public class Computador implements Dispositivo {
    private final String PlacaMae;
    private final String Processador;
    private final String Memoria;
    private final String Capacidade;
    private final String PlacaVideo;

    public Computador(String PlacaMae, String Processador, String Memoria, String Capacidade, String PlacaVideo) {
        this.PlacaMae = PlacaMae;
        this.Processador = Processador;
        this.Memoria = Memoria;
        this.Capacidade = Capacidade;
        this.PlacaVideo = PlacaVideo;
    }

    public String getPlacaMae() {
        return PlacaMae;
    }

    public String getProcessador() {
        return Processador;
    }

    public String getMemoria() {
        return Memoria;
    }

    public String getCapacidade() {
        return Capacidade;
    }

    public String getPlacaVideo() {
        return PlacaVideo;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
