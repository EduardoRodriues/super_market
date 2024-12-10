package br.com.carlosrodrigues.super_market.web.mappers.mappers_servico;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.carlosrodrigues.super_market.core.models.models_produtos.HigienePessoal;
import br.com.carlosrodrigues.super_market.web.dtos.dtos_servicos.HigienePessoalForm;

@Mapper(componentModel = "spring")
public interface IWebHigienePessoalMapper {

    @Mapping(target = "id", ignore = true)
    HigienePessoal toForm(HigienePessoalForm form);

    HigienePessoalForm toModel(HigienePessoal model);
}
