package model;

public class Conteudo {
	
	private String titulo;
	private String desc;
	private int horas;
	
	public Conteudo(String titulo, String desc, int horas) {
		this.titulo = titulo;
		this.desc = desc;
		this.horas = horas;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public int getHoras() {
		return horas;
	}
	
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
}
