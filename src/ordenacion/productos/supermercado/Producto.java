package ordenacion.productos.supermercado;

public class Producto {

	int id;
	String nombre;
	String marca;
	double precio;
	
	

	public Producto(int id, String nombre, String marca, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
	}
	
	public Producto() {
		
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + "]";
	}
	
	
	

	
	
	
}
