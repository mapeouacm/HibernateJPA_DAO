package mx.edu.uacm.hibernatejpadao.dao.impl;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import mx.edu.uacm.hibernatejpadao.dao.UniversityDAO;
import mx.edu.uacm.hibernatejpadao.entity.University;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UniversityDAOImplTest {
	
	private static final Logger log = LogManager.getLogger(UniversityDAO.class);
	
	@Autowired
	private UniversityDAO universityDAO;
	
	@Test
	@Order(1)
	public void debeAgregarUniversity() {
		log.debug(">Entrando al metodo debeAgregarUniversity<");
		
		University u = new University();
		u.setName("UACM");
		u.setYear(2021);
		
		universityDAO.add(u);
		
		assertNotNull(u.getId());
		
		
	}
	
	@Test
	@Order(2)
	public void debeObtenerUniversidadesTodas() {
		log.debug("> Entrando al metodo debeObtenerUniversidadesTodas <");
		
		List<University> listado =universityDAO.findAll();
		
		log.debug("Tamanio: " + listado.size());
		
		assertTrue(listado.size() > 0);
		
	}
	
	@Test
	@Order(3)
	public void debeObtenerUniversidadesPorNombre() {
		log.debug("> Entrando al metodo debeObtenerUniversidadesPorNombre <");
		
		List<University> listado =universityDAO.findByName("UACM");
		
		log.debug("Tamanio: " + listado.size());
		
		assertTrue(listado.size() > 0);
		
	}

}
