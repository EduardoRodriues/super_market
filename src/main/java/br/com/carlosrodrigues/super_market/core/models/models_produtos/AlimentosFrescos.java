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
public class AlimentosFrescos extends Produto{

    @Id
    @ToString.Include
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "preco_por_unidade", nullable = false)
    private BigDecimal precoPorUnidade;

    @Column(name = "peso", nullable = false)
    private double peso;

    @Column(name = "origem", nullable = false)
    private String origem;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Boleano organico;

    @Column(name = "aroma", nullable = false)
    private String aroma;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Boleano higienizado;

    @Column(name = "nivel_frescor", nullable = false)
    private int nivelFrescor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getPrecoPorUnidade() {
		return precoPorUnidade;
	}

	public void setPrecoPorUnidade(BigDecimal precoPorUnidade) {
		this.precoPorUnidade = precoPorUnidade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public Boleano getOrganico() {
		return organico;
	}

	public void setOrganico(Boleano organico) {
		this.organico = organico;
	}

	public String getAroma() {
		return aroma;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	}

	public Boleano getHigienizado() {
		return higienizado;
	}

	public void setHigienizado(Boleano higienizado) {
		this.higienizado = higienizado;
	}

	public int getNivelFrescor() {
		return nivelFrescor;
	}

	public void setNivelFrescor(int nivelFrescor) {
		this.nivelFrescor = nivelFrescor;
	}
}
