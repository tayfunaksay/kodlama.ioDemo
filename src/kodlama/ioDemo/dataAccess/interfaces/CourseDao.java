package kodlama.ioDemo.dataAccess.interfaces;

import kodlama.ioDemo.entities.Category;
import kodlama.ioDemo.entities.Course;

public interface CourseDao {
	
	void add(Course course);
	Course[] getAll();
}
