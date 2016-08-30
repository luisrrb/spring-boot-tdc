package mx.rod.tdc.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientesController {
	@RequestMapping(value = "/tdcs", method = RequestMethod.PUT)
	public String tdcsPUT() {
		// TODO Auto-generated method stub
		 return "Actualiza tdcs";
	}
	@RequestMapping(value = "/tdcs", method = RequestMethod.GET)
	public String tdcsGET() {
		// TODO Auto-generated method stub
		 return "Obtiene tdcs";
	}
	@RequestMapping(value = "/tdcs", method = RequestMethod.DELETE)
	public String tdcsDELETE() {
		// TODO Auto-generated method stub
		 return "Borra TDC";
	}
	@RequestMapping(value = "/tdcs", method = RequestMethod.POST)
	public String tdcsPOST() {
		// TODO Auto-generated method stub
		 return "Crea tdcs";
	}
}
