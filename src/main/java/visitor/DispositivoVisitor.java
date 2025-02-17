package visitor;

public class DispositivoVisitor implements Visitor {
    @Override
    public String visit(Monitor monitor) {
        return "Monitor: " + monitor.getMarca() + ", " + monitor.getModelo() + ", " + monitor.getResolucao() + ", " + monitor.getTamanho() + ", " + monitor.getRefreshRate();
    }

    @Override
    public String visit(Celular celular) {
        return "Celular: " + celular.getMarca() + ", " + celular.getModelo() + ", " + celular.getCapacidade() + ", " + celular.getCor();
    }

    @Override
    public String visit(Computador computador) {
        return "Computador: " + computador.getPlacaMae() + ", " + computador.getProcessador() + ", " + computador.getMemoria() + ", " + computador.getCapacidade() + ", " + computador.getPlacaVideo();
    }

    @Override
    public String visit(Tocador tocador) {
        return "Tocador: " + tocador.getMarca() + ", " + tocador.getModelo() + ", " + tocador.getCor() + ", " + tocador.getTipo();
    }
}
