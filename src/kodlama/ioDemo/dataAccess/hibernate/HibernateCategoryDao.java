package kodlama.ioDemo.dataAccess.hibernate;
import java.util.ArrayList;
import java.util.List;

import kodlama.ioDemo.dataAccess.abstracts.CategoryDao;
import kodlama.ioDemo.entities.concretes.Category;

public class HibernateCategoryDao implements CategoryDao {

	List<Category> categories = new ArrayList<Category>();
	
	@Override
	public void add(Category category) {

		System.out.println("Kategori Hibernate ile veritabanına eklendi: " + category.getName());

	}

	@Override
	public List<Category> getAll() { // Burada new'lenen Categoriler veritabanından geliyor gibi kabul etmek içindir.
		
		Category category1 = new Category(1,"Programlama");
		
		Category category2 = new Category(2,"Yabancı Dil");
		
		categories.add(category1);
		categories.add(category2);
		return categories;
		
	}

	@Override
	public void update(Category category) {
		
		System.out.println("Kategori Hibernate ile güncellendi: " + category.getName());
		
	}

}
