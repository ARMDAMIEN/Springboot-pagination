package fr.formation.inti.dao;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.formation.inti.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{
	
	@Query("SELECT c FROM Customer as c where c.state =:state")
	List<Customer> findbyState(String state);
	
	@Query("SELECT c FROM Customer as c where c.state =:state")
	Page<Customer> findbyState(Pageable page);
	
	
	
	@Query("SELECT c FROM Customer c where c.address =:address")
	List <Customer> findbyAddress(@Param("address")String address);

	
	@Query("SELECT c FROM Customer c where c.fedId =:fedId")
	List <Customer> findbyfedId(@Param("fedId")String fedId);

}


