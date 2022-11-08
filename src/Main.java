import entidade.*;
import service.LocacaoService;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Veiculo> veiculos = new ArrayList<>();
        LocacaoService locacaoService = new LocacaoService();
        Endereco endereco = new Endereco("Log.", "Itinga", "42738-840", "Comp.", "Lauro de Freitas", "BA");
        Pessoa pessoa = new Pessoa("Lucas", endereco);

        PessoaFisica pessoaFisica = new PessoaFisica("Lucas", endereco, LocalDate.of(1995, Month.SEPTEMBER, 22),"999.999.999-00", "M");
        System.out.println("\nPESSOA FÍSICA:\n");
        System.out.println(pessoaFisica);

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Lucas", endereco, LocalDate.of(1995, Month.SEPTEMBER, 22),"00.000.000/0000-00");
        System.out.println("PESSOA JURÍDICA:\n");
        System.out.println(pessoaJuridica);

        Veiculo veiculo1 = new Veiculo(
                "Fusion",
                "Ford",
                LocalDate.of(2015, Month.SEPTEMBER, 01),
                LocalDate.of(2016, Month.SEPTEMBER, 01),
                252.90
        );
        Veiculo veiculo2 = new Veiculo(
                "Fiesta",
                "Ford",
                LocalDate.of(2022, Month.SEPTEMBER, 01),
                LocalDate.of(2022, Month.SEPTEMBER, 01),
                135.20
        );
        Veiculo veiculo3 = new Veiculo(
                "Focus",
                "Ford",
                LocalDate.of(2022, Month.SEPTEMBER, 01),
                LocalDate.of(2023, Month.SEPTEMBER, 01),
                399.90
        );

        veiculos.add(veiculo1);
        veiculos.add(veiculo2);
        veiculos.add(veiculo3);

        locacaoService.criarLocacao("1",pessoa,veiculos);
        locacaoService.criarLocacao("2",pessoa,veiculos);
        locacaoService.criarLocacao("3",pessoa,veiculos);

        System.out.println("TODAS AS LOCAÇÕES:");
        System.out.println(locacaoService.verTodas());
        System.out.println("DETALHES DA LOTAÇÃO DE CODIGO 2:");
        System.out.println(locacaoService.verDetalhesLocacao("2"));
        System.out.println(locacaoService.valorTotalLocacao("2"));

    }
}