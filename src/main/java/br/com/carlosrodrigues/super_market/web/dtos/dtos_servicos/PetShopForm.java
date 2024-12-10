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
public class PetShopForm extends ProdutoForm{
    
    @PositiveOrZero
    @NotNull
    private BigDecimal volumeOuPeso;

    @NotEmpty
    private String material;

    @NotEmpty
    private String porteIndicado;

    @NotEmpty
    private String fragranciaOuSabor;

    @NotEmpty
    private String durabilidade;

    @NotEmpty
    private String indicacoesEspecificas;

    @PositiveOrZero
    @NotNull
    private BigDecimal rendimentoAproximado;

    private Boleano embalagemReutilizavel;

	public BigDecimal getVolumeOuPeso() {
		return volumeOuPeso;
	}

	public void setVolumeOuPeso(BigDecimal volumeOuPeso) {
		this.volumeOuPeso = volumeOuPeso;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getPorteIndicado() {
		return porteIndicado;
	}

	public void setPorteIndicado(String porteIndicado) {
		this.porteIndicado = porteIndicado;
	}

	public String getFragranciaOuSabor() {
		return fragranciaOuSabor;
	}

	public void setFragranciaOuSabor(String fragranciaOuSabor) {
		this.fragranciaOuSabor = fragranciaOuSabor;
	}

	public String getDurabilidade() {
		return durabilidade;
	}

	public void setDurabilidade(String durabilidade) {
		this.durabilidade = durabilidade;
	}

	public String getIndicacoesEspecificas() {
		return indicacoesEspecificas;
	}

	public void setIndicacoesEspecificas(String indicacoesEspecificas) {
		this.indicacoesEspecificas = indicacoesEspecificas;
	}

	public BigDecimal getRendimentoAproximado() {
		return rendimentoAproximado;
	}

	public void setRendimentoAproximado(BigDecimal rendimentoAproximado) {
		this.rendimentoAproximado = rendimentoAproximado;
	}

	public Boleano getEmbalagemReutilizavel() {
		return embalagemReutilizavel;
	}

	public void setEmbalagemReutilizavel(Boleano embalagemReutilizavel) {
		this.embalagemReutilizavel = embalagemReutilizavel;
	}
}
