package accesoDatos.practica2.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import accesoDatos.practica2.daoI.EmpleadoDAOI;
import accesoDatos.practica2.objeto.Empleado;

@Repository
public class EmpleadoDAO implements EmpleadoDAOI {
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public List<Empleado> getEmpleados() {
		String sql = "SELECT * FROM EMP WHERE DEPTNO = 30";
		List<Empleado> empleados = new ArrayList<>();
		empleados.addAll(jdbc.query(sql,new BeanPropertyRowMapper<Empleado>(Empleado.class)));
		return empleados;
	}

}
