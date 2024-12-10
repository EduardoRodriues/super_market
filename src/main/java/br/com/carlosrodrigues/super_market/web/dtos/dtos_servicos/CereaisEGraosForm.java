package br.com.carlosrodrigues.super_market.web.dtos.dtos_servicos;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.carlosrodrigues.super_market.core.enums.Boleano;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class CereaisEGraosForm extends ProdutoForm{
    
    @PositiveOrZero
    @NotNull
    private double pesoPorEmbalagem;

    @NotEmpty
    private String tipoProcessamento;

    @NotEmpty
    private String origem;

    private Boleano organico;

    private LocalDate dataColheita;
    
    private Boleano contémGluten;

    @PositiveOrZero
    @NotNull
    private BigDecimal precoPorKg;

    private String armazenamentoRecomendado;

	public double getPesoPorEmbalagem() {
		return pesoPorEmbalagem;
	}

	public void setPesoPorEmbalagem(double pesoPorEmbalagem) {
		this.pesoPorEmbalagem = pesoPorEmbalagem;
	}

	public String getTipoProcessamento() {
		return tipoProcessamento;
	}

	public void setTipoProcessamento(String tipoProcessamento) {
		this.tipoProcessamento = tipoProcessamento;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public Boleano getOrganico() {
		return organico;
	}

	public void setOrganico(Boleano organico) {
		this.organico = organico;
	}

	public LocalDate getDataColheita() {
		return dataColheita;
	}

	public void setDataColheita(LocalDate dataColheita) {
		this.dataColheita = dataColheita;
	}

	public Boleano getContémGluten() {
		return contémGluten;
	}

	public void setContémGluten(Boleano contémGluten) {
		this.contémGluten = contémGluten;
	}

	public BigDecimal getPrecoPorKg() {
		return precoPorKg;
	}

	public void setPrecoPorKg(BigDecimal precoPorKg) {
		this.precoPorKg = precoPorKg;
	}

	public String getArmazenamentoRecomendado() {
		return armazenamentoRecomendado;
	}

	public void setArmazenamentoRecomendado(String armazenamentoRecomendado) {
		this.armazenamentoRecomendado = armazenamentoRecomendado;
	}
}
