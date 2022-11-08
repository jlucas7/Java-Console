package service;

import entidade.Locacao;
import entidade.Pessoa;
import entidade.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class LocacaoService {

    public List<Locacao> locacoes = new ArrayList<>();

    public LocacaoService() {
    }

    public void criarLocacao(String codigo, Pessoa pessoa, List<Veiculo> veiculos) {
        Locacao locacao = new Locacao(codigo, pessoa, veiculos);

        locacoes.add(locacao);
    }

    public String verTodas() {
        return locacoes.toString().replaceAll(",", "").replace("[", "").replace("]","");
    }

    public Locacao verDetalhesLocacao(String codigo) {
       Locacao locacao = locacoes.stream().filter(x -> x.getCodigo() == codigo).findFirst().orElse(null);

        return locacao;
    }

    public String valorTotalLocacao(String codigo) {
        Locacao locacao = locacoes.stream().filter(x -> x.getCodigo() == codigo).findFirst().orElse(null);

        return locacao.getValorTotalLocacao();
    }
}
