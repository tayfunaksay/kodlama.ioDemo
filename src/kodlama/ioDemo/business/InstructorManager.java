package kodlama.ioDemo.business;

import kodlama.ioDemo.dataAccess.interfaces.InstructorDao;
import kodlama.ioDemo.entities.Instructor;

public class InstructorManager {

	InstructorDao instructorDao;

	public InstructorManager(InstructorDao instructorDao) {

		this.instructorDao = instructorDao;

	}

	public void add(Instructor instructor) {

		instructorDao.add(instructor);

	}

}
