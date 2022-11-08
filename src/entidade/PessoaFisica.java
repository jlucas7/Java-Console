package entidade;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa{
    private LocalDate dataNascimento;
    private String cpf;
    private String sexo;

    public PessoaFisica(String nome, Endereco endereco, LocalDate dataNascimento, String cpf, String sexo) {
        super(nome, endereco);
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public PessoaFisica() {
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return  "nome = " + nome + "\n" + endereco +
                "data de nascimento = " + dataNascimento + "\n" +
                "cpf = " + cpf + "\n" +
                "sexo = " + sexo + "\n";
    }
}
