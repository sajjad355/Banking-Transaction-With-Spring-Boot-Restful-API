package net.javaguides.springboot.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Report {
	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	    private String name;   
	    private double Totalamount;
		public Report() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Report(String name, double totalamount) {
			super();
			this.name = name;
			Totalamount = totalamount;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getTotalamount() {
			return Totalamount;
		}
		public void setTotalamount(double totalamount) {
			Totalamount = totalamount;
		}
	    
}
