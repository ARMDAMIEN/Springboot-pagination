package fr.formation.inti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import fr.formation.inti.entity.Customer;

public interface CustomerService {
	
	List<Customer> findAll();
	
	Integer saveCustomer(Customer cust);
	
	void UpdateCustomer(Customer cust);
	
	void deleteCustomer(Customer cust);
	
	void deleteCustomer(Integer id);
	
	Optional<Customer> findById(Integer Id);
	
	List<Customer> findByState(String state);

	/**
	 * customer with fedId xxx-xx-xxxx
	 */
	List<Customer> findByFedId();

	List<Customer> findByAddress(String address);
	
	Page<Customer> findPaginated(Integer page, Integer size);
	
	

}
