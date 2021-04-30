import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.uacm.hibernatejpadao.dao.UniversityDAO;
import mx.edu.uacm.hibernatejpadao.entity.University;
import mx.edu.uacm.hibernatejpadao.service.UniversityService;

/**
 * Logica del negocio
 * @author Sergio Mena
 *
 */
@Service
public class UniversityServiceImpl implements UniversityService {
	
	@Autowired
	private UniversityDAO universityDAO;

	@Override
	public List<University> obtenerListadoUniversidades() {
		
		List<University> listado = universityDAO.findAll();
		
	
		
		return null;
	}

}
