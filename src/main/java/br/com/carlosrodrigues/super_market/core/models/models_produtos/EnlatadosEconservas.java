package br.com.carlosrodrigues.super_market.core.models.models_produtos;

import java.math.BigDecimal;

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
public class EnlatadosEconservas extends Produto{
    
    @Id
    @ToString.Include
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_conserva", nullable = false)
    private String tipoConserva;

    @Column(name = "peso_liquido", nullable = false, precision = 10, scale = 2)
    private BigDecimal pesoLiquido;

    @Column(name = "peso_bruto", nullable = true, precision = 10, scale = 2)
    private BigDecimal pesoBruto;

    @Column(name = "volume", nullable = true, precision = 10, scale = 2)
    private BigDecimal volume;

    @Column(name = "salinidade", nullable = true, precision = 5, scale = 2)
    private BigDecimal salinidade;

    @Column(name = "conservante_quimico", nullable = true)
    private String conservanteQuimico;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoConserva() {
		return tipoConserva;
	}

	public void setTipoConserva(String tipoConserva) {
		this.tipoConserva = tipoConserva;
	}

	public BigDecimal getPesoLiquido() {
		return pesoLiquido;
	}

	public void setPesoLiquido(BigDecimal pesoLiquido) {
		this.pesoLiquido = pesoLiquido;
	}

	public BigDecimal getPesoBruto() {
		return pesoBruto;
	}

	public void setPesoBruto(BigDecimal pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	public BigDecimal getSalinidade() {
		return salinidade;
	}

	public void setSalinidade(BigDecimal salinidade) {
		this.salinidade = salinidade;
	}

	public String getConservanteQuimico() {
		return conservanteQuimico;
	}

	public void setConservanteQuimico(String conservanteQuimico) {
		this.conservanteQuimico = conservanteQuimico;
	}
}
