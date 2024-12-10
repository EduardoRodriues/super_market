package br.com.carlosrodrigues.super_market.web.mappers.mappers_servico;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.carlosrodrigues.super_market.core.models.models_produtos.ProdutosDePanificacao;
import br.com.carlosrodrigues.super_market.web.dtos.dtos_servicos.ProdutosDePanificacaoForm;

@Mapper(componentModel = "spring")
public interface IWebProdutosDePanificacaoMapper {

    @Mapping(target = "id", ignore = true)
    ProdutosDePanificacao toForm(ProdutosDePanificacaoForm form);

    ProdutosDePanificacaoForm toModel(ProdutosDePanificacao model);
}