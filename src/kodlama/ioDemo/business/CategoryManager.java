package kodlama.ioDemo.business;

import kodlama.ioDemo.core.logging.interfaces.Logger;
import kodlama.ioDemo.dataAccess.interfaces.CategoryDao;
import kodlama.ioDemo.entities.Category;

public class CategoryManager {

	CategoryDao categoryDao;
	Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {

		this.categoryDao = categoryDao;
		this.loggers = loggers;

	}

	public void add(Category category) throws Exception {

		if (!isCategoryNameExist(category)) {
			System.out.println("Doğrulama Hatası. Çoktan Exception fırlatmış olacak ve bu satıra giremeyecek.");
		}

		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getName());
		}

	}

	public void update(Category category) throws Exception {

		Category[] existCategories = categoryDao.getAll();

		for (Category existCategory : existCategories) {
			if (existCategory.getName() == category.getName()) {

				throw new Exception("Aynı isimde farklı bir kategori kaydedilemez. İşlem başarısız.");

			}
		}

		categoryDao.update(category);

		for (Logger logger : loggers) {
			logger.log(category.getName());
		}

	}

	public boolean isCategoryNameExist(Category category) throws Exception {

		Category[] existCategories = categoryDao.getAll();

		for (Category existCategory : existCategories) {

			if (existCategory.getName() == category.getName()) {

				throw new Exception("Aynı isimde yeni bir kategori kaydedilemez. İşlem başarısız.");

			}
		}
		return true;

	}

}
