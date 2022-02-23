package alumnos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class TestListas extends Examen{
	
	public static void main(String[] args) {
		
		

		Examen examenPerez = new Examen(1 , "Perez" , 23 , "DNI" ,"2847665" , "46578944"
				,LocalDate.of(2005, 9, 9), LocalTime.of(9, 23), 0 , 8 
				, LocalDate.of(2020, 02, 12) , LocalTime.of(12, 34));
		
		
		Examen examenBustamante = new Examen(2, "Bustamante" , 21 , "DNI" , "876276344" 
				, "456379922", LocalDate.of(2018, 01, 22),  LocalTime.of(8, 12), 2300 
				, 6 ,LocalDate.of(2020, 02, 12) , LocalTime.of(12, 34));
		
		
		Examen examenGonzalez = new Examen(3, "Gonzales" , 25 , "DNI" , "3923983732" 
				, "823872367", LocalDate.of(2019, 03, 21),  LocalTime.of(11, 22)
				, 800 , 9 ,LocalDate.of(2021, 01, 22) , LocalTime.of(13, 33));
		
		
		Examen examenRodriguez = new Examen(4, "Rodriguez" , 26 , "DNI" , "9383332878" 
				, "8272634689", LocalDate.of(2017, 02, 12),  LocalTime.of(14, 43)
				, 5500 , 3 ,LocalDate.of(2020, 02, 12) , LocalTime.of(12, 34));
		
		
		
		
		
		
		ArrayList<Examen> listaExamenesArrayList = new ArrayList();
		
		listaExamenesArrayList.add(examenPerez);
		listaExamenesArrayList.add(examenBustamante);
		listaExamenesArrayList.add(examenGonzalez);
		listaExamenesArrayList.add(examenRodriguez);
		

		System.out.println("\n ==== EXAMENES/ALUMNOS ==== ");	
		listaExamenesArrayList.forEach(System.out::println);
		
		
		
		System.out.println("\n ==== EXAMENES CON LAS MAYORES NOTAS (Informacion Completa) ==== ");	
		listaExamenesArrayList
		.stream()
		.filter(objeto->objeto.getNota() >= 8)
		.forEach(System.out::println);
		
		
		System.out.println("\n ==== EXAMENES CON LAS MAYORES NOTAS (Información Resumida) ==== ");	
		listaExamenesArrayList
		.stream()
		.filter(objeto->objeto.getNota() >= 8)
		.forEach(objeto
				->System.out.println(
						"Fecha: "+objeto.getFecha()
						+" | Nota: "+objeto.getNota()
						+" | Alumno: "+objeto.getApellido()
					));
		
		
		List<Examen> listaExamenesList = new ArrayList();
		
		listaExamenesList.add(examenPerez);
		listaExamenesList.add(examenBustamante);
		listaExamenesList.add(examenGonzalez);
		listaExamenesList.add(examenRodriguez);
		

		
		
		System.out.println("\n ==== EXAMENES CON NOTAS INTERMEDIAS ==== ");	
		listaExamenesList
		.stream()
		.filter(objeto->objeto.getNota() >= 6 && objeto.getNota() <= 7)
		.forEach(objeto
				->System.out.println(
						"Fecha: "+objeto.getFecha()
						+" | Nota: "+objeto.getNota()
						+" | Alumno: "+objeto.getApellido()
					));
		
		
		LinkedList<Examen> listaExamenesLinkedList = new LinkedList();
		
		listaExamenesLinkedList.add(examenPerez);
		listaExamenesLinkedList.add(examenBustamante);
		listaExamenesLinkedList.add(examenGonzalez);
		listaExamenesLinkedList.add(examenRodriguez);
		

		
		
		System.out.println("\n ==== EXAMENES CON NOTAS BAJAS ==== ");	
		listaExamenesLinkedList
		.stream()
		.filter(objeto->objeto.getNota() >= 1 && objeto.getNota() <= 5)
		.forEach(objeto
				->System.out.println(
						"Fecha: "+objeto.getFecha()
						+" | Nota: "+objeto.getNota()
						+" | Alumno: "+objeto.getApellido()
					));
		
		
		
		//NO SE ESPECIFICA EL TIPO DE LISTA PARA APROBADOS O DESAPROBADOS, USAMOS EL
		//TIPO ARRAYLIST
		
		
		System.out.println("\n ==== EXAMENES APROBADOS ==== ");	
		listaExamenesArrayList
		.stream()
		.filter(objeto->objeto.getNota() >= 7 && objeto.getNota() <= 10)
		.forEach(objeto
				->System.out.println(
						"Fecha: "+objeto.getFecha()
						+" | Nota: "+objeto.getNota()
						+" | Alumno: "+objeto.getApellido()
					));
		
		
		
		System.out.println("\n ==== EXAMENES DESAPROBADOS ==== ");	
		listaExamenesArrayList
		.stream()
		.filter(objeto->objeto.getNota() >= 1 && objeto.getNota() <= 6)
		.forEach(objeto
				->System.out.println(
						"Fecha: "+objeto.getFecha()
						+" | Nota: "+objeto.getNota()
						+" | Alumno: "+objeto.getApellido()
					));
		
		
		
		//USANDO LAMBDA IMPLICITA PARA ORDENACIÓN
		System.out.println("\n ==== EXAMENES APROBADOS ORDENADOS DE FORMA ASCENDENTE POR NOTA ==== ");	
		listaExamenesArrayList
		.stream()
		.filter(objeto->objeto.getNota() >= 7 && objeto.getNota() <= 10)
		.sorted(Comparator.comparing(Examen::getNota))
		.forEach(objeto
				->System.out.println(
						"Fecha: "+objeto.getFecha()
						+" | Nota: "+objeto.getNota()
						+" | Alumno: "+objeto.getApellido()
					));
		
		
		//USANDO LAMBDA EXPLICITA PARA ORDENACIÓN
		System.out.println("\n ==== EXAMENES APROBADOS ORDENADOS DE FORMA ASCENDENTE POR NOTA ==== ");	
		listaExamenesArrayList
		.stream()
		.filter(objeto->objeto.getNota() >= 7 && objeto.getNota() <= 10)
		.sorted(Comparator.comparing(objeto->objeto.getNota()))
		.forEach(objeto
				->System.out.println(
						"Fecha: "+objeto.getFecha()
						+" | Nota: "+objeto.getNota()
						+" | Alumno: "+objeto.getApellido()
					));
		
		
		
		
		//USANDO LAMBDA IMPLICITA PARA ORDENACIÓN DESCENDENTE
				System.out.println("\n ==== EXAMENES DESAPROBADOS ORDENADOS DE FORMA DESCENDENTE POR NOTA ==== ");	
				listaExamenesArrayList
				.stream()
				.filter(objeto->objeto.getNota() >= 1 && objeto.getNota() <= 6)
				.sorted(Comparator.comparing(Examen::getNota).reversed())
				.forEach(objeto
						->System.out.println(
								"Fecha: "+objeto.getFecha()
								+" | Nota: "+objeto.getNota()
								+" | Alumno: "+objeto.getApellido()
							));
				
				
				//USANDO LAMBDA EXPLICITA PARA ORDENACIÓN DESCENDENTE
				//NO CONOZCO FORMA DE ORDEN. DESC. CON ESTA METODOLOGIA,
				//SE DEBERÁ USAR LAMBD. EXPL. U OTRO MÉTODOSS
				/*
				System.out.println("\n ==== EXAMENES DESAPROBADOS ORDENADOS DE FORMA DESCENDENTE POR NOTA ==== ");	
				listaExamenesArrayList
				.stream()
				.filter(objeto->objeto.getNota() >= 1 && objeto.getNota() <= 6)
				.sorted(Comparator.comparing(objeto->objeto.getNota()))
				.forEach(objeto
						->System.out.println(
								"Fecha: "+objeto.getFecha()
								+" | Nota: "+objeto.getNota()
								+" | Alumno: "+objeto.getApellido()
							));
				 */
		
		
		
		
	}

}
