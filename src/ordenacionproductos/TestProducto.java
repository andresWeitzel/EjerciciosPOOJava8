package ordenacionproductos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestProducto {
	
	public static void main(String[] args) {
		
		
		//https://programmerclick.com/article/1869772259/
	
		// A modo de simplificacion usamos esos nombres de objetos
		Producto p01 = new Producto(1, "Leche Entera 1L","La Serenisima",140);
		Producto p02 = new Producto(2, "Leche Descremada 1L","La Serenisima",170);
		Producto p03 = new Producto(3, "Manzanas Rojas 1Kg","plump",240);
		Producto p04 = new Producto(4, "Bananas Ecutorianas 1Kg","Perlim",330);
		Producto p05 = new Producto(5, "Medallones ed Pollo","Generica",430);
		Producto p06 = new Producto(6, "Bife de Chorizo","Beef",610); 
		
		
		List<Producto> listaProductos = new ArrayList();
		
		listaProductos.add(p01);
		listaProductos.add(p02);
		listaProductos.add(p03);
		listaProductos.add(p04);
		listaProductos.add(p05);
		listaProductos.add(p06);
		
		
		//Recordar que el orden natural significa que la coleccion de objetos
		//tendra unicamente un metodo de ordenacion(una manera de ordenar segun
		//el campo deseado)
		
		System.out.println("\n=== PRODUCTOS ORDENADOS DE FORMA NATURAL POR ID COMPLETO ===");

		//No usamos filters, solo un stream con lambdas implicitas
		listaProductos
			.stream()
			.sorted(Comparator.comparing(Producto::getId))
			.forEach(System.out::println);
			
		
		
		System.out.println("\n=== PRODUCTOS ORDENADOS DE FORMA NATURAL POR NOMBRE COMPLETO ===");

		listaProductos
			.stream()
			.sorted(Comparator.comparing(Producto::getNombre))
			.forEach(System.out::println);
			
		
		System.out.println("\n=== PRODUCTOS ORDENADOS DE FORMA NATURAL POR NOMBRE RESUMIDO ===");

		listaProductos
			.stream()
			.sorted(Comparator.comparing(Producto::getNombre))
			.forEach(objeto->System.out.println(
					" ID : "+objeto.getId()
					+ " | Nombre : " + objeto.getNombre()));
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
