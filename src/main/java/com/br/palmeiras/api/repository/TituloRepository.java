package com.br.palmeiras.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.palmeiras.api.model.Titulos;
import com.br.palmeiras.api.model.Titulos.Categoria;

@Repository
public interface TituloRepository extends JpaRepository<Titulos, Long>  {

	List<Titulos> findByOrderByAnoDesc(); //todos os titulos ordenados por ano
	
	List<Titulos> findByTitulo(String titulo); //todos os titulos por nome
	
	List<Titulos> findByCategoriaOrderByAnoDesc(Categoria categoria); //todos os titulos por categoria, ordenados por ano decrescentemente
	
	List<Titulos> findByAno(int ano); // todos os titulos por ano
	
	List<Titulos> findByAnoLessThanEqualOrderByAno(int ano); //todos os titulos até o ano escolhido, ordenado por ano
	
	List<Titulos> findByAnoGreaterThanEqualOrderByAno(int ano); //todos os titulos após o ano escolhido, ordenado por ano
	
	List<Titulos> findByAnoBetweenOrderByAnoAsc(int anoIncio, int anoFim); // todos os titulos entre os anos escolhidos, ordenado por ano crescentemente
	
	long countByCategoria(Categoria categoria); //quantidade de títulos por categoria
}
