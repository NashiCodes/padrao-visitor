package Visitor;

import org.junit.jupiter.api.Test;
import visitor.*;

import static org.junit.jupiter.api.Assertions.*;

public class DispositivosVisitorTest {

    @Test
    public void testCelular() {
        Celular celular = new Celular("Samsung", "Galaxy S10", "128GB", "Preto");
        Visitor visitor = new DispositivoVisitor();
        assertEquals("Celular: Samsung, Galaxy S10, 128GB, Preto", visitor.visit(celular));
    }

    @Test
    public void testTocador() {
        Tocador tocador = new Tocador("Sony", "Walkman", "Preto", "MP3");
        Visitor visitor = new DispositivoVisitor();
        assertEquals("Tocador: Sony, Walkman, Preto, MP3", visitor.visit(tocador));
    }

    @Test
    public void testComputador() {
        Computador computador = new Computador("B450M", "Ryzen 5 3600", "16GB", "1TB", "GTX 1660");
        Visitor visitor = new DispositivoVisitor();
        assertEquals("Computador: B450M, Ryzen 5 3600, 16GB, 1TB, GTX 1660", visitor.visit(computador));
    }

    @Test
    public void testMonitor() {
        Monitor monitor = new Monitor("Samsung", "Curvo", "4K", "24\"", "60Hz");
        Visitor visitor = new DispositivoVisitor();
        assertEquals("Monitor: Samsung, Curvo, 4K, 24\", 60Hz", visitor.visit(monitor));
    }
}
