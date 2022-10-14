package kodlama.ioDemo.entities;

public class Course {

	public Course() {

	}
	

	public Course(int id, int instructorId,int categoryId, String name, String description, double price) {
		
		this.id = id;
		this.instructorId = instructorId;
		this.setCategoryId(categoryId);
		this.name = name;
		this.description = description;
		this.price = price;
	}



	private int id;
	private int instructorId;
	private int categoryId;
	private String name;
	private String description;
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
