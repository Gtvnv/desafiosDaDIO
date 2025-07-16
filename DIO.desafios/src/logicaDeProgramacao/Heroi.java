package logicaDeProgramacao;

import java.util.Scanner;

public class Heroi {

	private String nome;
	private int level;
	
	public Heroi() {
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	 
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Heroi heroi = new Heroi();
		
		System.out.println("Qual é o nome do heroi?");
		heroi.setNome(entrada.nextLine()); 
		
		System.out.println("Qual é o level do heroi?");
		heroi.setLevel(entrada.nextInt()); 
		
		
		if(heroi.getLevel() <= 1000) {
			System.out.printf("O Héroi de nome " + heroi.nome + " está no nível de Ferro!");
		} else if (heroi.getLevel() <= 2000) {
			System.out.printf("O Héroi de nome " + heroi.nome + " está no nível de Bronze!");
		} else if (heroi.getLevel() <= 5000) {
			System.out.printf("O Héroi de nome " + heroi.nome + " está no nível de Prata!");
		} else if (heroi.getLevel() <= 7000) {
			System.out.printf("O Héroi de nome " + heroi.nome + " está no nível de Ouro!");
		} else if (heroi.getLevel() <= 8000) {
			System.out.printf("O Héroi de nome " + heroi.nome + " está no nível de Platina!");
		} else if (heroi.getLevel() <= 9000) {
			System.out.printf("O Héroi de nome " + heroi.nome + " está no nível de Ascendente!");
		} else if (heroi.getLevel() <= 10000) {
			System.out.printf("O Héroi de nome " + heroi.nome + " está no nível de Imortal!");
		} else if (heroi.getLevel() >= 10001){
			System.out.printf("O Héroi de nome " + heroi.nome + " está no nível de Radiante!");
		}
		
		entrada.close();
	}
}
