package br.com.carlosrodrigues.super_market.core.models.models_produtos;

import br.com.carlosrodrigues.super_market.core.enums.TeorAlcolico;
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
public class Bebidas extends Produto{
    
    @Id
    @ToString.Include
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "volume_ml", nullable = false)
    private Integer volumeMl;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TeorAlcolico teorAlcoolico;

    @Column(name = "sabor", nullable = false)
    private String sabor;

    @Column(name = "carbonatada", nullable = false)
    private String carbonatada;

    @Column(name = "tipo_embalagem", nullable = false)
    private String tipoEmbalagem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getVolumeMl() {
		return volumeMl;
	}

	public void setVolumeMl(Integer volumeMl) {
		this.volumeMl = volumeMl;
	}

	public TeorAlcolico getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcoolico(TeorAlcolico teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getCarbonatada() {
		return carbonatada;
	}

	public void setCarbonatada(String carbonatada) {
		this.carbonatada = carbonatada;
	}

	public String getTipoEmbalagem() {
		return tipoEmbalagem;
	}

	public void setTipoEmbalagem(String tipoEmbalagem) {
		this.tipoEmbalagem = tipoEmbalagem;
	}
}
