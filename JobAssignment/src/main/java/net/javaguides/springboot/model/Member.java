package net.javaguides.springboot.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {

	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	    private Long id;
	    private String name;    
	    private LocalDateTime  dob;
	    private String sex;
	    private String email;
	    private String mobile_number;    
	    private int active;
	    private String address;
		public Member() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Member(Long id, String name, LocalDateTime  dob, String sex, String email, String mobile_number, int active,
				String address) {
			super();
			this.id = id;
			this.name = name;
			this.dob = dob;
			this.sex = sex;
			this.email = email;
			this.mobile_number = mobile_number;
			this.active = active;
			this.address = address;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public LocalDateTime  getDob() {
			return dob;
		}
		public void setDob(LocalDateTime  dob) {
			this.dob = dob;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobile_number() {
			return mobile_number;
		}
		public void setMobile_number(String mobile_number) {
			this.mobile_number = mobile_number;
		}
		public int getActive() {
			return active;
		}
		public void setActive(int active) {
			this.active = active;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}    

}