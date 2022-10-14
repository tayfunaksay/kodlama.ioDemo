package kodlama.ioDemo.dataAccess.hibernate;

import kodlama.ioDemo.dataAccess.interfaces.CourseDao;
import kodlama.ioDemo.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {

		System.out.println("Kurs Hibernate ile veritabanına eklendi: " + course.getName());
		
	}

	@Override
	public Course[] getAll() {   // Burada new lenen Course lar veritabanından geliyor gibi kabul etmek içindir.
		
		Course course1 = new Course();
		course1.setName("Java Kampı");
		
		Course course2 = new Course();
		course2.setName("C# Kampı");

		Course course3 = new Course();
		course3.setName("İngilizce Kampı");
		
		Course[] courses = new Course[] {course1,course2,course3};

		
		return courses;
	}

}
