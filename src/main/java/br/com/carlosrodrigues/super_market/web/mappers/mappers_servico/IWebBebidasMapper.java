package br.com.carlosrodrigues.super_market.web.mappers.mappers_servico;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.carlosrodrigues.super_market.core.models.models_produtos.Bebidas;
import br.com.carlosrodrigues.super_market.web.dtos.dtos_servicos.BebidasForm;

@Mapper(componentModel = "spring")
public interface IWebBebidasMapper {

    @Mapping(target = "id", ignore = true)
    Bebidas toForm(BebidasForm form);

    BebidasForm toModel(Bebidas model);
    
}