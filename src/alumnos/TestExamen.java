package alumnos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TestExamen extends Examen{
	
public static void main(String[] args) {

	
	
	Examen examenPerez = new Examen(1,"Perez",23,"DNI","2847665","46578944"
			,LocalDate.of(2005, 9, 9), LocalTime.of(9, 23), 0 , 8 ,LocalDate.of(2020, 02, 12)
			, LocalTime.of(12, 34));
	
	
	
	Examen examenBustamante = new Examen(2, "Bustamante" , 21 , "DNI" , "876276344" 
			, "456379922", LocalDate.of(2018, 01, 22),  LocalTime.of(8, 12), 2300 
			, 8 ,LocalDate.of(2020, 02, 12) , LocalTime.of(12, 34));
	
	
	
	
	
	List<Examen> listaExamenes = new ArrayList();
	
	listaExamenes.add(examenPerez);
	listaExamenes.add(examenBustamante);
	
	
	
	
	
	System.out.println("\n ==== EXAMENES/ALUMNOS ==== ");	
	listaExamenes.forEach(System.out::println);
	
	
	System.out.println("\n ==== RESULTADO DE EXAMENES ==== ");	
	System.out.println("Alumno: "
			+examenPerez.getApellido()
			+" | Calificación:  "
			+examenPerez.resultadoExamen(examenPerez.getNota()));
		
	System.out.println("\nAlumno: "
			+examenBustamante.getApellido()
			+" | Calificación: "
			+examenBustamante.resultadoExamen(examenBustamante.getNota()));
	
	
	
	
	System.out.println("\n ==== PORCENTAJE DE EXAMENES ==== ");	
	System.out.println("Alumno: "
			+examenPerez.getApellido()
			+" | Calificación: "
			+examenPerez.porcentajeExamen(examenPerez.getNota()));
		
	System.out.println("\nAlumno: "
			+examenBustamante.getApellido()
			+" | Calificación: "
			+examenBustamante.porcentajeExamen(examenBustamante.getNota()));
		
	

	
	
	System.out.println("\n ==== ESTADO DE EXAMENES ==== ");	
	System.out.println("Alumno: "
			+examenPerez.getApellido()
			+" | Calificación: "
			+examenPerez.estadoExamen(examenPerez.getNota()));
		
	System.out.println("\nAlumno: "
			+examenBustamante.getApellido()
			+" | Calificación: "
			+examenBustamante.estadoExamen(examenBustamante.getNota()));
		
	
	
	
	
	
}
	
}
