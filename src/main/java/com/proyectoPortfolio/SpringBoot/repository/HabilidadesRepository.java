
package com.proyectoPortfolio.SpringBoot.repository;

import com.proyectoPortfolio.SpringBoot.model.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesRepository extends JpaRepository <Habilidades, Long>{
    
}
