package co.grandcircus.Hotel.Search.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import co.grandcircus.Hotel.Search.entity.Hotel;


@Repository
@Transactional

public class HotelDao {

	@PersistenceContext
	private EntityManager em;
	
	public List<Hotel> findAll(){
		return em.createQuery("FROM Hotel", Hotel.class).getResultList();
	}
	
	public List<Hotel> findByCity(String city) {
		// HQL queries can have named parameters, such as :category here.
		// HQL queries use Java class and property names, not SQL table & column names.
		return em.createQuery("FROM Hotel WHERE city = :city", Hotel.class)
				.setParameter("city", city)
				.getResultList();
	}
	
	
	
	
}
