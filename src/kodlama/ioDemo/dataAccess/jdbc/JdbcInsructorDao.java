package kodlama.ioDemo.dataAccess.jdbc;

import kodlama.ioDemo.dataAccess.abstracts.InstructorDao;
import kodlama.ioDemo.entities.concretes.Instructor;

public class JdbcInsructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Eğitmen JDBC ile veritabanına eklendi: " + instructor.getFirstName()+ " " +instructor.getLastName());
		
	}

}
