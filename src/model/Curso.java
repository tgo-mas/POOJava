package model;

public class Curso extends Conteudo {
	
	public Curso(String titulo, String desc, int horas) {
		super(titulo, desc, horas);
	}

	@Override
	public double makeXp() {
		return this.getHoras() * DEFAULT_XP;
	}

	@Override
	public String toString() {
		return "Curso {" + this.getTitulo() +
				", " + this.getDesc() +
				", " + this.getHoras() + "}";
	}
	
}
