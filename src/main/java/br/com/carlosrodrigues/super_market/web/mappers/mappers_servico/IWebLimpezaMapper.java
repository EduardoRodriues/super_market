package br.com.carlosrodrigues.super_market.web.mappers.mappers_servico;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.carlosrodrigues.super_market.core.models.models_produtos.Limpeza;
import br.com.carlosrodrigues.super_market.web.dtos.dtos_servicos.LimpezaForm;

@Mapper(componentModel = "spring")
public interface IWebLimpezaMapper {

    @Mapping(target = "id", ignore = true)
    Limpeza toForm(LimpezaForm form);

    LimpezaForm toModel(Limpeza model);
}