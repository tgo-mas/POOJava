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
	
}
