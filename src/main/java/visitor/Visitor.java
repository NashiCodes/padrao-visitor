package visitor;

public interface Visitor {
    String visit(Monitor monitor);
    String visit(Celular celular);
    String visit(Computador computador);
    String visit(Tocador tocador);
}
