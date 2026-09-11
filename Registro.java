//questão 1

import java.util.Scanner;
class Registro {
    private String nome;
    private String idade;
    private String lugar;
    
    public Registro(String nome, String idade, String lugar) {
        this.nome = nome;
        this.idade = idade;
        this.lugar = lugar;
    }
}

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nome = s.nextLine();
		String idade = s.nextLine();
		String lugar = s.nextLine();
		
		System.out.println("Ola "+nome+"\nVoce tem "+idade+" ano(s) e mora em "+lugar);
	}
}
