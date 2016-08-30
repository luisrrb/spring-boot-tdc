package mx.rod.tdc.entities;

import java.time.LocalDate;

//import mx.rod.tdc.variables.Varibles;

public class Evento {
	
	LocalDate fecha;
	String lugar;
	float monto;
	String nota;
	
	public Evento() {
		// TODO Auto-generated constructor stub
//		fecha = LocalDate.now();
//		lugar = Varibles.CADENA_VACIA;
//		monto=Varibles.MONTO_CERO;
//		nota = Varibles.CADENA_VACIA;
	}
	
	public Evento(LocalDate _fecha,String _lugar,float _monto,String _nota){
		fecha = _fecha;
		lugar = _lugar;
		monto = _monto;
		nota = _nota;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

}
