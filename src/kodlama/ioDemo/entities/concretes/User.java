package kodlama.ioDemo.entities.concretes;

import kodlama.ioDemo.core.entities.Entity;

public class User implements Entity {

	private int id;
	private String firstName;
	private String lastName;
	private String profilePhotoUrl;

	public User(int id, String firstName, String lastName, String profilePhotoUrl) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profilePhotoUrl = profilePhotoUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProfilePhotoUrl() {
		return profilePhotoUrl;
	}

	public void setProfilePhotoUrl(String profilePhotoUrl) {
		this.profilePhotoUrl = profilePhotoUrl;
	}

}
