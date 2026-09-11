//questão 1

import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nome = s.nextLine();
		String idade = s.nextLine();
		String lugar = s.nextLine();
		
		System.out.println("Ola "+nome+"\nVoce tem "+idade+" ano(s) e mora em "+lugar);
	}
}
