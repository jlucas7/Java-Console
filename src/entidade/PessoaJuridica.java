package entidade;

import java.time.LocalDate;

public class PessoaJuridica extends Pessoa{
    private LocalDate dataDeAbertura;
    private String cnpj;

    public PessoaJuridica(String nome, Endereco endereco, LocalDate dataDeAbertura, String cnpj) {
        super(nome, endereco);
        this.dataDeAbertura = dataDeAbertura;
        this.cnpj = cnpj;
    }

    public PessoaJuridica() {
    }

    public LocalDate getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(LocalDate dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return  "nome = " + nome + "\n" + endereco +
                "data de abertura = " + dataDeAbertura + "\n" +
                "cnpj = " + cnpj + "\n";
    }
}
