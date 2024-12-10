package br.com.carlosrodrigues.super_market.web.mappers.mappers_servico;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.carlosrodrigues.super_market.core.models.models_produtos.Congelados;
import br.com.carlosrodrigues.super_market.web.dtos.dtos_servicos.CongeladosForm;

@Mapper(componentModel = "spring")
public interface IwebCongeladosMapper {

    @Mapping(target = "id", ignore = true)
    Congelados toForm(CongeladosForm form);

    CongeladosForm toModel(Congelados model);
}