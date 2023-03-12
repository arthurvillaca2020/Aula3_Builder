package testes;

import org.example.TabelaFuncionarios;
import org.example.TabelaFuncionariosBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testesBuilder {

    @Test
    void deveRetornarFuncionarioValido() {

        TabelaFuncionariosBuilder tabelaFuncionariosBuilder = new TabelaFuncionariosBuilder();
        TabelaFuncionarios tabelaFuncionarios = tabelaFuncionariosBuilder
                .setCodigoFuncionario(1)
                .setNomeCompleto("Arthur Almeida")
                .setCPF("987.654.321-00")
                .setSalario(5000.50F)
                .setEmail("arthurA@gmail.com")
                .build();
        assertNotNull(tabelaFuncionarios);
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioSemCodigo() {
        try {
            TabelaFuncionariosBuilder tabelaFuncionariosBuilder = new TabelaFuncionariosBuilder();
            TabelaFuncionarios tabelaFuncionarios = tabelaFuncionariosBuilder
                    .setNomeCompleto("Arthur Almeida")
                    .setCPF("987.654.321-00")
                    .setSalario(5000.50F)
                    .setEmail("arthurA@gmail.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Codigo inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioSemNome() {
        try {
            TabelaFuncionariosBuilder tabelaFuncionariosBuilder = new TabelaFuncionariosBuilder();
            TabelaFuncionarios tabelaFuncionarios = tabelaFuncionariosBuilder
                    .setCodigoFuncionario(1)
                    .setCPF("987.654.321-00")
                    .setSalario(5000.50F)
                    .setEmail("arthurA@gmail.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioSemCPF() {
        try {
            TabelaFuncionariosBuilder tabelaFuncionariosBuilder = new TabelaFuncionariosBuilder();
            TabelaFuncionarios tabelaFuncionarios = tabelaFuncionariosBuilder
                    .setCodigoFuncionario(1)
                    .setNomeCompleto("Arthur Almeida")
                    .setSalario(5000.50F)
                    .setEmail("arthurA@gmail.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CPF inválido", e.getMessage());
        }
    }
}
