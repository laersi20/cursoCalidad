package orange.calculadora;

public class App 
{
	public static void main(String[] args) {

	}

	public static int add(String sumatorio) {
// SOY EL MEJOR DEL MUNDO //
		String[] numeros = sumatorio.split(",");

		int suma = 0;
		for (String numero : numeros) {
			
			numero = numero.trim();
			if (numero.isEmpty()) {
				numero = "0";
			}
			suma += Integer.valueOf(numero);
		}
		
		return suma;
	}
	
}
