package br.com.myprojects.screenmatch.repository;

import br.com.myprojects.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}
