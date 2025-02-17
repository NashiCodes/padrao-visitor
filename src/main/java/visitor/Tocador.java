package visitor;

public class Tocador implements Dispositivo {
    private final String marca;
    private final String modelo;
    private final String cor;
    private final String tipo;

    public Tocador(String marca, String modelo, String cor, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
