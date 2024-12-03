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
public class HigienePessoal extends Produto{
    
    @Id
    @ToString.Include
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "volume_ou_peso", nullable = false, precision = 10, scale = 2)
    private BigDecimal volumeOuPeso;

    @Column(name = "fragrancia", nullable = true)
    private String fragrancia;

    @Column(name = "tipo_aplicacao", nullable = false)
    private String tipoAplicacao;

    @Column(name = "indicacao_uso", nullable = true)
    private String indicacaoUso;

    @Column(name = "hipoalergenico", nullable = false)
    @Enumerated(EnumType.STRING)
    private Boleano hipoalergenico;

    @Column(name = "dermatologicamente_testado", nullable = false)
    @Enumerated(EnumType.STRING)
    private Boleano dermatologicamenteTestado;

    @Column(name = "vegan_friendly", nullable = true)
    @Enumerated(EnumType.STRING)
    private Boleano veganFriendly;

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
