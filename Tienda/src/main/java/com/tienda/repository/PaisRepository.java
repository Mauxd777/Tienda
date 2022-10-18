
package com.tienda.repository;

import com.tienda.entity.Pais;
import com.tienda.repository.PaisRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends CrudRepository<Pais,Long>{
    
}
