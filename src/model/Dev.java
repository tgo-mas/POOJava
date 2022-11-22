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
		}else {
			contInscritos.addAll(btc.getConteudos());
		}
		
	}
	
	//// concluirCont(cont) -> Conclui um conte�do no qual o dev estava inscrito.
	
	public void concluirCont(Conteudo cont) {
		
		if(this.contInscritos.contains(cont)) {
			this.contInscritos.remove(cont);
			this.contConluidos.add(cont);
			verificarBtcs();
		}else {
			throw new Error("O Dev n�o est� inscrito neste bootcamp.");
		}
		
	}
	
	//// verificarBtcs() -> Verifica na lista de Bootcamps se h� algum conclu�do e atualiza a lista.
	
	private void verificarBtcs() {
		int i = 0, size = btcInscritos.size();
		for(Bootcamp btc:btcInscritos) {
			for(Conteudo cont:btc.getConteudos()) {
				if(contConluidos.contains(cont)) {
					i++;
				}
			}
			if(i == size) {
				btcInscritos.remove(btc);
				btcConcluidos.add(btc);
			}
		}
	}
	
	//// makeXpTotal() -> Calcula e retorna o xp total do Dev (Seus conte�dos conclu�dos)
	
	public double makeXpTotal() {
		return this.contConluidos.stream()
				.mapToDouble(Conteudo::makeXp)
				.sum();
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
