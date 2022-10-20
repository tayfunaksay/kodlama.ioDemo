package kodlama.ioDemo.business.concretes;

import java.util.List;

import kodlama.ioDemo.business.abstracts.CategoryService;
import kodlama.ioDemo.core.logging.abstracts.Logger;
import kodlama.ioDemo.dataAccess.abstracts.CategoryDao;
import kodlama.ioDemo.entities.concretes.Category;

public class CategoryManager implements CategoryService {

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

		
		if (!isCategoryNameExist(category)) {
			System.out.println("Doğrulama Hatası. Çoktan Exception fırlatmış olacak ve bu satıra giremeyecek.");
		}

		categoryDao.update(category);

		for (Logger logger : loggers) {
			logger.log(category.getName());
		}

	}

	public boolean isCategoryNameExist(Category category) throws Exception {
		
		

		for (Category existCategory : categoryDao.getAll()) {

			if (existCategory.getName() == category.getName()) {

				throw new Exception("Aynı isimde yeni bir kategori kaydedilemez. İşlem başarısız.");

			}
		}
		return true;

	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
