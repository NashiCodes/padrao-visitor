package visitor;

public class Celular implements Dispositivo {
    private final String marca;
    private final String modelo;
    private final String capacidade;
    private final String cor;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Celular(String marca, String modelo, String capacidade, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public String getCor() {
        return cor;
    }
}
