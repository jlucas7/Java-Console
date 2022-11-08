package entidade;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Veiculo {
    private String modelo;
    private String fabricante;
    private LocalDate anoFabricacao;
    private LocalDate anoModelo;
    private Double valorLocacao;

    public Veiculo(String modelo, String fabricante, LocalDate anoFabricacao, LocalDate anoModelo, Double valorLocacao) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.valorLocacao = valorLocacao;
    }

    public Veiculo() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public LocalDate getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(LocalDate anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public LocalDate getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(LocalDate anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(Double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    @Override
    public String toString() {
        DateTimeFormatter ano = DateTimeFormatter.ofPattern("yyyy");

        return fabricante + " " + modelo + ", " + anoFabricacao.format(ano) + "/" + anoModelo.format(ano) + " - " + "R$ " + valorLocacao + "\n";
    }
}
