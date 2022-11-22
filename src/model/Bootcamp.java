package model;

import java.util.Set;

public class Bootcamp {
	
	private Set<Curso> cursos;
	private Set<Mentoria> mentorias;
	private int horas;
	
	public Bootcamp(Set<Curso> cursos, Set<Mentoria> mentorias, int horas) {
		this.cursos = cursos;
		this.mentorias = mentorias;
		this.horas = horas;
	}

	public Set<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}

	public Set<Mentoria> getMentorias() {
		return mentorias;
	}

	public void setMentorias(Set<Mentoria> mentorias) {
		this.mentorias = mentorias;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
}
