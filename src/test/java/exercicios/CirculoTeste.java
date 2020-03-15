package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CirculoTeste {
    private Circulo circulo;

    @BeforeEach
    public void beforeEach() {
        circulo = new Circulo(2.0);
    }

    @AfterEach
    public void afterEach() {
        circulo = null;
    }

    @Test
    public void construtorCirculo() {
        Circulo circulo = new Circulo(4.0);
        assertEquals(4.0, circulo.getRaio());
    }

    @Test
    public void metodoCriarComRaio() {
        Circulo circulo = Circulo.criarComRaio(6.0);
        assertEquals(6.0, circulo.getRaio());
    }

    @Test
    public void criarObjetoCirculo() {
        assertNotNull(circulo);
    }

    @Test
    public void presencaAtributos() {
        assertNotNull(circulo.getRaio());
    }

    @Test
    public void metodoCalcularArea() {
        assertEquals(12.566370614359172, circulo.calcularArea());
    }

    @Test
    public void metodoCalcularCircunferencia() {
        assertEquals(12.566370614359172, circulo.calcularCircunferencia());
    }

    @Test
    public void metodoSetRaioValorValido4() {
        circulo.setRaio(4.0);
        assertEquals(4.0, circulo.getRaio());
    }

    @Test
    public void metodoSetRaioValorInvalido0() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> circulo.setRaio(0.0));
        assertEquals("Raio deve ser maior que zero.", exception.getMessage());
    }

    @Test
    public void metodoSetRaioValorInvalidoNegativo4() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> circulo.setRaio(-4.0));
        assertEquals("Raio deve ser maior que zero.", exception.getMessage());
    }

    @Test
    public void metodoGetRaio() {
        assertEquals(2.0, circulo.getRaio());
    }
}
