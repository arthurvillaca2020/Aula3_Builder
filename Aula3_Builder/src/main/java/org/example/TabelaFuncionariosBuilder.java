package org.example;

public class TabelaFuncionariosBuilder {

    private TabelaFuncionarios tabelaFuncionarios;
    public TabelaFuncionariosBuilder() {
        tabelaFuncionarios = new TabelaFuncionarios();
    }

    public TabelaFuncionarios build() {
        if (tabelaFuncionarios.getcodigoFuncionario() == 0) {
            throw new IllegalArgumentException("Codigo inválido");
        }
        if (tabelaFuncionarios.getNomeCompleto().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (tabelaFuncionarios.getCPF().equals("")) {
            throw new IllegalArgumentException("CPF inválido");
        }
        return tabelaFuncionarios;
    }

    public TabelaFuncionariosBuilder setCodigoFuncionario(int codigoFuncionario) {
        tabelaFuncionarios.setCodigoFuncionario(codigoFuncionario);
        return this;
    }

    public TabelaFuncionariosBuilder setNomeCompleto(String nomeCompleto) {
        tabelaFuncionarios.setNomeCompleto(nomeCompleto);
        return this;
    }

    public TabelaFuncionariosBuilder setCPF(String CPF) {
        tabelaFuncionarios.setCPF(CPF);
        return this;
    }

    public TabelaFuncionariosBuilder setEmail(String Email) {
        tabelaFuncionarios.setEmail(Email);
        return this;
    }

    public TabelaFuncionariosBuilder setSalario(Float Salario) {
        tabelaFuncionarios.setSalario(Salario);
        return this;
    }
}
