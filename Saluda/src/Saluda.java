import java.util.Scanner;

public class Saluda {

	private static String _nombre;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_nombre = pideNombre();
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
	
	public static String pideNombre () {
		Scanner entrada = new Scanner (System.in);
		System.out.println("¿Como te llamas?");
		String nombre = entrada.nextLine();
		return nombre;
	}

}
