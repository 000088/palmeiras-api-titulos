package com.br.palmeiras.api.controller;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.palmeiras.api.model.Titulos;
import com.br.palmeiras.api.model.Titulos.Categoria;
import com.br.palmeiras.api.service.TituloService;

@RestController
@Validated
@RequestMapping("/palmeiras")
public class TitulosController {
	
	@Autowired
	private TituloService tituloService;
	
	@RequestMapping("")
	public String index () {
		
		return "boolean palmeirasMaiorCampeaoDoBrasil=true;  :D";
	}
	
	@GetMapping("/listaTitulos")
	public List<Titulos> buscaTodosTitulos (){  
		
		 List<Titulos> titulos = tituloService.FindAllTitulos();  //retorta todos os titulos por ano(decrescente)
			return titulos;
	}
	
	@GetMapping("titulos/categoria/{categoria}")
	public List<Titulos> titulosPorCategoria(@PathVariable(value = "categoria")Categoria categoria) throws Exception{
		return tituloService.findAllTitulosCategoria(categoria);
		
		
	}
	
	@GetMapping("titulos/ano/{ano}")
	public List<Titulos> titulosPorAno(@PathVariable(value = "ano")@Min(1920) @Max(2021) int ano){
		return tituloService.findAllTitulosAno(ano);
	}
	
	@GetMapping("titulosVencidos/ate/{ano}")
	public List<Titulos> titulosVencidosAte(@PathVariable(value = "ano")@Min(1920) @Max(2021) int ano){
		
		return tituloService.findAllTitulosAte(ano);
	}
	
	@GetMapping("titulosVencidos/apartir/{ano}")
	public List<Titulos> titulosApos(@PathVariable(value = "ano")@Min(1920) @Max(2021) int ano){
		return tituloService.findAllTitulosApartir(ano);
	}
	
	@GetMapping("titulosVencidos/entre/{anoInicio}/{anoFim}")
	public List<Titulos> titulosEntre(@PathVariable(value = "anoInicio")@Min(1920) @Max(2021)int anoInicio,@PathVariable(value = "anoFim")@Min(1926) @Max(2021) int anoFim){
		
		return tituloService.findAllTitulosEntre(anoInicio, anoFim);
	}
	
	@GetMapping("qtdTitulos/categoria/{categoria}")
	public String qtdTitulosCategoria(@PathVariable(value = "categoria")Categoria categoria) {
		
		return tituloService.countByCategoria(categoria) +" título(s)";
	}

}
