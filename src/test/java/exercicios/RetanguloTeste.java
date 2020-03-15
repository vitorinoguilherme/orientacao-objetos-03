package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RetanguloTeste {
    private Retangulo retangulo;

    @BeforeEach
    public void beforeEach() {
        retangulo = new Retangulo(2.0, 3.0);
    }

    @AfterEach
    public void afterEach() {
        retangulo = null;
    }

    @Test
    @DisplayName("Deve criar um objeto conta")
    public void criarObjetoRetangulo() {
        assertNotNull(retangulo);
    }

    @Test
    public void presencaAtributos() {
        assertNotNull(retangulo.getAltura());
        assertNotNull(retangulo.getBase());
    }

    @Test
    public void metodoCriarComAlturaBase() {
        Retangulo retangulo = Retangulo.criarComBaseAltura(4.0,8.0);

        assertEquals(4.0, retangulo.getAltura());
        assertEquals(8.0, retangulo.getBase());
    }

    @Test
    public void construtorRetanguloAlturaBase() {
        assertEquals(2.0, retangulo.getAltura());
        assertEquals(3.0, retangulo.getBase());
    }

    @Test
    public void metodoCalcularAreaRetangulo() {
        assertEquals(6.0, retangulo.calcularArea());
    }

    @Test
    public void metodoCalcularPerimetroRetangulo() {
        assertEquals(10.0, retangulo.calcularPerimetro());
    }

    @Test
    public void metodoSetBaseValorValido4() throws IllegalAccessException {
        retangulo.setBase(4.0);

        assertEquals(4.0, retangulo.getBase());
    }

    @Test
    public void metodoSetBaseValorInvalido0() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> retangulo.setBase(0.0));
        assertEquals("Base deve ser maior que zero", exception.getMessage());
    }

    @Test
    public void metodoSetBaseValorInvalidoNegativo4() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> retangulo.setBase(-4.0));
        assertEquals("Base deve ser maior que zero", exception.getMessage());
    }

    @Test
    public void metodoGetBase() {
        assertEquals(3.0, retangulo.getBase());
    }

    @Test
    public void metodoSetAlturaValorValido4() throws IllegalAccessException {
        retangulo.setAltura(4.0);

        assertEquals(4.0, retangulo.getAltura());
    }

    @Test
    public void metodoSetAlturaValorInvalido0() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> retangulo.setAltura(0.0));
        assertEquals("Altura deve ser maior que zero", exception.getMessage());
    }

    @Test
    public void metodoSetAlturaValorInvalidoNegativo4() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> retangulo.setAltura(-4.0));
        assertEquals("Altura deve ser maior que zero", exception.getMessage());
    }

    @Test
    public void metodoGetAltura() {
        assertEquals(2.0, retangulo.getAltura());
    }
}
