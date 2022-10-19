package kodlama.ioDemo.business.concretes;

import kodlama.ioDemo.business.abstracts.InstructorService;
import kodlama.ioDemo.dataAccess.abstracts.InstructorDao;
import kodlama.ioDemo.entities.concretes.Instructor;

public class InstructorManager implements InstructorService {

	InstructorDao instructorDao;

	public InstructorManager(InstructorDao instructorDao) {

		this.instructorDao = instructorDao;

	}

	public void add(Instructor instructor) {

		instructorDao.add(instructor);

	}

}
