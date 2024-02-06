package aula2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Cachoroooo cachorro = new Cachoroooo();
		
		System.out.print("Digite o Nome: ");
        cachorro.setNome(sc.nextLine());
		
		cachorro.getNome();
	}

}
