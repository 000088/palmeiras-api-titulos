package com.br.palmeiras.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.palmeiras.api.model.Titulos;
import com.br.palmeiras.api.model.Titulos.Categoria;
import com.br.palmeiras.api.repository.TituloRepository;

@Service
public class TituloService {
	
	
	@Autowired
	private TituloRepository tituloRepository;
	
	public List<Titulos>  FindAllTitulos () {
		
		return  tituloRepository.findByOrderByAnoDesc();
		
	}
	
	public List<Titulos>findAllTitulosNome (String titulo){
		return tituloRepository.findByTitulo(titulo);
	}
	
	public List<Titulos>  findAllTitulosCategoria(Categoria categoria) {
		 
				return tituloRepository.findByCategoriaOrderByAnoDesc(categoria);
	}
		
	public long countByCategoria(Categoria categoria) {
		
		return tituloRepository.countByCategoria(categoria);
		
	}
			
	
	
		

	
         
	
	public List<Titulos> findAllTitulosAno(int ano){
		
		return tituloRepository.findByAno(ano);
	}
	
	public List<Titulos> findAllTitulosAte(int ano){
		return tituloRepository.findByAnoLessThanEqualOrderByAno(ano);
	}
	
	public List<Titulos> findAllTitulosApartir(int ano){
		
		return tituloRepository.findByAnoGreaterThanEqualOrderByAno(ano);
	}
	
	public List<Titulos> findAllTitulosEntre(int anoInicio, int anoFim){
		
		return tituloRepository.findByAnoBetweenOrderByAnoAsc(anoInicio, anoFim);
	}

}
