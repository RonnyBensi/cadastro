package br.com.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.cadastro.entity.CargoEntity; 

 
@Repository

public interface CargoRepository extends JpaRepository<CargoEntity, Long> {

}




