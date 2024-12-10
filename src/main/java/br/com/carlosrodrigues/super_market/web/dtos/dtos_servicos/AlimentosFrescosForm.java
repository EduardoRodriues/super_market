package br.com.carlosrodrigues.super_market.web.dtos.dtos_servicos;

import java.math.BigDecimal;

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
public class AlimentosFrescosForm extends ProdutoForm{
    
    @PositiveOrZero
    @NotNull
    private BigDecimal precoPorUnidade;

    @PositiveOrZero
    @NotNull
    private BigDecimal peso;

    @NotEmpty
    private String origem;

    private Boleano organico;

    @NotEmpty
    private String aroma;

    private Boleano higienizado;

    @PositiveOrZero
    @NotNull
    private int nivelFrescor;

	public BigDecimal getPrecoPorUnidade() {
		return precoPorUnidade;
	}

	public void setPrecoPorUnidade(BigDecimal precoPorUnidade) {
		this.precoPorUnidade = precoPorUnidade;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
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

	public String getAroma() {
		return aroma;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	}

	public Boleano getHigienizado() {
		return higienizado;
	}

	public void setHigienizado(Boleano higienizado) {
		this.higienizado = higienizado;
	}

	public int getNivelFrescor() {
		return nivelFrescor;
	}

	public void setNivelFrescor(int nivelFrescor) {
		this.nivelFrescor = nivelFrescor;
	}
}
