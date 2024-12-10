package br.com.carlosrodrigues.super_market.web.dtos.dtos_servicos;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class EnlatadosEconservasForm extends ProdutoForm{

    private String tipoConserva;

    private BigDecimal pesoLiquido;

    private BigDecimal pesoBruto;

    private BigDecimal volume;

    private BigDecimal salinidade;

    private String conservanteQuimico;

	public String getTipoConserva() {
		return tipoConserva;
	}

	public void setTipoConserva(String tipoConserva) {
		this.tipoConserva = tipoConserva;
	}

	public BigDecimal getPesoLiquido() {
		return pesoLiquido;
	}

	public void setPesoLiquido(BigDecimal pesoLiquido) {
		this.pesoLiquido = pesoLiquido;
	}

	public BigDecimal getPesoBruto() {
		return pesoBruto;
	}

	public void setPesoBruto(BigDecimal pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	public BigDecimal getSalinidade() {
		return salinidade;
	}

	public void setSalinidade(BigDecimal salinidade) {
		this.salinidade = salinidade;
	}

	public String getConservanteQuimico() {
		return conservanteQuimico;
	}

	public void setConservanteQuimico(String conservanteQuimico) {
		this.conservanteQuimico = conservanteQuimico;
	}
    
}