package kodlama.ioDemo.entities;

import kodlama.ioDemo.entities.interfaces.Entity;

public class Category implements Entity {
	
	public Category() {
	}

	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
