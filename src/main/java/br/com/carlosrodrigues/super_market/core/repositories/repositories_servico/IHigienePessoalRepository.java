package br.com.carlosrodrigues.super_market.core.repositories.repositories_servico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.carlosrodrigues.super_market.core.models.models_produtos.HigienePessoal;

@Repository
public interface IHigienePessoalRepository extends JpaRepository<HigienePessoal, Long>{
    
}
