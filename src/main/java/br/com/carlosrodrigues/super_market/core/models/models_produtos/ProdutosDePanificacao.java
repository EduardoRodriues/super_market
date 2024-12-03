package br.com.carlosrodrigues.super_market.core.models.models_produtos;

import java.math.BigDecimal;
import java.time.LocalDate;

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
public class ProdutosDePanificacao extends Produto{
    
    @Id
    @ToString.Include
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "frescor", nullable = true)
    private String frescor;

    @Column(name = "ingredientes_principais", nullable = false)
    private String ingredientesPrincipais;

    @Column(name = "opcoes_dieteticas", nullable = true)
    private String opcoesDieteticas;

    @Column(name = "data_fabricacao", nullable = false)
    private LocalDate dataFabricacao;

    @Column(name = "validade", nullable = false)
    private Integer validade; // em dias

    @Column(name = "forma_embalagem", nullable = true)
    private String formaEmbalagem;

    @Column(name = "origem_produto", nullable = true)
    private String origemProduto;

    @Column(name = "teor_acucar", nullable = true, precision = 5, scale = 2)
    private BigDecimal teorAcucar;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrescor() {
		return frescor;
	}

	public void setFrescor(String frescor) {
		this.frescor = frescor;
	}

	public String getIngredientesPrincipais() {
		return ingredientesPrincipais;
	}

	public void setIngredientesPrincipais(String ingredientesPrincipais) {
		this.ingredientesPrincipais = ingredientesPrincipais;
	}

	public String getOpcoesDieteticas() {
		return opcoesDieteticas;
	}

	public void setOpcoesDieteticas(String opcoesDieteticas) {
		this.opcoesDieteticas = opcoesDieteticas;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public Integer getValidade() {
		return validade;
	}

	public void setValidade(Integer validade) {
		this.validade = validade;
	}

	public String getFormaEmbalagem() {
		return formaEmbalagem;
	}

	public void setFormaEmbalagem(String formaEmbalagem) {
		this.formaEmbalagem = formaEmbalagem;
	}

	public String getOrigemProduto() {
		return origemProduto;
	}

	public void setOrigemProduto(String origemProduto) {
		this.origemProduto = origemProduto;
	}

	public BigDecimal getTeorAcucar() {
		return teorAcucar;
	}

	public void setTeorAcucar(BigDecimal teorAcucar) {
		this.teorAcucar = teorAcucar;
	}
}
