package br.com.carlosrodrigues.super_market.core.models.models_produtos;

import java.math.BigDecimal;

import br.com.carlosrodrigues.super_market.core.enums.Boleano;
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
public class PetShop extends Produto{
    
    @Id
    @ToString.Include
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "volume_ou_peso", nullable = false, precision = 10, scale = 2)
    private BigDecimal volumeOuPeso;

    @Column(name = "material", nullable = true)
    private String material;

    @Column(name = "porte_indicado", nullable = false)
    private String porteIndicado;

    @Column(name = "fragrancia_ou_sabor", nullable = true)
    private String fragranciaOuSabor;

    @Column(name = "durabilidade", nullable = true)
    private String durabilidade;

    @Column(name = "indicacoes_especificas", nullable = true)
    private String indicacoesEspecificas;

    @Column(name = "rendimento_aproximado", nullable = true, precision = 10, scale = 2)
    private BigDecimal rendimentoAproximado;

    @Column(name = "embalagem_reutilizavel", nullable = true)
    private Boleano embalagemReutilizavel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
