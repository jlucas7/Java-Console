package entidade;

import java.util.List;

public class Locacao {
    private String codigo;
    private Pessoa pessoa;
    private List<Veiculo> veiculos;

    public Locacao(String codigo, Pessoa pessoa, List<Veiculo> veiculos) {
        this.codigo = codigo;
        this.pessoa = pessoa;
        this.veiculos = veiculos;
    }

    public Locacao() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public String getValorTotalLocacao() {
        Double aux = 0.0;

        for(int i = 0; i < veiculos.size(); i++) {
            aux = aux + veiculos.get(i).getValorLocacao();
        }
        return "Valor total da Locação: R$ " + aux;
    }

    @Override
    public String toString() {
        return  "\ncodigo: " + codigo + "\n" +
                "nome: " + pessoa.nome + "\n" +
                "veiculos: " + "\n" +
                " " + veiculos.toString().replaceAll(",", "").replace("[", "").replace("]","");
    }
}
