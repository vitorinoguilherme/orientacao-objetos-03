package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CorrentistaTeste {
    private Correntista correntista;

    @BeforeEach
    public void beforeEach() {
        correntista = new Correntista(
                "#333", "Guilherme", "gui@gmail.com",
                1128755826);
    }

    @AfterEach
    public void afterEach() {
        correntista = null;
    }

    @Test
    public void construtorCorrentistaCodigo() {
        Correntista correntista = new Correntista("#123");
        assertEquals("#123", correntista.getCodigo());
    }

    @Test
    public void construtorCorrentistaNomeEmail() {
        Correntista correntista = new Correntista("João da Silva", "joao@gmail.com");
        assertEquals("João da Silva", correntista.getNome());
        assertEquals("joao@gmail.com", correntista.getEmail());
    }

    @Test
    public void construtorCorrentistaNomeEmailTelefone() {
        Correntista correntista = new Correntista("João da Silva", "joao@gmail.com", 1111111);
        assertEquals("João da Silva", correntista.getNome());
        assertEquals("joao@gmail.com", correntista.getEmail());
        assertEquals(1111111, correntista.getTel());
    }

    @Test
    public void construtorCorrentistaCodigoNomeEmailTelefone() {
        Correntista correntista = new Correntista("#123","João da Silva",
                "joao@gmail.com", 1111111);
        assertEquals("João da Silva", correntista.getNome());
        assertEquals("joao@gmail.com", correntista.getEmail());
        assertEquals(1111111, correntista.getTel());
    }

    @Test
    public void metodoCriarComNomeEmail() {
        Correntista correntista = Correntista.criarComNomeEmail("João da Silva", "joao@gmail.com");
        assertEquals("João da Silva", correntista.getNome());
        assertEquals("joao@gmail.com", correntista.getEmail());
    }

    @Test
    public void criarObjetoCorrentista() {
        assertNotNull(correntista);
    }

    @Test
    public void presencaAtributos() {
        assertNotNull(correntista.getCodigo());
        assertNotNull(correntista.getNome());
        assertNotNull(correntista.getEmail());
        assertNotNull(correntista.getTel());
    }

    @Test
    public void metodoSetCodigo() {
        correntista.setCodigo("#123");
        assertEquals("#123", correntista.getCodigo());
    }

    @Test
    public void metodoSetNome() {
        correntista.setNome("nomeTeste");
        assertEquals("nomeTeste", correntista.getNome());
    }

    @Test
    public void metodoSetEmail() {
        correntista.setEmail("emailTeste@gmail.com");
        assertEquals("emailTeste@gmail.com", correntista.getEmail());
    }

    @Test
    public void metodoSetTel() {
        correntista.setTel(1111111111);
        assertEquals(1111111111, correntista.getTel());
    }

    @Test
    public void metodoSetCodigoValorInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> correntista.setCodigo(null));
        assertEquals("Informe o código do Correntista", exception.getMessage());
    }

    @Test
    public void metodoSetNomeValorInvalido() {
        Exception exception1 = assertThrows(IllegalArgumentException.class, () -> correntista.setNome(null));
        assertEquals("Informe o nome do Correntista", exception1.getMessage());
    }

    @Test
    public void metodoSetEmailValorInvalido() {
        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> correntista.setEmail(null));
        assertEquals("Informe o e-mail do Correntista", exception2.getMessage());
    }

    @Test
    public void metodoSetTelValorInvalido() {
        Exception exception3 = assertThrows(IllegalArgumentException.class, () -> correntista.setTel(0));
        assertEquals("Informe o telefone do Correntista", exception3.getMessage());
    }

    // Objeto correntista tem como atributos "#333", "Guilherme", "gui@gmail.com", 1128755826
    @Test
    public void metodoGetCodigo() throws IllegalAccessException {
        assertEquals("#333", correntista.getCodigo());
    }

    @Test
    public void metodoGetNome() {
        assertEquals("Guilherme", correntista.getNome());
    }

    @Test
    public void metodoGetEmail() {
        assertEquals("gui@gmail.com", correntista.getEmail());
    }

    @Test
    public void metodoGetTel() {
        assertEquals(1128755826, correntista.getTel());
    }

}
