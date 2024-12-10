package br.com.carlosrodrigues.super_market.web.dtos.dtos_servicos;

import java.math.BigDecimal;
import java.time.LocalDate;


import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoForm {
    
    @NotNull
    @NotEmpty
    private String categoriaProduto;

    @NotNull
    @NotEmpty
    private String produto;

    @NotNull
    @NotEmpty
    private BigDecimal precoProduto;

    @NotNull
    @NotEmpty
    private LocalDate dataValidade;

    @NotNull
    @NotEmpty
    private LocalDate dataProducao;

    @NotNull
    @NotEmpty
    private String marca;

	public String getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(String categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public BigDecimal getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(BigDecimal precoProduto) {
		this.precoProduto = precoProduto;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	public LocalDate getDataProducao() {
		return dataProducao;
	}

	public void setDataProducao(LocalDate dataProducao) {
		this.dataProducao = dataProducao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
