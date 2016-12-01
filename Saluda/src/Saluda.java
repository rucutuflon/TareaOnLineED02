import java.util.Scanner;

public class Saluda {

	private static String _nombre;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("¿Como te llamas?");
		_nombre = entrada.nextLine();
		System.out.println("Un saludo "+_nombre);
		
		
	}

}
