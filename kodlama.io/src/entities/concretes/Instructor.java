package entities.concretes;

import entities.abstracts.Entity;

public class Instructor implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private String authority;
	
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", authority="
				+ authority + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Instructor() {
		super();
	}

	public Instructor(int id, String firstName, String lastName, String authority) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.authority = authority;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAuthority() {
		return authority;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	

}
