package br.com.carlosrodrigues.super_market.web.dtos.dtos_servicos;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class ProdutosDePanificacaoForm extends ProdutoForm{

    @NotEmpty
    private String frescor;

    @NotEmpty
    private String ingredientesPrincipais;

    @NotEmpty
    private String opcoesDieteticas;

    private LocalDate dataFabricacao;

    @PositiveOrZero
    @NotNull
    private Integer validade;

    @NotEmpty
    private String formaEmbalagem;

    @NotEmpty
    private String origemProduto;

    @PositiveOrZero
    @NotNull
    private BigDecimal teorAcucar;

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
