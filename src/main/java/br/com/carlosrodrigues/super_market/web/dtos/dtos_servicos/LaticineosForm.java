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
public class LaticineosForm extends ProdutoForm{
    
    @NotNull
    @PositiveOrZero
    private BigDecimal teorGordura;

    @NotEmpty
    private String origemLeite;

    @NotNull
    @PositiveOrZero
    private BigDecimal volumeOuPeso;

    @NotEmpty
    private String tipoProcessamento;

    private Boleano adicaoConservantes;

    @NotNull
    @PositiveOrZero
    private Integer validadeRefrigerada;

    @NotEmpty
    private String teorLactose;

    @NotEmpty
    private String fortificadoComNutrientes;

    @NotEmpty
    private String origemGeografica;

	public BigDecimal getTeorGordura() {
		return teorGordura;
	}

	public void setTeorGordura(BigDecimal teorGordura) {
		this.teorGordura = teorGordura;
	}

	public String getOrigemLeite() {
		return origemLeite;
	}

	public void setOrigemLeite(String origemLeite) {
		this.origemLeite = origemLeite;
	}

	public BigDecimal getVolumeOuPeso() {
		return volumeOuPeso;
	}

	public void setVolumeOuPeso(BigDecimal volumeOuPeso) {
		this.volumeOuPeso = volumeOuPeso;
	}

	public String getTipoProcessamento() {
		return tipoProcessamento;
	}

	public void setTipoProcessamento(String tipoProcessamento) {
		this.tipoProcessamento = tipoProcessamento;
	}

	public Boleano getAdicaoConservantes() {
		return adicaoConservantes;
	}

	public void setAdicaoConservantes(Boleano adicaoConservantes) {
		this.adicaoConservantes = adicaoConservantes;
	}

	public Integer getValidadeRefrigerada() {
		return validadeRefrigerada;
	}

	public void setValidadeRefrigerada(Integer validadeRefrigerada) {
		this.validadeRefrigerada = validadeRefrigerada;
	}

	public String getTeorLactose() {
		return teorLactose;
	}

	public void setTeorLactose(String teorLactose) {
		this.teorLactose = teorLactose;
	}

	public String getFortificadoComNutrientes() {
		return fortificadoComNutrientes;
	}

	public void setFortificadoComNutrientes(String fortificadoComNutrientes) {
		this.fortificadoComNutrientes = fortificadoComNutrientes;
	}

	public String getOrigemGeografica() {
		return origemGeografica;
	}

	public void setOrigemGeografica(String origemGeografica) {
		this.origemGeografica = origemGeografica;
	}
}
