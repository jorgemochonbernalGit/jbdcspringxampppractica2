package accesoDatos.practica2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import accesoDatos.practica2.daoI.EmpleadoDAOI;
import accesoDatos.practica2.objeto.Empleado;
import accesoDatos.practica2.serviceI.EmpleadoServiceI;

@Repository
public class EmpleadoService implements EmpleadoServiceI {
	@Autowired
	EmpleadoDAOI empleadoDAO;

	@Override
	public List<Empleado> getEmpleados() {
		return empleadoDAO.getEmpleados();
	}
}
