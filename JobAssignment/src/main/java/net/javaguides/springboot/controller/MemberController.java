package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.javaguides.springboot.model.Account;
import net.javaguides.springboot.model.Member;
import net.javaguides.springboot.service.MemberService;


@Controller
public class MemberController {
	
	 @Autowired
     private MemberService service;
 
     @RequestMapping(value = "/member", method = RequestMethod.GET)
     public String Members(Model model) 
     {
        List<Member> listmember = service.listAll();
        model.addAttribute("listmember", listmember);
         System.out.print("Get / "); 
         return "index";
     }
     
     @GetMapping("/")
     public String viewHome() 
     {
         return "Home";
     }
     
     @RequestMapping(value = "/savemember", method = RequestMethod.POST)
     public String saveMember(@ModelAttribute("member") Member mem) 
     {
         service.save(mem);
         return "redirect:/member";
     }
     
     @GetMapping("/newmember")
     public String addMember(Model model) 
     {
         model.addAttribute("member", new Member());
         return "newmember";
     }
     
     @RequestMapping("/editmember/{id}")
     public ModelAndView showEditMemberPage(@PathVariable(name = "id") int id) 
     {
         ModelAndView mav = new ModelAndView("newmember");
         Member std = service.get(id);
         mav.addObject("member", std);
         return mav;        
     }
 
     
}
