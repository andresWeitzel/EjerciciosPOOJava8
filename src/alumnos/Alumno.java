package alumnos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Alumno {

	int id;
	String apellido;
	int edad;
	String tipoDoc;
	String nroDoc;
	String nroTel;
	LocalDate fechaIngreso;
	LocalTime horaIngreso;
	double adeuda;
	
	
	
	public Alumno(int id, String apellido, int edad, String tipoDoc, String nroDoc, String nroTel,
			LocalDate fechaIngreso, LocalTime horaIngreso, double adeuda) {
		super();
		this.id = id;
		this.apellido = apellido;
		this.edad = edad;
		this.tipoDoc = tipoDoc;
		this.nroDoc = nroDoc;
		this.nroTel = nroTel;
		this.fechaIngreso = fechaIngreso;
		this.horaIngreso = horaIngreso;
		this.adeuda = adeuda;
	}



	public Alumno() {
		super();
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getTipoDoc() {
		return tipoDoc;
	}



	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}



	public String getNroDoc() {
		return nroDoc;
	}



	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}



	public String getNroTel() {
		return nroTel;
	}



	public void setNroTel(String nroTel) {
		this.nroTel = nroTel;
	}



	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}



	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}



	public LocalTime getHoraIngreso() {
		return horaIngreso;
	}



	public void setHoraIngreso(LocalTime horaIngreso) {
		this.horaIngreso = horaIngreso;
	}



	public double getAdeuda() {
		return adeuda;
	}



	public void setAdeuda(double adeuda) {
		this.adeuda = adeuda;
	}



	@Override
	public String toString() {
		return "Alumno [id=" + id + ", apellido=" + apellido + ", edad=" + edad + ", tipoDoc=" + tipoDoc + ", nroDoc="
				+ nroDoc + ", nroTel=" + nroTel + ", fechaIngreso=" + fechaIngreso + ", horaIngreso=" + horaIngreso
				+ ", adeuda=" + adeuda + "]";
	}
	
	
	
	
	
	


}
