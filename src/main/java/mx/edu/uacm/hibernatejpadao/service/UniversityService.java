package mx.edu.uacm.hibernatejpadao.service;

import java.util.List;

import mx.edu.uacm.hibernatejpadao.entity.University;

public interface UniversityService {
	
	/**
	 * metodo utilizado para obtener un listado de universidades
	 * @return
	 */
	List<University> obtenerListadoUniversidades();

}
