package br.com.carlosrodrigues.super_market.web.dtos.dtos_servicos;

import br.com.carlosrodrigues.super_market.core.enums.TeorAlcolico;
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
public class BebidasForm extends ProdutoForm{
    
    @NotEmpty
    private String tipo;

    @PositiveOrZero
    @NotNull
    private Integer volumeMl;

    private TeorAlcolico teorAlcoolico;

    @NotEmpty
    private String sabor;

    @NotEmpty
    private String carbonatada;

    @NotEmpty
    private String tipoEmbalagem;

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
