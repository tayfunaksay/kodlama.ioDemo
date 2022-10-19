package kodlama.ioDemo;

import kodlama.ioDemo.business.concretes.CategoryManager;
import kodlama.ioDemo.core.logging.abstracts.Logger;
import kodlama.ioDemo.core.logging.concretes.DatabaseLogger;
import kodlama.ioDemo.core.logging.concretes.FileLogger;
import kodlama.ioDemo.core.logging.concretes.MailLogger;
import kodlama.ioDemo.dataAccess.hibernate.HibernateCategoryDao;
import kodlama.ioDemo.entities.concretes.Category;
import kodlama.ioDemo.entities.concretes.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new FileLogger(),new DatabaseLogger(),new MailLogger()};
		
		
		Category category1 = new Category(10,"Veri Tabanı Yönetimi");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
		categoryManager.update(category1);
		
		System.out.println("-----------------------------------");
		Category category2 = new Category(11,"Programlama"); //Varolan bir kategori:Programlama

		CategoryManager categoryManager2 = new CategoryManager(new HibernateCategoryDao(),loggers);
		categoryManager2.update(category2);
		
		
		
	}

}
