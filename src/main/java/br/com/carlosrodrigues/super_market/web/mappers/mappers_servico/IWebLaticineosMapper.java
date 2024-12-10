package br.com.carlosrodrigues.super_market.web.mappers.mappers_servico;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.carlosrodrigues.super_market.core.models.models_produtos.Laticineos;
import br.com.carlosrodrigues.super_market.web.dtos.dtos_servicos.LaticineosForm;

@Mapper(componentModel = "spring")
public interface IWebLaticineosMapper {

    @Mapping(target = "id", ignore = true)
    Laticineos toForm(LaticineosForm form);

    LaticineosForm toModel(Laticineos model);
}