package accesoDatos.practica2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import accesoDatos.practica2.objeto.Empleado;

import accesoDatos.practica2.serviceI.EmpleadoServiceI;

@RestController
@RequestMapping(path = "/mochonSL")
public class EmpleadoController {
	@Autowired
	EmpleadoServiceI epmleadoService;
	
	@GetMapping("/empleados")
	public List<Empleado> empleados() {
		return epmleadoService.getEmpleados();
	}
}
