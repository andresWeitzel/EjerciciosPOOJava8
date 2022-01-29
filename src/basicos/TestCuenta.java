package basicos;

public class TestCuenta {
	
	public static void main(String[] args) {
		
		//Constructor vacio
		Cuenta cuenta01 = new Cuenta();
		
		//Constructor parametrico total
		Cuenta cuenta02 = new Cuenta("Juan Perez","8937673653456" , 6.0 , 60000);
		
		Cuenta cuenta03 = new Cuenta(cuenta02);
		
		
		
		System.out.println(cuenta01.toString());
		
		System.out.println(cuenta02.toString());
		
		System.out.println(cuenta03.toString());
		
		
		System.out.println("\n == Saldo del Cliente == ");
		
		System.out.println(cuenta03.getSaldo());
		
		
		System.out.println("\n == Realizamos un Ingreso == ");
		
		System.out.println(cuenta03.ingreso(-15000));
		
		

		System.out.println("\n == Saldo del Cliente == ");
		
		System.out.println(cuenta03.getSaldo());
		
		
		System.out.println("\n == Realizamos un Ingreso == ");
		
		System.out.println(cuenta03.ingreso(15000));
		
		

		System.out.println("\n == Saldo del Cliente == ");
		
		System.out.println(cuenta03.getSaldo());
		
		
		
		System.out.println("\n == Realizamos una Extracción == ");
		
		System.out.println(cuenta03.extraccion(100000));
		
		

		System.out.println("\n == Saldo del Cliente == ");
		
		System.out.println(cuenta03.getSaldo());
		
		
		System.out.println("\n == Realizamos una Extracción == ");
		
		System.out.println(cuenta03.extraccion(20000));
		
		

		System.out.println("\n == Saldo del Cliente == ");
		
		System.out.println(cuenta03.getSaldo());
		
		
		
		
		
	}

}
