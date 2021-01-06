package net.javaguides.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import net.javaguides.springboot.model.Member;
import net.javaguides.springboot.repository.MemberRepository;


@Service
public class MemberService {
	 
	    @Autowired
	    private MemberRepository repo;
	 
	    public List<Member> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(Member std) {
	        repo.save(std);      
	    }
	     
	    public Member get(long id) {
	       return repo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        repo.deleteById(id);
	    }
	 
	}
