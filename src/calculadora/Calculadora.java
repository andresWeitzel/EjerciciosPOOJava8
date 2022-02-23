package calculadora;

public class Calculadora {
	
	double num01;
	double num02;
	private double resultadoSuma;
	private double resultadoResta;
	private double resultadoDiv;
	private double resultadoMult;
	private double resultadoRaiz;
	private double resultadoRaicesNum01;
	private double resultadoRaicesNum02;
	private double resultadoProm;
	private boolean resultadoNroPrimo;
	
	

	public Calculadora(double num01, double num02) {
		super();
		this.num01 = num01;
		this.num02 = num02;
	}


	public Calculadora() {
		super();
	}



	
	



	public double getNum01() {
		return num01;
	}


	public void setNum01(double num01) {
		this.num01 = num01;
	}


	public double getNum02() {
		return num02;
	}

	public void setNum02(double num02) {
		this.num02 = num02;
	}


	public double getResultadoSuma() {
		return resultadoSuma;
	}


	public void setResultadoSuma(double resultadoSuma) {
		this.resultadoSuma = resultadoSuma;
	}


	public double getResultadoResta() {
		return resultadoResta;
	}



	public void setResultadoResta(double resultadoResta) {
		this.resultadoResta = resultadoResta;
	}



	public double getResultadoDiv() {
		return resultadoDiv;
	}



	public void setResultadoDiv(double resultadoDiv) {
		this.resultadoDiv = resultadoDiv;
	}



	public double getResultadoMult() {
		return resultadoMult;
	}



	public void setResultadoMult(double resultadoMult) {
		this.resultadoMult = resultadoMult;
	}




	public double getResultadoRaiz() {
		return resultadoRaiz;
	}



	public void setResultadoRaiz(double resultadoRaiz) {
		this.resultadoRaiz = resultadoRaiz;
	}



	public double getResultadoRaicesNum01() {
		return resultadoRaicesNum01;
	}


	public void setResultadoRaicesNum01(double resultadoRaicesNum01) {
		this.resultadoRaicesNum01 = resultadoRaicesNum01;
	}


	public double getResultadoRaicesNum02() {
		return resultadoRaicesNum02;
	}


	public void setResultadoRaicesNum02(double resultadoRaicesNum02) {
		this.resultadoRaicesNum02 = resultadoRaicesNum02;
	}


	public double getResultadoProm() {
		return resultadoProm;
	}



	public void setResultadoProm(double resultadoProm) {
		this.resultadoProm = resultadoProm;
	}



	public boolean getResultadoNroPrimo() {
		return resultadoNroPrimo;
	}



	public void setResultadoNroPrimo(boolean resultadoNroPrimo) {
		this.resultadoNroPrimo = resultadoNroPrimo;
	}








	/**
	 * Suma dos Números de Entrada de Tipo double y almacena dicho resultado en 
	 * una variable resultado 
	@param num01 : Primer Número de Entrada de Tipo double
	 * @param num02 : Segundo Número de Entrada de Tipo double
	 */
	public void sumar(double num01 , double num02) {
		
		this.num01 = num01;
		this.num02 = num02;
		
		//Almacenamos el resultado
		this.resultadoSuma = num01 + num02;
		

		
	}
	
	/**
	 * Resta dos Números de Entrada de Tipo double y almacena dicho resultado en 
	 * una variable resultado 
	 * @param num01 : Primer Número de Entrada de Tipo double
	 * @param num02 : Segundo Número de Entrada de Tipo double
	 */
	public void restar(double num01 , double num02) {
		
		this.num01 = num01;
		this.num02 = num02;
		
		//Almacenamos el resultado
		this.resultadoResta = num01 - num02;
		
		
	}
	
	
	/**
	 * Multiplicación de dos Números de Entrada de Tipo double y almacena dicho
	 *  resultado en una variable resultado
	 * @param num02 : Segundo Número de Entrada de Tipo double
	 */
	public void multiplicar(double num01 , double num02) {
		
		this.num01 = num01;
		this.num02 = num02;
		
		//Almacenamos el resultado
		this.resultadoMult = num01 * num02;
		
		
	}

	
	
	/**
	 * Division de dos Números de Entrada de Tipo double y almacena dicho
	 *  resultado en una variable resultado 
	 @param num01 : Primer Número de Entrada de Tipo double
	 * @param num02 : Segundo Número de Entrada de Tipo double
	 */
	public void dividir(double num01 , double num02) {
		
		this.num01 = num01;
		this.num02 = num02;
		
		//Almacenamos el resultado
		this.resultadoDiv = num01 / num02;
		

	}

	
	/**
	 * Calcula la raiz del Primer Número Ingresado y Almacena dicha Operacion
	 * @param num01 : Primer Número de Entrada de tipo double
	 */
	public void obtenerRaiz(double num01) {
		
		this.num01 = num01;
	
		
		//Almacenamos el resultado
		this.resultadoRaiz = Math.sqrt(num01);
		
	}
	
	
	
	/**
	 * Calcula las raices de los Números Ingresados y Almacena dichas Operaciones
	 * en variables independientes
	 * @param num01 : Primer Número de Entrada de Tipo double
	 * @param num02 : Segundo Número de Entrada de Tipo double
	 */
	public void obtenerRaices(double num01, double num02) {
		
		this.num01 = num01;
		this.num02 = num02;
	
		
		//Almacenamos los resultados
		this.resultadoRaicesNum01 = Math.sqrt(num01);
		this.resultadoRaicesNum02 = Math.sqrt(num02);
		
		
	}
	
	/**
	 * Obtenemos el Promedio de los Números Ingresados y Almacenamos dicho resultado
	 * @param num01 : Primer Número de Entrada de Tipo double
	 * @param num02 : Segundo Número de Entrada de Tipo double
	 */
	public void obtenerPromedio(double num01, double num02) {
		
		this.num01 = num01;
		this.num02 = num02;
		
		this.resultadoProm = (num01 + num02) / 2;
		
	}

	
//Recordar que los numeros primos solamente son naturales mayores que 1 y tienen	
// unicamente dos divisores distintos, el mismo numero y el 1
	
	/**
	 * Obtenemos true o false segun el resultado luego de comprobar si el numero 
	 * s primo. Dicho resultado lo almacenamos
	 * @param num01 : Primer Número de Entrada de Tipo double
	 * @param num02 : Segundo Número de Entrada de Tipo double
	 */
	public void comprobarNumeroPrimo(double num01) {
		
		this.num01 = num01;
		
		if(num01 < 1) {
			resultadoNroPrimo = false;
		}else {
			
			int contador=0;
			
			for(int i=0 ; i <= num01; i++) {
				
				if((num01 % i) == 0) {
					
					contador = contador +1;
				}
			}
			if (contador == 2) {
				
				resultadoNroPrimo = true;
			}else {
				
				resultadoNroPrimo = false;
			}
		}
	}
	
	
	
	
	
	

}
