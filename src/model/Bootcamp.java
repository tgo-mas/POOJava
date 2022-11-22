package model;

import java.time.LocalDate;
import java.util.Set;

public class Bootcamp {
	
	private String nome;
	private String desc;
	private LocalDate dataInicio;
	private LocalDate dataFinal;
	private Set<Conteudo> conteudos;
	private Set<Dev> devsInscritos;
	
	public Bootcamp(Set<Conteudo> conteudos, int horas) {
		this.conteudos = conteudos;
	}
	
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}

	public double makeXp() {
		double soma = 0;
		for(Conteudo cont:conteudos) {
			soma += cont.makeXp();
		}
		return soma;
	}

	@Override
	public String toString() {
		return "Bootcamp [Conteudos = " + conteudos + ", horas=" + makeXp() + "]";
	}
}
