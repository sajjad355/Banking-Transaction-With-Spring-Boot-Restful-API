package net.javaguides.springboot.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Account;
import net.javaguides.springboot.model.Report;



@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
 
    @Query(value="SELECT SUM(amount) FROM account",nativeQuery=true)
    double total();
    
    @Query(value="select SUM(amount), name FROM account,member where member.id=account.account_holder GROUP BY account.account_holder,name",nativeQuery=true)
    List<Report> totalbymember();
    
    @Query(value="SELECT COALESCE(SUM(amount), 0)FROM account WHERE transaction_date BETWEEN ?1 AND ?2 ",nativeQuery=true)
    double  mtotal(Date date1,Date date2);
    
    @Query(value="SELECT * FROM account WHERE account_holder=?1",nativeQuery=true)
    List<Account> getaccountbymemberid(long id);
    
    @Query(value="SELECT * FROM account WHERE id=?1",nativeQuery=true)
    Account getaccountbyid(long id);

}