package kodlama.ioDemo.dataAccess.jdbc;

import java.util.List;

import kodlama.ioDemo.dataAccess.abstracts.CategoryDao;
import kodlama.ioDemo.entities.concretes.Category;

public class JdbcCategoryDao implements CategoryDao {
	
	List<Category> categories;	

	@Override
	public void add(Category category) {

		System.out.println("Kategori JDBC ile veritabanına eklendi: " + category.getName());

	}
	
	@Override
	public List<Category> getAll() {  // Burada new lenen Categoriler veritabanından geliyor gibi kabul etmek içindir.
		
		Category category1 = new Category();
		category1.setName("Programlama");
		
		Category category2 = new Category();
		category2.setName("Yabancı Dil");
		
		categories.add(category1);
		categories.add(category2);
		
		return categories;

		
	}
	
	@Override
	public void update(Category category) {
		
		System.out.println("Kategori JDBC ile güncellendi: " + category.getName());
		
	}

}
