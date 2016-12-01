import java.util.Scanner;

public class Saluda {

	private static String _nombre;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("¿Como te llamas?");
		_nombre = entrada.nextLine();
		System.out.println("Un saludo "+getNombre());
		setNombre ("NO SE");
		System.out.println("He cambiado el nombre a "+getNombre());
		
	}
	
	public static String getNombre () {
		return _nombre;
	}
	
	public static void setNombre (String nombre) {
		_nombre = nombre;
	}

}
