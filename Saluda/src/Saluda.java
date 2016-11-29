import java.util.Scanner;

public class Saluda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		String nom;
		System.out.println("¿Como te llamas?");
		nom = entrada.next();
		System.out.println("Un saludo "+nom);
	}

}
