package br.com.carlosrodrigues.super_market.web.mappers.mappers_servico;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.carlosrodrigues.super_market.core.models.models_produtos.EnlatadosEconservas;
import br.com.carlosrodrigues.super_market.web.dtos.dtos_servicos.EnlatadosEconservasForm;

@Mapper(componentModel = "spring")
public interface IWebEnlatadosEconservasMapper {

    @Mapping(target = "id", ignore = true)
    EnlatadosEconservas toForm(EnlatadosEconservasForm form);

    EnlatadosEconservasForm toModel(EnlatadosEconservas toModel);
}