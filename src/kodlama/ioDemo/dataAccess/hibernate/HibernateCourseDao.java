package kodlama.ioDemo.dataAccess.hibernate;

import java.util.ArrayList;
import java.util.List;

import kodlama.ioDemo.dataAccess.abstracts.CourseDao;
import kodlama.ioDemo.entities.concretes.Course;

public class HibernateCourseDao implements CourseDao {


	List<Course> courses = new ArrayList<Course>();
	
	@Override
	public void add(Course course) {

		System.out.println("Kurs Hibernate ile veritabanına eklendi: " + course.getName());
		
	}

	@Override
	public List<Course> getAll() {   // Burada new lenen Course lar veritabanından geliyor gibi kabul etmek içindir.
		
		Course course1 = new Course();
		course1.setName("Java Kampı");
		
		Course course2 = new Course();
		course2.setName("C# Kampı");

		Course course3 = new Course();
		course3.setName("İngilizce Kampı");
		
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		
		return courses;
	}

}
