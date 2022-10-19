package kodlama.ioDemo.dataAccess.hibernate;

import kodlama.ioDemo.dataAccess.abstracts.InstructorDao;
import kodlama.ioDemo.entities.concretes.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Eğitmen Hibernate ile veritabanına eklendi: " + instructor.getFirstName()+ " " +instructor.getLastName());
		
	}

}
