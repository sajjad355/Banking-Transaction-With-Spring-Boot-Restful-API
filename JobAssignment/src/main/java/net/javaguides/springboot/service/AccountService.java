package net.javaguides.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import net.javaguides.springboot.model.Account;
import net.javaguides.springboot.model.Report;
import net.javaguides.springboot.repository.AccountRepository;



@Service
public class AccountService {
	 
	    @Autowired
	    private AccountRepository repo;
	 
	    public List<Account> listAll() 
	    {
	        return repo.findAll();
	    }
	    
	    public List<Report> totalbymember()
	    {
	    	return repo.totalbymember();
	    }
	     
	    public void save(Account std) 
	    {
	        repo.save(std);
	    }
	    
	    public double total() 
	    {
	    	return repo.total();   
	    }
	  
	    public double  mtotal(Date date1, Date date2) 
	    {
	     	return repo.mtotal(date1,date2);    
	    }
	   
        public List<Account> getaccountbymemberid(long id)
        {
	        return repo.getaccountbymemberid(id);
        }
        
	    public Account get(long id) 
	    {	
	        return repo.findById(id).get(); 
	    }
	    
        public Account getaccountbyid(long id)
        {
	        return repo.getaccountbyid(id);
        }
	     
	    public void delete(long id) 
	    {
	        repo.deleteById(id);
	    }
	    
	 
	}
