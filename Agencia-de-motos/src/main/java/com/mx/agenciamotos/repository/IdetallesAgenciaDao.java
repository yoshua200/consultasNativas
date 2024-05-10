package com.mx.agenciamotos.repository;

import com.mx.agenciamotos.Model.detallesAgencias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdetallesAgenciaDao extends JpaRepository<detallesAgencias, Integer> {

    @Query(value= "SELECT * FROM INNER JOIN MOTOS_DEPORTIVAS ON MOTOS_DEPORTIVAS.N_SERIE = AGENCIAS.FK_NSERIE", nativeQuery = true)
    public List<detallesAgencias> getMotosConAgencias();
}
