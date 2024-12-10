package br.com.carlosrodrigues.super_market.web.mappers.mappers_servico;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.carlosrodrigues.super_market.core.models.models_produtos.AlimentosFrescos;
import br.com.carlosrodrigues.super_market.web.dtos.dtos_servicos.AlimentosFrescosForm;

@Mapper(componentModel = "spring")
public interface IWebAlimentosFrescosMapper {

    @Mapping(target = "id" , ignore = true)
    AlimentosFrescos toForm(AlimentosFrescosForm form);

    AlimentosFrescosForm toModel(AlimentosFrescos model);
}