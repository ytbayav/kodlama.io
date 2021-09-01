package entities.concretes;

import entities.abstracts.Entity;

public class Category implements Entity{
	
	private int id;
	private String name;
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}

	public Category() {
		super();
	}

	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
