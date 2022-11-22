package model;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate data;
	
	public Mentoria(String titulo, String desc, int horas, LocalDate data) {
		super(titulo, desc, horas);
		this.data = data;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}


	@Override
	public double makeXp() {
		return (this.getHoras() + 1) * DEFAULT_XP;
	}
	
	public String toString() {
		return "Mentoria {" + this.getTitulo() +
				", " + this.getDesc() +
				", " + this.getHoras() + "}";
	}
	
}
