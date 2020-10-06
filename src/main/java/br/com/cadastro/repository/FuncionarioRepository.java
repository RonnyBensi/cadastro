package br.com.cadastro.repository;

import br.com.cadastro.entity.FuncionarioEntity;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends CrudRepository<FuncionarioEntity, Long> {
}
 