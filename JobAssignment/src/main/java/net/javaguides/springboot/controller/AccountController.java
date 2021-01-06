package net.javaguides.springboot.controller;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.javaguides.springboot.model.Account;
import net.javaguides.springboot.model.Member;
import net.javaguides.springboot.model.Report;
import net.javaguides.springboot.repository.AccountRepository;
import net.javaguides.springboot.service.AccountService;
import net.javaguides.springboot.service.MemberService;


@Controller
public class AccountController {
	
	 @Autowired
     private AccountService service;
     private MemberService Mservice;
	 @Autowired
	 private AccountRepository repo;

 
     @RequestMapping(value = "/account", method = RequestMethod.GET)
     public String AllAccounts(Model model) 
     {
         List<Account> listaccount = service.listAll();
         model.addAttribute("listaccount", listaccount);
         return "account";
     }
          
     @GetMapping("/new")
     public String addAccount(Model model) 
     {
         List<Account> listaccount = service.listAll();
         model.addAttribute("listaccount", listaccount);
         model.addAttribute("account", new Account());
         return "NewAccount";
     }
     
     @RequestMapping(value = "/save", method = RequestMethod.POST)
     public String saveAccount(@ModelAttribute("account") Account acc) 
     {
         service.save(acc);
         return "redirect:/account";
     }
 
     @RequestMapping("/edit/{id}")
     public ModelAndView EditAccount(@PathVariable(name = "id") int id) 
     {
         ModelAndView mav = new ModelAndView("EditAccount");
         Account std = service.get(id);
         mav.addObject("account", std);
         return mav;        
     }
     
     @RequestMapping("/delete/{id}")
     public String deleteAccount(@PathVariable(name = "id") int id) 
     {
         service.delete(id);
         return "redirect:/account";
     }
     
     @RequestMapping(value = "/accounts", method = RequestMethod.GET)
     public String viewOneAccountbyid(Model model,@RequestParam(defaultValue="") int id) 
     {
         Account listaccount =  service.getaccountbyid(id);
         model.addAttribute("listaccount", listaccount);
         return "account";
     }
     
     @RequestMapping(value = "/maccounts", method = RequestMethod.GET)
     public String viewAccountbyMember(Model model,@RequestParam(defaultValue="") int id) 
     {
    	 List<Account> listaccount = service.getaccountbymemberid(id);
         model.addAttribute("listaccount", listaccount);
         return "account";
     }
     
     @GetMapping("/report")
     public String total(Model model) 
     {
         double totalcost= service.total();
         model.addAttribute("totalcost", totalcost);
         return "report";
     }
     
     @RequestMapping(value = "/tsreport", method = RequestMethod.GET)
     public String totalbymember(Model model) 
     {
        List<Report> totalbymemberid = service.totalbymember();
        model.addAttribute("totalbymemberid", totalbymemberid);
        return "report";
     }
       
     @GetMapping("/mreport")
     public String mtotal(Model model,@RequestParam(defaultValue="") String sDate,@RequestParam(defaultValue="") String eDate) throws ParseException 
      {
         SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
         Date date1 = sd.parse(sDate);
         Date date2 = sd.parse(eDate);
         double Mtotal= repo.mtotal( date1 ,  date2);
         model.addAttribute("Mtotal", Mtotal);
         double totalcost= service.total();
         model.addAttribute("totalcost", totalcost);
         return "report";
     }
     
}
