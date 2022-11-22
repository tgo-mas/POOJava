package view;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Set;

import model.Bootcamp;
import model.Curso;
import model.Mentoria;

public class Main {
	public static void main(String[] args) {
		
		Curso poo = new Curso("POO", "Apredendo POO com Java!", 4);
		Curso ide = new Curso("IDE", "Conhecendo IDEs Java.", 2);
		
		Mentoria ment = new Mentoria("Mentoria Java", "Aprendendo boas práticas", 3, LocalDate.now());
		
		System.out.println(poo.toString());
		System.out.println(ide.toString());
		System.out.println(ment.toString());
		
	}
}
