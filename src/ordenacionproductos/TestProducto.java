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
		Producto p03 = new Producto(3, "Manzanas Rojas 1Kg","Plump",340);
		Producto p04 = new Producto(4, "Manzanas Verdes 1Kg","Plump",290);
		Producto p05 = new Producto(5, "Bananas Ecutorianas 1Kg","Perlim",230);
		Producto p06 = new Producto(6, "Zanahorias 1Kg","Perlim",120);
		Producto p07 = new Producto(7, "Medallones de Pollo","Generica",430);
		Producto p08 = new Producto(8, "Costillas de Cerdo","Generica",630);
		Producto p09 = new Producto(9, "Bife de Chorizo","Beef",610);
		Producto p10 = new Producto(10, "Carne de Ternera 1 Kg","Beef",810);
		
		
		
		List<Producto> listaProductos = new ArrayList();
		
		listaProductos.add(p01);
		listaProductos.add(p02);
		listaProductos.add(p03);
		listaProductos.add(p04);
		listaProductos.add(p05);
		listaProductos.add(p06);
		listaProductos.add(p07);
		listaProductos.add(p08);
		listaProductos.add(p09);
		listaProductos.add(p10);
		
		
		
		//===========================================================================
		System.out.println("\n======== ORDENACION POR ID ASCENDENTE/DESCENDENTE========");
		//===========================================================================
	
		
		//Recordar que el orden natural significa que la coleccion de objetos
		//tendra unicamente un metodo de ordenacion(una manera de ordenar segun
		//el campo deseado)
		
		System.out.println("\n=== PRODUCTOS ORDENADOS DE FORMA NATURAL POR ID COMPLETO ===");

		//No usamos filters, solo un stream con lambdas implicitas
		listaProductos
			.stream()
			.sorted(Comparator.comparing(Producto::getId))
			.forEach(System.out::println);
			
		
		
		//===========================================================================
		System.out.println("\n======== ORDENACION POR NOMBRE ASCENDENTE/DESCENDENTE========");
		//===========================================================================
	
		
		
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
		
		//===========================================================================
		System.out.println("\n======== ORDENACION POR PRECIO ASCENDENTE/DESCENDENTE========");
		//===========================================================================
	
			
		
		System.out.println("\n=== PRODUCTOS ORDENADOS DE FORMA NATURAL POR PRECIO ASCENDENTE ===");

		listaProductos
		.stream()
		.sorted(Comparator.comparing(Producto::getPrecio))
		.forEach(objeto->System.out.println(
				" ID : "+objeto.getId()
				+ " | Nombre : " + objeto.getNombre()
				+ " | Precio : " + objeto.getPrecio()));


		System.out.println("\n=== PRODUCTOS ORDENADOS DE FORMA NATURAL POR PRECIO DESCENDENTE ===");

		listaProductos
		.stream()
		.sorted(Comparator.comparing(Producto::getPrecio).reversed())
		.forEach(objeto->System.out.println(
				" ID : "+objeto.getId()
				+ " | Nombre : " + objeto.getNombre()
				+ " | Precio : " + objeto.getPrecio()));

		
		//===========================================================================
		System.out.println("\n======== PRECIO MAYOR/MENOR TOTAL ORDENACION ========");
		//===========================================================================
	
		
		//SI EXISTIERA VARIOS PRODUCTOS CON MAXIMOS IGUALES, TOMA EL PRIMERO QUE 
		//ESTUVIESE ORDENADO DE FORMA ASCENDENTE
		System.out.println("\n=== PRODUCTO CON EL PRECIO MAYOR TOTAL (MAXIMO POR ORDEN NATURAL) ===");

		System.out.println(
		listaProductos
		.stream()
		.max(Comparator.comparing(Producto::getPrecio))
		);

		
		
		System.out.println("\n=== PRODUCTO CON EL PRECIO MENOR TOTAL (MINIMO ORDEN NATURAL) ===");

		System.out.println(
		listaProductos
		.stream()
		.max(Comparator.comparing(Producto::getPrecio).reversed())
		);

	
		System.out.println("\n=== PRODUCTO CON EL PRECIO MENOR TOTAL (MINIMO ORDEN NATURAL) ===");

		System.out.println(
		listaProductos
		.stream()
		.min(Comparator.comparing(Producto::getPrecio))
		);
		
		//===========================================================================
		System.out.println("\n======== PRECIO MAYOR/MENOR POR MARCA ========");
		//===========================================================================
		
		

		System.out.println("\n=== LISTADO DE PRODUCTO POR MARCA 'Perlim' ===");

		
		listaProductos
		.stream()
		.filter(objeto->objeto.getMarca() == "Perlim")
		.forEach(System.out::println);
		
		
		System.out.println("\n=== PRODUCTO CON EL PRECIO MAYOR POR MARCA 'Perlim' ===");

		System.out.println(
		listaProductos
		.stream()
		.filter(objeto->objeto.getMarca() == "Perlim")
		.max(Comparator.comparing(Producto::getPrecio))
		
		);
		
	
	}
}
