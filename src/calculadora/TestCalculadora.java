package calculadora;

public class TestCalculadora {

	public static void main(String[] args) {

		// =========================== OPERACION SUMA ===========================

		// ---------------------------- PRIMERA FORMA --------------------------

		Calculadora operacion01 = new Calculadora(12.2, 12.2);

		System.out.println("\n=== Operaci�n Suma ===");
		System.out.println("Primer N�mero Ingresado: " + operacion01.getNum01());
		System.out.println("Segundo N�mero Ingresado: " + operacion01.getNum02());

		operacion01.sumar(operacion01.getNum01(), operacion01.getNum02());

		System.out.println("\nResultado: " + operacion01.getResultadoSuma());

		// ---------------------------- SEGUNDA FORMA --------------------------

		Calculadora operacion02 = new Calculadora();

		System.out.println("\n=== Operaci�n Suma ===");

		operacion02.setNum01(35);
		operacion02.setNum02(2);

		operacion02.sumar(operacion02.getNum01(), operacion02.getNum02());

		System.out.println("Primer N�mero Ingresado: " + operacion02.getNum01());
		System.out.println("Segundo N�mero Ingresado: " + operacion02.getNum02());

		System.out.println("\nResultado: " + operacion02.getResultadoSuma());

		// ---------------------------- TERCERA FORMA --------------------------

		System.out.println("\n=== Operaci�n Suma ===");

		operacion02.sumar(2, 2);

		System.out.println("Primer N�mero Ingresado: " + operacion02.getNum01());
		System.out.println("Segundo N�mero Ingresado: " + operacion02.getNum02());

		System.out.println("\nResultado: " + operacion02.getResultadoSuma());

		System.out.println("\n===============================================");

		// =========================== OPERACION RESTA ===========================

		Calculadora operacion03 = new Calculadora();

		System.out.println("\n=== Operaci�n Resta ===");

		operacion03.restar(10, 7);

		System.out.println("Primer N�mero Ingresado: " + operacion03.getNum01());
		System.out.println("Segundo N�mero Ingresado: " + operacion03.getNum02());

		System.out.println("\nResultado: " + operacion03.getResultadoResta());

		System.out.println("\n===============================================");

		// =========================== OPERACION MULTIPLICACION
		// ===========================

		Calculadora operacion04 = new Calculadora();

		System.out.println("\n=== Operaci�n Multiplicacion ===");

		operacion04.multiplicar(10, 7);

		System.out.println("Primer N�mero Ingresado: " + operacion04.getNum01());
		System.out.println("Segundo N�mero Ingresado: " + operacion04.getNum02());

		System.out.println("\nResultado: " + operacion04.getResultadoMult());

		System.out.println("\n===============================================");

		// =========================== OPERACION DIVISION ===========================

		System.out.println("\n=== Operaci�n Division ===");

		operacion04.dividir(10, 7);

		System.out.println("Primer N�mero Ingresado: " + operacion04.getNum01());
		System.out.println("Segundo N�mero Ingresado: " + operacion04.getNum02());

		System.out.println("\nResultado: " + operacion04.getResultadoDiv());

		System.out.println("\n===============================================");

		// =========================== OPERACION RAIZ ===========================

		System.out.println("\n=== Operaci�n Raiz ===");

		operacion04.obtenerRaiz(64);

		System.out.println("N�mero Ingresado: " + operacion04.getNum01());

		System.out.println("\nResultado: " + operacion04.getResultadoRaiz());

		System.out.println("\n=== Operaci�n Raiz ===");

		operacion04.obtenerRaiz(49);

		System.out.println("N�mero Ingresado: " + operacion04.getNum01());

		System.out.println("\nResultado: " + operacion04.getResultadoRaiz());

		System.out.println("\n===============================================");

		// =========================== OPERACION RAICES ===========================

		System.out.println("\n=== Operaci�n Raices ===");

		operacion04.obtenerRaices(16, 49);

		System.out.println("\nResultado: " + operacion04.getResultadoRaicesNum01());
		System.out.println("\nResultado: " + operacion04.getResultadoRaicesNum02());

		System.out.println("\n=== Operaci�n Raices ===");

		operacion04.obtenerRaices(64, 81);

		System.out.println("\nResultado: " + operacion04.getResultadoRaicesNum01());
		System.out.println("\nResultado: " + operacion04.getResultadoRaicesNum02());

		System.out.println("\n===============================================");

		// =========================== OPERACION PROMEDIO ===========================

		System.out.println("\n=== Operaci�n Promedio ===");

		operacion04.obtenerPromedio(2, 4);

		System.out.println("\nResultado: " + operacion04.getResultadoProm());

		System.out.println("\n=== Operaci�n Promedio ===");

		operacion04.obtenerPromedio(100, 30);

		System.out.println("\nResultado: " + operacion04.getResultadoProm());

		System.out.println("\n===============================================");

		// =========================== OPERACION N�MERO PRIMO
		// ===========================

		//https://es.calcuworld.com/calculadoras-matematicas/calculadora-de-numeros-primos/
		
		System.out.println("\n=== Operaci�n N�mero Primo ===");

		operacion04.comprobarNumeroPrimo(2);
		
		System.out.println("\nResultado: " + operacion04.getResultadoNroPrimo());
	
		
		operacion04.comprobarNumeroPrimo(100);
		
		System.out.println("\nResultado: " + operacion04.getResultadoNroPrimo());
		
		
		operacion04.comprobarNumeroPrimo(12);
		
		System.out.println("\nResultado: " + operacion04.getResultadoNroPrimo());

	}

}
