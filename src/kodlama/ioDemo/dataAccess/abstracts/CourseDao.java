package kodlama.ioDemo.dataAccess.abstracts;

import java.util.List;

import kodlama.ioDemo.entities.concretes.Course;

public interface CourseDao {
	
	void add(Course course);
	List<Course> getAll();
}
