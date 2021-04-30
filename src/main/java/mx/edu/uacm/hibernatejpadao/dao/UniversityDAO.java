package mx.edu.uacm.hibernatejpadao.dao;

import java.util.List;

import mx.edu.uacm.hibernatejpadao.entity.University;

public interface UniversityDAO {

	/**
	 * Metodo para obtener la entidad University por el id
	 * @param universityId
	 * @return
	 */
	University findById(Long universityId);
	
	
	/**
	 * Metoto utilizado la obtener todas las entidades university
	 * @return un listado de universidades
	 */
	List<University> findAll();
	
	
	void add (University university);
	
	void update (University university);
	
	void delete (University university);
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	List<University> findByName(String name);
	
	/**
	 * 
	 * @param name
	 * @param year
	 * @return
	 */
	List<University> search(String name, Integer year);
	
	
}
