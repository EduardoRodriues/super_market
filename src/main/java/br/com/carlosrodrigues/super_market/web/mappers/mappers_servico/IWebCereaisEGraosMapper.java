package br.com.carlosrodrigues.super_market.web.mappers.mappers_servico;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.carlosrodrigues.super_market.core.models.models_produtos.CereaisEGraos;
import br.com.carlosrodrigues.super_market.web.dtos.dtos_servicos.CereaisEGraosForm;

@Mapper(componentModel = "spring")
public interface IWebCereaisEGraosMapper {

    @Mapping(target = "id", ignore = true)
    CereaisEGraos toForm(CereaisEGraosForm form);

    CereaisEGraosForm toModel(CereaisEGraos model);
}