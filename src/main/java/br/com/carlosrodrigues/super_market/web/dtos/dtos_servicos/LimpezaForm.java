package br.com.carlosrodrigues.super_market.web.dtos.dtos_servicos;

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
public class LimpezaForm extends ProdutoForm{
    
    @NotEmpty
    private String eficaciaSujeira;

    @NotEmpty
    private String tipoSuperficie;

    @PositiveOrZero
    @NotNull
    private Integer tempoAcao;

    @NotEmpty
    private String diluiçãoRecomendada;

	public String getEficaciaSujeira() {
		return eficaciaSujeira;
	}

	public void setEficaciaSujeira(String eficaciaSujeira) {
		this.eficaciaSujeira = eficaciaSujeira;
	}

	public String getTipoSuperficie() {
		return tipoSuperficie;
	}

	public void setTipoSuperficie(String tipoSuperficie) {
		this.tipoSuperficie = tipoSuperficie;
	}

	public Integer getTempoAcao() {
		return tempoAcao;
	}

	public void setTempoAcao(Integer tempoAcao) {
		this.tempoAcao = tempoAcao;
	}

	public String getDiluiçãoRecomendada() {
		return diluiçãoRecomendada;
	}

	public void setDiluiçãoRecomendada(String diluiçãoRecomendada) {
		this.diluiçãoRecomendada = diluiçãoRecomendada;
	}
}
