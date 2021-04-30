package mx.edu.uacm.hibernatejpadao.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mx.edu.uacm.hibernatejpadao.dao.UniversityDAO;
import mx.edu.uacm.hibernatejpadao.entity.University;

@Transactional
@Repository
public class UniversityDAOImpl implements UniversityDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public University findById(Long universityId) {
		
		return em.find(University.class, universityId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<University> findAll() {
		
		String hql = "FROM University as u ORDER BY u.id";
		
		return (List<University>) em.createQuery(hql).getResultList();
	}

	@Override
	public void add(University university) {
		em.persist(university);
		em.flush();

	}

	@Override
	public void update(University university) {
		em.persist(university);
		em.flush();

	}

	@Override
	public void delete(University university) {
		em.remove(university);
		em.flush();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<University> findByName(String name) {
		String hql = "select u FROM University u where u.name like :name";
		
		return (List<University>)em.createQuery(hql)
				.setParameter("name", "%" + name + "%").getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<University> search(String name, Integer year) {
		String hql = "FROM University as u where u.name = ? and u.year = ?";
		
		return (List<University>)em.createQuery(hql)
				.setParameter(1, name)
				.setParameter(2, year)
				.getResultList();
	}

}
