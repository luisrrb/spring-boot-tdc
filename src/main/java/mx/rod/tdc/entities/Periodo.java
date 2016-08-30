package mx.rod.tdc.entities;
import java.time.LocalDate;
import mx.rod.tdc.variables.Varibles;

public class Periodo {
	
	LocalDate fechaInicialDelPeriodo;
	LocalDate fechaFinalDelPeriodo;
	
	float saldoFinalDelPeriodo;
	float saldoInicialDelPeriodo;
	float saldoPromedioDelPeriodo;
	
	float totalPagos=0;
	float totalGastos=0;
	float saldoDiario=0;
	float saldoPromedioDiario=0;
	
	int noDiasDelPeriodo=0;
	
	int idPeriodo=0;
	int noPagos=0;
	int noGastos=0;
	
	private Dia diasDelPeriodo[];
	
	public Periodo(int _noDiasDelPeriodo) {
	
		fechaInicialDelPeriodo=LocalDate.now();
		fechaFinalDelPeriodo =LocalDate.now();
		
		saldoFinalDelPeriodo = Varibles.MONTO_CERO;
		saldoInicialDelPeriodo = Varibles.MONTO_CERO;
		saldoPromedioDelPeriodo = Varibles.MONTO_CERO;
		
		totalPagos=Varibles.NUMERO_CERO;
		totalGastos=Varibles.NUMERO_CERO;
		saldoDiario=Varibles.MONTO_CERO;
		saldoPromedioDiario=Varibles.MONTO_CERO;
		
		noDiasDelPeriodo=_noDiasDelPeriodo;
		
		idPeriodo=Varibles.NUMERO_CERO;
		noPagos=Varibles.NUMERO_CERO;
		noGastos=Varibles.NUMERO_CERO;
		
		diasDelPeriodo = new Dia[noDiasDelPeriodo];
	}

	/**
	 * 
	 * @param dia
	 */
	public void addDia(Dia dia) {
		// TODO Auto-generated method stub
		int diaMes = dia.diaDeMes;
		diasDelPeriodo[diaMes]=dia;
	}
	public Dia getDia(int diaMes) {
		// TODO Auto-generated method stub
		return diasDelPeriodo[diaMes];
	}
	/**
	 * @param args
	 */
		public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
