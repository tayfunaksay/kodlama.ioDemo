package kodlama.ioDemo.entities.concretes;

public class Instructor extends User {

	
	private String description;
	
	public Instructor(int id, String firstName, String lastName,String profilePhotoUrl, String description) {
		
		super(id,firstName,lastName,profilePhotoUrl);
		this.description =description;

	}
	
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}
