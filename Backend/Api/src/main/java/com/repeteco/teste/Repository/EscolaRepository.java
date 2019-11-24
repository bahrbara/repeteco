package com.repeteco.teste.Repository;


import com.repeteco.teste.Model.Anuncio;
import com.repeteco.teste.Model.Escola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EscolaRepository extends JpaRepository<Escola, Integer> {
    List<Escola> findByNeighborhood(String neighborhood);
}