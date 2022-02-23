package alumnos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TestAlumnos extends Alumno{
	
	public static void main(String[] args) {
		
		Alumno juanRamirez = new Alumno(1,"Ramirez",23,"DNI","439758699"
				,"45679873", LocalDate.of(2005,02,12) , LocalTime.of(13, 45) 
				, 13.500 );
		
		
		Alumno marcelaGonzales = new Alumno(2,"Gonzales",22,"DNI","83756655"
				,"46354772", LocalDate.of(2001,01,22) , LocalTime.of(8, 55) 
				, 2000 );
		
		Alumno damianEspinoza = new Alumno(3,"Espinoza",21,"DNI","938456756"
				,"47568930", LocalDate.of(2020,05,11) , LocalTime.of(9, 26) 
				, 0 );
		
		
		List<Alumno> listadoAlumnos = new ArrayList();
		
		listadoAlumnos.add(juanRamirez);
		listadoAlumnos.add(marcelaGonzales);
		listadoAlumnos.add(damianEspinoza);
		
		
		
		
		System.out.println("\n ===== Listado de Alumnos =======");
		listadoAlumnos.forEach(System.out::println);
		

		
		//-------------------------------------------------------------------------------
		
		System.out.println("\n ===== Listado de Alumnos cuya fecha de ingreso "
				+ "sea posterior al 2003=======");
		
		//Recordar que para usar filtros se necesita un stream
		listadoAlumnos
		.stream()
		.filter(objeto -> objeto.getFechaIngreso().isAfter(LocalDate.of(2003, 01, 01)))
		.forEach(System.out::println);
		
		
		//-------------------------------------------------------------------------------
		
		System.out.println("\n ===== Listado de Alumnos cuya fecha de ingreso "
				+ "sea inferior al 2002=======");
		
		//Recordar que para usar filtros se necesita un stream
		listadoAlumnos
		.stream()
		.filter(objeto -> objeto.getFechaIngreso().isBefore(LocalDate.of(2002, 01, 01)))
		.forEach(System.out::println);
		

		//-------------------------------------------------------------------------------
		
		System.out.println("\n ===== Listado de Alumnos cuya hora de ingreso "
				+ "sea despues de las 09 am =======");
		
		//Recordar que para usar filtros se necesita un stream
		listadoAlumnos
		.stream()
		.filter(objeto -> objeto.getHoraIngreso().isAfter(LocalTime.of(9, 0)))
		.forEach(System.out::println);
		

		//-------------------------------------------------------------------------------
		
		
		System.out.println("\n ===== Listado de Alumnos cuya hora de ingreso "
				+ "sea antes de las 09 am =======");
		
		//Recordar que para usar filtros se necesita un stream
		listadoAlumnos
		.stream()
		.filter(objeto -> objeto.getHoraIngreso().isBefore(LocalTime.of(9, 0)))
		.forEach(System.out::println);
		

		//-------------------------------------------------------------------------------
		
		
		System.out.println("\n ===== Listado de Alumnos Adeudados =======");
		
		//Recordar que para usar filtros se necesita un stream
		listadoAlumnos
		.stream()
		.filter(objeto -> objeto.getAdeuda() > 0.0)
		.forEach(System.out::println);
		

		//-------------------------------------------------------------------------------
		
		
		
	}

}
