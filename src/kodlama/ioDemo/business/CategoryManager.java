package kodlama.ioDemo.business;

import kodlama.ioDemo.core.logging.interfaces.Logger;
import kodlama.ioDemo.dataAccess.interfaces.CategoryDao;
import kodlama.ioDemo.entities.Category;

public class CategoryManager {

	CategoryDao categoryDao;
	Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao,Logger[] loggers) {

		this.categoryDao = categoryDao;
		this.loggers=loggers;

	}

	public void add(Category category) throws Exception {
		
		//	getAll metodu ile veri tabanından veriler çekiliyor gibi simüle edilmiştir.
		// 	bkz. dataAccess.jdbc.JdbcCategoryDao.java >>getAll()
		
		Category[] existCategories = categoryDao.getAll();
		
		// Kategori isimlerinin var olanlarla karşılaştırılması.
		
		for (Category existCategory : existCategories) {	
			if (existCategory.getName()==category.getName()) {
				throw new Exception("Aynı isimde yeni bir kategori kaydedilemez. İşlem başarısız.");
			}
		}
		
		
		categoryDao.add(category);
		
		
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}


	}

}
