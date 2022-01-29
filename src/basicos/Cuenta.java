package basicos;

public class Cuenta{

	String nombreCliente;
	String nroCuenta;
	double tipoInteres;//2.7% , 6% 
	double saldo;


public Cuenta(String nombreCliente, String nroCuenta, double tipoInteres
		, double saldo) {
		
		this.nombreCliente = nombreCliente;
		this.nroCuenta = nroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;

}


public Cuenta() {
	
}

/**
 *  Método Constructor de Copia
 *  @param : objetoCuenta : objeto del la Clase Cuenta ya creado 
 */
public Cuenta(Cuenta objetoCuenta) {
	
	nombreCliente = objetoCuenta.nombreCliente;
	nroCuenta = objetoCuenta.nroCuenta;
	tipoInteres = objetoCuenta.tipoInteres;//2.7% , 6% 
	saldo = objetoCuenta.saldo;
	
}





public String getNombreCliente() {
	return nombreCliente;
}


public void setNombreCliente(String nombreCliente) {
	this.nombreCliente = nombreCliente;
}


public String getNroCuenta() {
	return nroCuenta;
}


public void setNroCuenta(String nroCuenta) {
	this.nroCuenta = nroCuenta;
}


public double getTipoInteres() {
	return tipoInteres;
}


public void setTipoInteres(double tipoInteres) {
	this.tipoInteres = tipoInteres;
}


public double getSaldo() {
	return saldo;
}


public void setSaldo(double saldo) {
	this.saldo = saldo;
}




/**
 * Este Metodo actualiza el saldo de la cuenta siempre y cuando la 
 * cantidad ingresada no sea negativa
 * @param cantidad : Monto de Ingreso
 * @return false : Si la cantidad ingresada es Negativa. true : Si la cantidad 
 * Ingresada es Positiva y se Actualiza el Saldo
 */
public boolean ingreso(double cantidad) {
	
	if(cantidad < 0.0) {
		System.out.println("No se puede Ingresar un Monto Negativo!");
		System.out.println("El Monto Ingresado es "+cantidad);
		
		
		return false;
		
	}else {
		
		//Ej saldo = 20.000 + cantidad(15.000)
		saldo = saldo + cantidad;
		
		System.out.println("El Monto Ingresado "+ cantidad +" se ha agregado a su Saldo de "
				+ "forma correcta!");	
	}

	return true;

}




/**
 * Este Método es para la extracción de un Monto del Saldo de la Cuenta siempre y cuando
 * la cantidad ingresada no sea negativa y a su vez dicha cantidad sea mayor al saldo
 * @param cantidad : Monto de Extracción
 * @return false : Si la cantidad Ingresada es Negativa o el Monto de Extraccion
 * es Mayor al Saldo Actual. true : Si la cantidad Ingresada es Positiva y a su vez
 * se ha realizado la extracción 
 */
public boolean extraccion(double cantidad) {
	
	
	if(cantidad < 0.0) {
		System.out.println("No se puede Ingresar un Monto Negativo!");
		System.out.println("El Monto Ingresado es "+cantidad);
		
		
		return false;
		
	}else if(saldo < cantidad) {
		
		System.out.println("Saldo Insuficiente");
		System.out.println("Saldo : "+saldo);
		System.out.println("Cantidad de Extraccion : "+cantidad);
		
		return false;
	
	}else {
		
		//Ej saldo = 20.000 - cantidad(10.000)
		saldo = saldo - cantidad;
		
		System.out.println("El Monto de Extracción "+ cantidad +" se ha descontado"
				+ "de su Saldo de forma correcta ");
		
	}
	
	return true;
}








@Override
public String toString() {
	return "Cuenta [nombreCliente=" + nombreCliente + ", nroCuenta=" + nroCuenta + ", tipoInteres=" + tipoInteres
			+ ", saldo=" + saldo + "]";
}








}
