package model;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Dev dev = new Dev("João", "joao@gmail.com", "joao123");
		Dev dev2 = new Dev("Maria", "maria@email.com", "maira123");
		
		Conteudo ment = new Mentoria("IDE Java", "Conhecendo ides java", 2, LocalDate.now());
		Conteudo curso = new Curso("Collections", "Trabalhando com Coleções em Java", 4);
		Conteudo curso2 = new Curso("Estruturas", "Trabalhando com Estruturas de Dados", 6);
		
		Set<Conteudo> conts = new LinkedHashSet();
		conts.add(ment);
		conts.add(curso);
		conts.add(curso2);
		
		Bootcamp btc = new Bootcamp("Developer Java", "Apredendo as bases da linguagem Java", LocalDate.now(), LocalDate.now(), conts);
		
		dev.addBootcamp(btc);
		dev2.addBootcamp(btc);
		
		dev.concluirCont(ment);
		
		System.out.println("Cont. inscritos João: " + dev.getContInscritos());
		System.out.println("Cont. Concluídos João: " + dev.getContConluidos());
		System.out.println("Cont. inscritos Maria: " + dev2.getContInscritos());
		System.out.println("Cont. concluídos Maria " + dev2.getContConluidos());
		
		System.out.println("Devs inscritos no bootcamp " + btc.getNome() + ": " + btc.getDevsInscritos());
		
	}
	
}
