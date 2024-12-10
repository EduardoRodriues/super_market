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
public class CongeladosForm extends ProdutoForm{
    
    @NotEmpty
    private String tipoCongelado;

    @PositiveOrZero
    @NotNull
    private BigDecimal pesoLiquido;

    @PositiveOrZero
    @NotNull
    private BigDecimal volumeEmbalagem;

    @NotEmpty
    private String temperaturaMinima;

    @NotEmpty
    private String formaDescongelamento;

    @PositiveOrZero
    private Integer vidaUtilAposDescongelamento;

    private Boleano preCozido;

	public String getTipoCongelado() {
		return tipoCongelado;
	}

	public void setTipoCongelado(String tipoCongelado) {
		this.tipoCongelado = tipoCongelado;
	}

	public BigDecimal getPesoLiquido() {
		return pesoLiquido;
	}

	public void setPesoLiquido(BigDecimal pesoLiquido) {
		this.pesoLiquido = pesoLiquido;
	}

	public BigDecimal getVolumeEmbalagem() {
		return volumeEmbalagem;
	}

	public void setVolumeEmbalagem(BigDecimal volumeEmbalagem) {
		this.volumeEmbalagem = volumeEmbalagem;
	}

	public String getTemperaturaMinima() {
		return temperaturaMinima;
	}

	public void setTemperaturaMinima(String temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}

	public String getFormaDescongelamento() {
		return formaDescongelamento;
	}

	public void setFormaDescongelamento(String formaDescongelamento) {
		this.formaDescongelamento = formaDescongelamento;
	}

	public Integer getVidaUtilAposDescongelamento() {
		return vidaUtilAposDescongelamento;
	}

	public void setVidaUtilAposDescongelamento(Integer vidaUtilAposDescongelamento) {
		this.vidaUtilAposDescongelamento = vidaUtilAposDescongelamento;
	}

	public Boleano getPreCozido() {
		return preCozido;
	}

	public void setPreCozido(Boleano preCozido) {
		this.preCozido = preCozido;
	}
}
