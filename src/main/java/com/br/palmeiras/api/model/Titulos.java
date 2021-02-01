package com.br.palmeiras.api.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "titulos")
public class Titulos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "categoria")
	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	
	public enum Categoria {
        nacional,estadual,internacional,interestadual,nacionalSerieB};
	
	@Column(name = "ano")
	private int ano;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Titulos [id=" + id + ", titulo=" + titulo + ", categoria=" + categoria + ", ano=" + ano + "]";
	}

	
}
