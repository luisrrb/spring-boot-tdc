package mx.rod.tdc.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import mx.rod.tdc.variables.Varibles;

public class Dia {
	private LocalDate fechaDia;
	private ArrayList pagos;
	private ArrayList gastos;
	private ArrayList pagosProgramados;
	private ArrayList gastosProgramados;
	public int noGastosTotales;
	public int noPagosTotales;
	public float montoGastosTotales;
	public float montoPagosTotales;
	public int diaDeMes;
	
	public Dia(LocalDate _fechaDia) {
		// TODO Auto-generated constructor stub
	fechaDia=_fechaDia;
	diaDeMes = fechaDia.getDayOfMonth();
	pagos = new ArrayList();
	gastos = new ArrayList();
	pagosProgramados= new ArrayList();
	gastosProgramados= new ArrayList();
	noGastosTotales = Varibles.NUMERO_CERO;
	noPagosTotales = Varibles.NUMERO_CERO;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List getPagos() {
		return pagos;
	}

	public List getGastos() {
		return gastos;
	}

	public List getPagosProgramados() {
		return pagosProgramados;
	}

	public List getGastosProgramados() {
		return gastosProgramados;
	}

	public void addGasto(Gasto _gasto) {
		// TODO Auto-generated method stub
		gastos.add(_gasto);
	}
	
	public void addGastoProgramado(GastoProgramado _gastoProgramado) {
		// TODO Auto-generated method stub
		gastosProgramados.add(_gastoProgramado);
	}
	public void addPago(Pago _pago) {
		// TODO Auto-generated method stub
		pagos.add(_pago);
	}
	
	public void addPagoProgramado(PagoProgramado _pagoProgramado) {
		// TODO Auto-generated method stub
		pagosProgramados.add(_pagoProgramado);
	}
	public int obtenerNoGastosTotalesDia() {
		// TODO Auto-generated method stub
		int gastosTotal=gastos.size();
		int gastosTotalProgramado =gastosProgramados.size(); 
		noGastosTotales = gastosTotal+gastosTotalProgramado;
		return noGastosTotales;
	}
	public int obtenerNoPagosTotalesDia() {
		// TODO Auto-generated method stub
		int pagosTotal=pagos.size();
		int pagosTotalProgramado = pagosProgramados.size(); 
		noPagosTotales = pagosTotal+pagosTotalProgramado;
		return noPagosTotales;
	}
	public float calcularMontoTotalDeGastos() {
		// TODO Auto-generated method stub
		montoGastosTotales=0;
		int gastosTotal=gastos.size();
		for (int i = 0; i < gastosTotal; i++) {
			Gasto gastoTemp = (Gasto)gastos.get(i);;
			montoGastosTotales = gastoTemp.getMonto()+montoGastosTotales;
		}
		int gastosTotalProgramado =gastosProgramados.size(); 
		for (int i = 0; i < gastosTotalProgramado; i++) {
			GastoProgramado gastoProgramadoTemp = (GastoProgramado)gastosProgramados.get(i);;
			montoGastosTotales=montoGastosTotales + gastoProgramadoTemp.getMonto();
		}		
		return montoGastosTotales;
	}
	public float calcularMontoTotalDePagos() {
		// TODO Auto-generated method stub
		montoPagosTotales=0;
		int pagosTotal=pagos.size();
		for (int i = 0; i < pagosTotal; i++) {
			Pago pagoTemp = (Pago)pagos.get(i);;
			montoGastosTotales = montoPagosTotales+pagoTemp.getMonto();
		}
		int pagosTotalProgramado =gastosProgramados.size(); 
		for (int i = 0; i < pagosTotalProgramado; i++) {
			PagoProgramado pagoProgramadoTemp = (PagoProgramado)gastosProgramados.get(i);;
			montoPagosTotales=montoPagosTotales + pagoProgramadoTemp.getMonto();
		}		
		return montoPagosTotales;
	}
}
