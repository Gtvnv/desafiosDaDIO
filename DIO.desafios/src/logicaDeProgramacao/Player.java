package logicaDeProgramacao;

import java.util.Scanner;

public class Player {

	private String rank;
	private String name;
	private int wins;
	private int deafeats;
	
	
	public Player() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getDeafeats() {
		return deafeats;
	}
	public void setDeafeats(int deafeats) {
		this.deafeats = deafeats;
	}
	
	public String calcularRankOfSeason() {
		
		Integer resultado = (wins - deafeats);
		if(resultado <= 10) {
			 this.rank = "Ferro";
			
		}else if(resultado <= 20) {
			this.rank = "Bronze";
			
		}else if(resultado <= 50) {
			this.rank = "Prata";
			
		}else if(resultado <= 80) {
			this.rank = "Ouro";
			
		}else if(resultado <= 90) {
			this.rank = "Diamante";
			
		}else if(resultado <= 100) {
			this.rank = "Lendário";
			
		}else if(resultado >= 101) {
			this.rank = "Imortal";
		}
		
		return rank;
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Player p1 = new Player();
		
		System.out.print("Qual o nome do player? ");
		p1.setName(input.nextLine());
		System.out.println();
		
		System.out.print("Qual o número de vítorias do player?");
		p1.setWins(input.nextInt());
		System.out.println();
		
		System.out.print("Qual o número de derrotas do player?");
		p1.setDeafeats(input.nextInt());
		System.out.println();
		
		p1.calcularRankOfSeason();
		
		System.out.println("O player: " + p1.name 
				+ " tem o saldo de vítorias: " + p1.wins 
				+ " e está no rank da temporada: " + p1.rank);
		
		input.close();
	}
}
