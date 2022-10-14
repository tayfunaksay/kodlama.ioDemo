package kodlama.ioDemo;

import kodlama.ioDemo.business.CategoryManager;
import kodlama.ioDemo.core.logging.DatabaseLogger;
import kodlama.ioDemo.core.logging.FileLogger;
import kodlama.ioDemo.core.logging.MailLogger;
import kodlama.ioDemo.core.logging.interfaces.Logger;
import kodlama.ioDemo.dataAccess.hibernate.HibernateCategoryDao;
import kodlama.ioDemo.entities.Category;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new FileLogger(),new DatabaseLogger(),new MailLogger()};
		
		
		Category category1 = new Category(10,"Veri Tabanı Yönetimi");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
		categoryManager.add(category1);
		
		
		Category category2 = new Category(11,"Programlama");

		CategoryManager categoryManager2 = new CategoryManager(new HibernateCategoryDao(),loggers);
		categoryManager2.add(category2);
		
		
	}

}
