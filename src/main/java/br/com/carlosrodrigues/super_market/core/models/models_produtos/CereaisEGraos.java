package br.com.carlosrodrigues.super_market.core.models.models_produtos;

import java.math.BigDecimal;
import java.time.LocalDate;
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
public class CereaisEGraos  extends Produto{
    
    @Id
    @ToString.Include
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "peso_por_embalagem", nullable = false)
    private double pesoPorEmbalagem;

    @Column(name = "tipo_processamento", nullable = false)
    private String tipoProcessamento;

    @Column(nullable = false)
    private String origem;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Boleano organico;

    @Column(name = "data_colheita", nullable = true)
    private LocalDate dataColheita;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Boleano contémGluten;

    @Column(name = "preco_por_kg", nullable = false)
    private BigDecimal precoPorKg;

    @Column(name = "armazenamento_recomendado", nullable = true)
    private String armazenamentoRecomendado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getPesoPorEmbalagem() {
		return pesoPorEmbalagem;
	}

	public void setPesoPorEmbalagem(double pesoPorEmbalagem) {
		this.pesoPorEmbalagem = pesoPorEmbalagem;
	}

	public String getTipoProcessamento() {
		return tipoProcessamento;
	}

	public void setTipoProcessamento(String tipoProcessamento) {
		this.tipoProcessamento = tipoProcessamento;
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

	public LocalDate getDataColheita() {
		return dataColheita;
	}

	public void setDataColheita(LocalDate dataColheita) {
		this.dataColheita = dataColheita;
	}

	public Boleano getContémGluten() {
		return contémGluten;
	}

	public void setContémGluten(Boleano contémGluten) {
		this.contémGluten = contémGluten;
	}

	public BigDecimal getPrecoPorKg() {
		return precoPorKg;
	}

	public void setPrecoPorKg(BigDecimal precoPorKg) {
		this.precoPorKg = precoPorKg;
	}

	public String getArmazenamentoRecomendado() {
		return armazenamentoRecomendado;
	}

	public void setArmazenamentoRecomendado(String armazenamentoRecomendado) {
		this.armazenamentoRecomendado = armazenamentoRecomendado;
	}
}
