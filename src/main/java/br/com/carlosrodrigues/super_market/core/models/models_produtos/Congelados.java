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
public class Congelados extends Produto{
    
    @Id
    @ToString.Include
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_congelado", nullable = false)
    private String tipoCongelado;

    @Column(name = "peso_liquido", nullable = false, precision = 10, scale = 2)
    private BigDecimal pesoLiquido;

    @Column(name = "volume_embalagem", nullable = true, precision = 10, scale = 2)
    private BigDecimal volumeEmbalagem;

    @Column(name = "temperatura_minima", nullable = false)
    private String temperaturaMinima;

    @Column(name = "forma_descongelamento", nullable = true)
    private String formaDescongelamento;

    @Column(name = "vida_util_apos_descongelamento", nullable = true)
    private Integer vidaUtilAposDescongelamento;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Boleano preCozido;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
