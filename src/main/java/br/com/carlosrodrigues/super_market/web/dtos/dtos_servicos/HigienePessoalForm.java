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
public class HigienePessoalForm extends ProdutoForm{

    @PositiveOrZero
    @NotNull
    private BigDecimal volumeOuPeso;

    @NotEmpty
    private String fragrancia;

    @NotEmpty
    private String tipoAplicacao;

    @NotEmpty
    private String indicacaoUso;

    private Boleano hipoalergenico;

    private Boleano dermatologicamenteTestado;

    private Boleano veganFriendly;

	public BigDecimal getVolumeOuPeso() {
		return volumeOuPeso;
	}

	public void setVolumeOuPeso(BigDecimal volumeOuPeso) {
		this.volumeOuPeso = volumeOuPeso;
	}

	public String getFragrancia() {
		return fragrancia;
	}

	public void setFragrancia(String fragrancia) {
		this.fragrancia = fragrancia;
	}

	public String getTipoAplicacao() {
		return tipoAplicacao;
	}

	public void setTipoAplicacao(String tipoAplicacao) {
		this.tipoAplicacao = tipoAplicacao;
	}

	public String getIndicacaoUso() {
		return indicacaoUso;
	}

	public void setIndicacaoUso(String indicacaoUso) {
		this.indicacaoUso = indicacaoUso;
	}

	public Boleano getHipoalergenico() {
		return hipoalergenico;
	}

	public void setHipoalergenico(Boleano hipoalergenico) {
		this.hipoalergenico = hipoalergenico;
	}

	public Boleano getDermatologicamenteTestado() {
		return dermatologicamenteTestado;
	}

	public void setDermatologicamenteTestado(Boleano dermatologicamenteTestado) {
		this.dermatologicamenteTestado = dermatologicamenteTestado;
	}

	public Boleano getVeganFriendly() {
		return veganFriendly;
	}

	public void setVeganFriendly(Boleano veganFriendly) {
		this.veganFriendly = veganFriendly;
	}
}
