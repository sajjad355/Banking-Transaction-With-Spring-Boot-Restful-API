package net.javaguides.springboot.model;

import java.time.LocalDateTime;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	    private Long id;   
	    private LocalDateTime transaction_date;
	    private LocalDateTime entry_date;
	    private String purpose;
	    private String comment;
	    private double amount;    
	    private Long account_holder;
		public Account() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Account(Long id, LocalDateTime transaction_date, LocalDateTime entry_date, String purpose, String comment, double amount,
				Long account_holder) {
			super();
			this.id = id;
			this.transaction_date = transaction_date;
			this.entry_date = entry_date;
			this.purpose = purpose;
			this.comment = comment;
			this.amount = amount;
			this.account_holder = account_holder;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public LocalDateTime getTransaction_date() {
			return transaction_date;
		}
		public void setTransaction_date(LocalDateTime transaction_date) {
			this.transaction_date = transaction_date;
		}
		public LocalDateTime getEntry_date() {
			return entry_date;
		}
		public void setEntry_date(LocalDateTime entry_date) {
			this.entry_date = entry_date;
		}
		public String getPurpose() {
			return purpose;
		}
		public void setPurpose(String purpose) {
			this.purpose = purpose;
		}
		public String getComment() {
			return comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public Long getAccount_holder() {
			return account_holder;
		}
		public void setAccount_holder(Long account_holder) {
			this.account_holder = account_holder;
		}

}
