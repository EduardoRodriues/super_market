package br.com.carlosrodrigues.super_market.web.mappers.mappers_servico;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.carlosrodrigues.super_market.core.models.models_produtos.PetShop;
import br.com.carlosrodrigues.super_market.web.dtos.dtos_servicos.PetShopForm;

@Mapper(componentModel = "spring")
public interface IWebPetShopMapper {

    @Mapping(target = "id", ignore = true)
    PetShop toForm(PetShopForm form);

    PetShopForm toModel(PetShop model);
}