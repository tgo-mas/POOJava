package model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev extends User {
	
	private Set<Bootcamp> btcInscritos;
	private Set<Bootcamp> btcConcluidos;
	private Set<Conteudo> contInscritos;
	private Set<Conteudo> contConluidos;
	
	public Dev(String username, String email, String passwd) {
		super(username, email, passwd);
		this.btcInscritos = new LinkedHashSet<>();
		this.btcConcluidos = new LinkedHashSet<>();
		this.contInscritos = new LinkedHashSet<>();
		this.contConluidos = new LinkedHashSet<>();
	}

	//// addBootcamp(btc) -> Inscreve o Dev no Bootcamp passado por par�metro.
	
	public void addBootcamp(Bootcamp btc) {
		
		if(!this.btcInscritos.add(btc)) {
			throw new Error("O Dev j� est� inscrito neste Bootcamp.");
		}
		
	}
	
	//// concluirCont(cont) -> Conclui um conte�do no qual o dev estava inscrito.
	
	public void concluirCont(Conteudo cont) {
		
		if(this.contInscritos.contains(cont)) {
			this.contInscritos.remove(cont);
			this.contConluidos.add(cont);
		}else {
			throw new Error("O Dev n�o est� inscrito neste bootcamp.");
		}
		
	}
	
	//// makeXpTotal() -> Calcula e retorna o xp total do Dev (Seus conte�dos conclu�dos)
	
	public double makeXpTotal() {
		double soma = 0;
		for(Conteudo cont:contConluidos) {
			soma += cont.makeXp();
		}
		return soma;
	}
	
	public Set<Bootcamp> getBtcInscritos() {
		return btcInscritos;
	}

	public void setBtcInscritos(Set<Bootcamp> btcInscritos) {
		this.btcInscritos = btcInscritos;
	}

	public Set<Bootcamp> getBtcConcluidos() {
		return btcConcluidos;
	}

	public void setBtcConcluidos(Set<Bootcamp> btcConcluidos) {
		this.btcConcluidos = btcConcluidos;
	}

	public Set<Conteudo> getContInscritos() {
		return contInscritos;
	}

	public void setContInscritos(Set<Conteudo> contInscritos) {
		this.contInscritos = contInscritos;
	}

	public Set<Conteudo> getContConluidos() {
		return contConluidos;
	}

	public void setContConluidos(Set<Conteudo> contConluidos) {
		this.contConluidos = contConluidos;
	}
	
}
