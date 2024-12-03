package br.com.carlosrodrigues.super_market.core.models.models_produtos;

import java.math.BigDecimal;

import br.com.carlosrodrigues.super_market.core.enums.Boleano;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class Laticineos extends Produto{
    
    @Id
    @ToString.Include
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "teor_gordura", nullable = false, precision = 5, scale = 2)
    private BigDecimal teorGordura;

    @Column(name = "origem_leite", nullable = false)
    private String origemLeite;

    @Column(name = "volume_ou_peso", nullable = false, precision = 10, scale = 2)
    private BigDecimal volumeOuPeso;

    @Column(name = "tipo_processamento", nullable = false)
    private String tipoProcessamento;

    @Column(name = "adicao_conservantes", nullable = false)
    @Enumerated(EnumType.STRING)
    private Boleano adicaoConservantes;

    @Column(name = "validade_refrigerada", nullable = false)
    private Integer validadeRefrigerada;

    @Column(name = "teor_lactose", nullable = false)
    private String teorLactose;

    @Column(name = "fortificado_com_nutrientes", nullable = true)
    private String fortificadoComNutrientes;

    @Column(name = "origem_geografica", nullable = true)
    private String origemGeografica;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
