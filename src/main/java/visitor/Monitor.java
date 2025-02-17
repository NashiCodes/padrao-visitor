package visitor;

public class Monitor implements Dispositivo {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    private final String Marca;
    private final String Modelo;
    private final String Resolucao;
    private final String Tamanho;
    private final String RefreshRate;

    public Monitor(String Marca, String Modelo, String Resolucao, String Tamanho, String RefreshRate) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Resolucao = Resolucao;
        this.Tamanho = Tamanho;
        this.RefreshRate = RefreshRate;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getResolucao() {
        return Resolucao;
    }

    public String getTamanho() {
        return Tamanho;
    }

    public String getRefreshRate() {
        return RefreshRate;
    }
}
