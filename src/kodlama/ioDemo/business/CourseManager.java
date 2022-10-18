package kodlama.ioDemo.business;

import kodlama.ioDemo.core.logging.interfaces.Logger;
import kodlama.ioDemo.dataAccess.interfaces.CourseDao;
import kodlama.ioDemo.entities.Course;

public class CourseManager {

	CourseDao courseDao;
	Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {

		this.courseDao = courseDao;
		this.loggers = loggers;

	}
	
	public void add(Course course) throws Exception {

		if (!isCourseNameExist(course) && !isCoursePriceCorrect(course)) {
			System.out.println("Doğrulama Hatası. Çoktan Exception fırlatmış olacak ve bu satıra giremeyecek.");
		}

		courseDao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getName());
		}

	}

	public boolean isCourseNameExist(Course course) throws Exception {
		Course[] existCourses = courseDao.getAll();

		for (Course existCourse : existCourses) {

			if (existCourse.getName() == course.getName()) {

				throw new Exception("Aynı isimde farklı bir kurs kaydedilemez. İşlem başarısız.");

			}
		}
		return true;

	}

	public boolean isCoursePriceCorrect(Course course) throws Exception {
		if (course.getPrice() < 0) {
			throw new Exception("Kurs ücreti 0'dan küçük olamaz.");
		}
		return true;

	}

}
