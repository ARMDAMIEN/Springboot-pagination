package fr.formation.inti.service.impl;

import java.util.List;
import java.util.Optional;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fr.formation.inti.dao.CustomerDao;
import fr.formation.inti.entity.Customer;
import fr.formation.inti.service.CustomerService;



@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerDao customerDao;
 
	@Override
	public List<Customer> findAll() {
		
		return customerDao.findAll();
	}

	@Override
	public Integer saveCustomer(Customer cust) {
		
		return customerDao.save(cust).getCustId();
	}

	@Override
	public void UpdateCustomer(Customer cust) {
		customerDao.save(cust);
		
	}

	@Override
	public void deleteCustomer(Customer cust) {
		customerDao.delete(cust);
		
	}

	@Override
	public void deleteCustomer(Integer id) {
		customerDao.deleteById(id);
		
	}

	@Override
	public Optional<Customer> findById(Integer Id) {
		
		return customerDao.findById(Id);
	}

	@Override
	
	public List<Customer> findByState(String state) {
		
	
		return customerDao.findbyState(state);
	}
	
	
	/**
	 * customer with fedId xxx-xx-xxxx
	 */
	@Override
	public List<Customer> findByFedId() {
		
		return null;
	}

	@Override
	public List<Customer> findByAddress(String address) {
		
		return customerDao.findbyAddress(address);
	}

	@Override
	public Page<Customer> findPaginated(Integer page, Integer size) {
		// TODO Auto-generated method stub
		Pageable pageable = PageRequest.of(page - 1, size);
		 return customerDao.findbyState(pageable);
	}


}
