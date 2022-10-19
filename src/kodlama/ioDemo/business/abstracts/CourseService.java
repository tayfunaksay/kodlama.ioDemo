package kodlama.ioDemo.business.abstracts;

import java.util.List;

import kodlama.ioDemo.entities.concretes.Course;

public interface CourseService {
	
	void add(Course course) throws Exception;
	List<Course> getAll();

}
