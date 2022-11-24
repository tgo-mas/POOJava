package model;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
	
	private String nome;
	private String desc;
	private LocalDate dataInicio;
	private LocalDate dataFinal;
	private Set<Conteudo> conteudos;
	private Set<Dev> devsInscritos;
	
	public Bootcamp(String nome, String desc, LocalDate dataInicio, LocalDate dataFinal, Set<Conteudo> conteudos) {
		this.nome = nome;
		this.desc = desc;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.devsInscritos = new LinkedHashSet<>();
		this.conteudos = conteudos;
	}
	
	public double makeXp() {
		double soma = 0;
		for(Conteudo cont:conteudos) {
			soma += cont.makeXp();
		}
		return soma;
	}
	
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}

	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}

	@Override
	public String toString() {
		return "Bootcamp [Conteudos = " + conteudos + ", horas=" + makeXp() + "]";
	}
}
