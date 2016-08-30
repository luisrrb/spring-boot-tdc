/**
 * 
 */
package mx.rod.tdc.entities;

import java.time.LocalDate;

/**
 * @author Z824752
 *
 */
public class GastoProgramado extends EventoProgramado {

	/**
	 * 
	 */
	public GastoProgramado() {
		// TODO Auto-generated constructor stub
		super();
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
	public GastoProgramado(LocalDate _fecha, String _lugar, float _monto,
			String _nota,int _numeroDeGastos,int _diasDeCobro,
			float _montoTotal,LocalDate _fechaInialdeEvento,int _numeroDeGastosAlPeriodo) {
		
		super(_fecha, _lugar, _monto, _nota, _numeroDeGastos, _diasDeCobro, _montoTotal, _fechaInialdeEvento, 
				_numeroDeGastosAlPeriodo);		
				
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
