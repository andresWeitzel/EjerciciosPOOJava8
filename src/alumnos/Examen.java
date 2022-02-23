package alumnos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Examen extends Alumno{
	
	int nota;
	LocalDate fecha;
	LocalTime hora;

	
	public Examen(int id, String apellido, int edad, String tipoDoc, String nroDoc, String nroTel,
			LocalDate fechaIngreso, LocalTime horaIngreso, double adeuda, int nota, LocalDate fecha, LocalTime hora) {
		super(id, apellido, edad, tipoDoc, nroDoc, nroTel, fechaIngreso, horaIngreso, adeuda);
		this.nota = nota;
		this.fecha = fecha;
		this.hora = hora;
	}
	
	public Examen(Alumno alumnoInput, int nota, LocalDate fecha, LocalTime hora ) {
		this.nota = nota;
		this.fecha = fecha;
		this.hora = hora;
	}


	public Examen() {
		
		
	}



	public int getNota() {
		return nota;
	}



	public void setNota(int nota) {
		this.nota = nota;
	}



	public LocalDate getFecha() {
		return fecha;
	}



	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}



	public LocalTime getHora() {
		return hora;
	}



	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
	
	/**
	 * Esta función convierte un valor númerico de una nota en un valor Textual 
	 * @param nota : Nota Ingresada de Tipo int
	 * @return "DESAPROBADO" : Caso que la nota ingresada sea Mayor o igual a 1 
	 * y a su vez sea Menor o igual a 5
	 * @return "APROBADO" : Caso que la nota es mayor o igual a 6 y a su vez es 
	 * Menor o igual a 10. 
	 */
	public String resultadoExamen(int nota) {
		
		if (nota < 1) {
			return "No puede existir una nota con el valor " + nota;
			
		}else {
			
			if((nota >= 1) && (nota <= 5) ) {
				return "DESAPROBADO";
			}else if((nota >= 6) && (nota <= 10) ) {
				return "APROBADO";
			}else {
				return "Ha ocurrido un error inesperado!";
			}
		}
		
	}
	
	/**
	 * Esta función convierte un valor númerico de una nota en un valor Porcentual
	 * Textual 
	 * @param nota : Nota Ingresada de Tipo int
	 * @return porcecntaje obtenido : Caso que la nota ingresada sea Mayor o igual
	 *  a 1 y a su vez sea Menor o igual a 10
	 */
	public String porcentajeExamen(int nota) {
		
		if (nota < 1) {
			return "No puede existir una nota con el valor " + nota;
			
		}else {
			
			if((nota >= 1) && (nota <= 10) ) {
			
				
				return "Porcentaje Obtenido " + nota*10+ "%";
				
			}else {
				return "Ha ocurrido un error inesperado!";
			}
		}
		
	}
	
	
	
	/**
	 * Esta función convierte un valor númerico de una nota en un valor Textual 
	 * @param nota : Nota Ingresada de Tipo int
	 * @return "INSUFICIENTE" : Caso que la nota ingresada sea Mayor o igual
	 *  a 1 y a su vez sea Menor o igual a 5
 	 * @return "SATISFACTORIO" : Caso que la nota ingresada sea Mayor o igual
	 *  a 6 y a su vez sea Menor o igual a 7
	 * @return "EXCELENTE" : Caso que la nota ingresada sea Mayor o igual
	 *  a 8 y a su vez sea Menor o igual a 10
	 
	 */
	public String estadoExamen(int nota) {
		
		if (nota < 1) {
			return "No puede existir una nota con el valor " + nota;
			
		}else {
			
			if((nota >= 1) && (nota <= 5) ) {
				return "INSUFICIENTE";
			}else if((nota >= 6) && (nota <= 7) ) {
				return "SATISFACTORIO";
			}else if((nota >= 8) && (nota <= 10) ) {
				return "EXCELENTE";
			}else {
				return "Ha ocurrido un error inesperado!";
			}
		}
		
	}



	@Override
	public String toString() {
		return "Examen [nota=" + nota + ", fecha=" + fecha + ", hora=" + hora + "] ALUMNO [id=" + id + ", apellido=" + apellido
				+ ", edad=" + edad + ", tipoDoc=" + tipoDoc + ", nroDoc=" + nroDoc + ", nroTel=" + nroTel
				+ ", fechaIngreso=" + fechaIngreso + ", horaIngreso=" + horaIngreso + ", adeuda=" + adeuda + "]";
	}

	
	
	
	

}
