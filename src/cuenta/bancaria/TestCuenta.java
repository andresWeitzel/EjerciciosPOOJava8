package cuenta.bancaria;

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
		
		System.out.println("\n ==============================================");
		
		System.out.println("\n ====== MÉTODO DE INGRESO ==============");
		
		
		
		System.out.println("\n == Realizamos un Ingreso == ");
		
		System.out.println(cuenta03.ingreso(15000));
		
		

		System.out.println("\n == Saldo del Cliente == ");
		
		System.out.println(cuenta03.getSaldo());
		
		
		System.out.println("\n ==============================================");
		
		System.out.println("\n ====== MÉTODO DE EXTRACCION ==============");
		
		
		System.out.println("\n == Realizamos una Extracción == ");
		
		System.out.println(cuenta03.extraccion(100000));
		
		

		System.out.println("\n == Saldo del Cliente == ");
		
		System.out.println(cuenta03.getSaldo());
		
		
		System.out.println("\n == Realizamos una Extracción == ");
		
		System.out.println(cuenta03.extraccion(20000));
		
		

		System.out.println("\n == Saldo del Cliente == ");
		
		System.out.println(cuenta03.getSaldo());
		
		System.out.println("\n ==============================================");
		
		System.out.println("\n ====== MÉTODO DE TRANSFERENCIA ==============");
		
		//Creamos 2 nuevas cuenta para su uso
		Cuenta cuentaCliente001 = new Cuenta("Josefina Contreras","745657567" , 5 , 120000);
		
		Cuenta cuentaCliente002 = new Cuenta("Roberto Quiroga","838376467894" , 2 , 180000);
		
		
		System.out.println(cuentaCliente001.toString());
		System.out.println(cuentaCliente002.toString());
		
		System.out.println("\n");
		
		cuentaCliente001.transferencia(cuentaCliente002, 200000);
		

		System.out.println("\n");
		
		cuentaCliente001.transferencia(cuentaCliente002, 100000);
		
		
	}

}
