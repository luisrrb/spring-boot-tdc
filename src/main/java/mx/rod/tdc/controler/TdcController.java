package mx.rod.tdc.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TdcController {
	@RequestMapping(value = "/clientes", method = RequestMethod.PUT)
	public String clientePUT() {
		// TODO Auto-generated method stub
		 return "Actualiza cliente";
	}
	@RequestMapping(value = "/clientes", method = RequestMethod.GET)
	public String clienteGET() {
		// TODO Auto-generated method stub
		 return "Obtiene cliente";
	}
	@RequestMapping(value = "/clientes", method = RequestMethod.DELETE)
	public String clienteDELETE() {
		// TODO Auto-generated method stub
		 return "Borra cliente";
	}
	@RequestMapping(value = "/clientes", method = RequestMethod.POST)
	public String clientePOST() {
		// TODO Auto-generated method stub
		 return "Crea cliente";
	}
}
