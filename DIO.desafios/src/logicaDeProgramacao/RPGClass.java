package logicaDeProgramacao;

import java.util.Arrays;
import java.util.Scanner;

public class RPGClass {

	private String name;
	private int age;
	private  String hero;
	private String arsenalOfMovies;
	
	private static final String[] CLASSES_VALIDAS = {"Mago", "Guerreiro", "Monge", "Ninja"};
	
	public RPGClass() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
       
        String heroFormatado = formatarClasseHeroi(hero);

        if (Arrays.asList(CLASSES_VALIDAS).contains(heroFormatado)) {
            this.hero = heroFormatado;
        } else {
            System.out.println("Classe '" + hero + "' inválida. Definindo para 'Aventureiro(a)'.");
            this.hero = "Aventureiro(a)";
        }
    }
	private String formatarClasseHeroi(String heroInput) {
        if (heroInput == null || heroInput.trim().isEmpty()) {
            return "";
        }
        return heroInput.substring(0, 1).toUpperCase() + heroInput.substring(1).toLowerCase();
    }
	
	public String attack() {
        switch (this.hero) {
            case "Mago":
                arsenalOfMovies = "atacou usando magia!";
                break;
            case "Guerreiro":
                arsenalOfMovies = "atacou usando espada!";
                break;
            case "Monge":
                arsenalOfMovies = "atacou usando artes marciais!";
                break;
            case "Ninja":
                arsenalOfMovies = "atacou usando shuriken!";
                break;
            case "Aventureiro(a)": // Case para a classe padrão
                arsenalOfMovies = "fez um ataque básico.";
                break;
            default: // Caso para qualquer outra situação inesperada (muito improvável com a validação)
                arsenalOfMovies = " errou o ataque.";
                break;
        }
        return arsenalOfMovies;
    }

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		RPGClass player1 = new RPGClass();
		
		System.out.print("Qual o nome do seu personagem? ");
        player1.setName(input.nextLine());
        System.out.println();

        System.out.print("Qual a classe do seu personagem? (Mago, Guerreiro, Monge, Ninja) ");
        player1.setHero(input.nextLine());
        System.out.println();

        System.out.print("Qual a idade do seu personagem? ");
        player1.setAge(input.nextInt());
        System.out.println();

        System.out.print("O " + player1.getHero() + " " + player1.attack());

        input.close();
		
	}
	
	
}
