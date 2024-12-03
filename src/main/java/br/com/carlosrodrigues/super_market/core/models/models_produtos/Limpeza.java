package br.com.carlosrodrigues.super_market.core.models.models_produtos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@ToString(onlyExplicitlyIncluded = true)
public class Limpeza extends Produto{
    
    @Id
    @ToString.Include
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "eficacia_sujeira", nullable = true)
    private String eficaciaSujeira;

    @Column(name = "tipo_superficie", nullable = false)
    private String tipoSuperficie;

    @Column(name = "tempo_acao", nullable = true)
    private Integer tempoAcao;

    @Column(name = "diluição_recomendada", nullable = true)
    private String diluiçãoRecomendada;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
