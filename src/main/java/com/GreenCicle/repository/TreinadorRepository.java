package com.GreenCicle.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.GreenCicle.model.Treinador;
import com.GreenCicle.model.Usuario;

public interface TreinadorRepository extends CrudRepository<Treinador,String> {
    @Query(value="SELECT * FROM treinador c WHERE c.id=?", nativeQuery = true)
    Treinador findById(Long id);
    
    @Query(value="SELECT * FROM treinador c WHERE c.cref=?", nativeQuery = true)
    Treinador findByCref(String cref);
}
