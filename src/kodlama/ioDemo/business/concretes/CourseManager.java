package kodlama.ioDemo.business.concretes;

import java.util.List;

import kodlama.ioDemo.business.abstracts.CourseService;
import kodlama.ioDemo.core.logging.abstracts.Logger;
import kodlama.ioDemo.dataAccess.abstracts.CourseDao;
import kodlama.ioDemo.entities.concretes.Course;

public class CourseManager implements CourseService {

	CourseDao courseDao;
	Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {

		this.courseDao = courseDao;
		this.loggers = loggers;

	}
	
	public void add(Course course) throws Exception {

		if (!isCourseNameExist(course) || !isCoursePriceCorrect(course)) {
			System.out.println("Doğrulama Hatası. Çoktan Exception fırlatmış olacak ve bu satıra giremeyecek.");
		}

		courseDao.add(course);

		for (Logger logger : loggers) {
			
			logger.log(course.getName());
			
		}

	}

	public boolean isCourseNameExist(Course course) throws Exception {
		

		for (Course existCourse : courseDao.getAll()) {

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

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
