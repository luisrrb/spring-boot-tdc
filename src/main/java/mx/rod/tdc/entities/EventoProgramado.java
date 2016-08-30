/**
 * 
 */
package mx.rod.tdc.entities;

import java.time.LocalDate;

import mx.rod.tdc.variables.Varibles;

/**
 * @author Z824752
 *
 */
public class EventoProgramado extends Evento implements Cloneable{

	/**
	 * 
	 */
	int numeroDeEventos;
	boolean estaPagado;
	int diasDeCobro;
	float montoTotal;
	int numeroDeEventosRestantes;
	float montoPagadoAlPeriodo;
	float montoRestanteAlPeriodo;
	LocalDate fechaInialdeEvento;
	LocalDate fechaDelSiguienteEvento;
	int numeroDeEventosAlPeriodo;
	
	public EventoProgramado() {
		super();
		// TODO Auto-generated constructor stub
		numeroDeEventos=Varibles.NUMERO_CERO;
		numeroDeEventosRestantes=Varibles.NUMERO_CERO;
		estaPagado=Varibles.NO_PAGADO;
		diasDeCobro = Varibles.NUMERO_CERO;
		montoTotal = Varibles.MONTO_CERO;
		montoPagadoAlPeriodo = Varibles.MONTO_CERO;
		montoRestanteAlPeriodo = Varibles.MONTO_CERO;
		fechaInialdeEvento = null;
		fechaDelSiguienteEvento = null;
		numeroDeEventosAlPeriodo = Varibles.NUMERO_CERO;
	}


/**
 * 
 * @param _fecha
 * @param _lugar
 * @param _monto
 * @param _nota
 * @param _numeroDeEventos
 * @param _diasDeCobro
 * @param _montoTotal
 * @param _fechaInialdeEvento
 * @param _numeroDeEventosAlPeriodo
 */
	public EventoProgramado(LocalDate _fecha, String _lugar, float _monto, String _nota,int _numeroDeEventos,int _diasDeCobro,
	float _montoTotal,LocalDate _fechaInialdeEvento,int _numeroDeEventosAlPeriodo) 
	{
		super(_fecha, _lugar, _monto, _nota);
		if(_montoTotal!=0)
			estaPagado=Varibles.NO_PAGADO;
		diasDeCobro = _diasDeCobro;
		montoTotal=_montoTotal;
		numeroDeEventos = _numeroDeEventos;
		numeroDeEventosAlPeriodo = _numeroDeEventosAlPeriodo;
		montoPagadoAlPeriodo = numeroDeEventosAlPeriodo * monto; 
		montoRestanteAlPeriodo = montoTotal-montoPagadoAlPeriodo;
		numeroDeEventosRestantes = numeroDeEventos-numeroDeEventosAlPeriodo;
		fechaInialdeEvento = _fechaInialdeEvento;
		fechaDelSiguienteEvento = fechaInialdeEvento.plusMonths(Varibles.UN_MES);
		
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
