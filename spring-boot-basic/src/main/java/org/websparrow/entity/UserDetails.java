package org.websparrow.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class UserDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String Uname;
    private String Pass;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	@Override
	public String toString() {
		return "Country [Id=" + Id + ", Uname=" + Uname + ", Pass=" + Pass + "]";
	}
    
	

}
