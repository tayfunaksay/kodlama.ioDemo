package kodlama.ioDemo.dataAccess.jdbc;

import kodlama.ioDemo.dataAccess.interfaces.CategoryDao;
import kodlama.ioDemo.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {

		System.out.println("Kategori JDBC ile veritabanına eklendi: " + category.getName());

	}
	
	@Override
	public Category[] getAll() {  // Burada new lenen Categoriler veritabanından geliyor gibi kabul etmek içindir.
		
		Category category1 = new Category();
		category1.setName("Programlama");
		
		Category category2 = new Category();
		category2.setName("Yabancı Dil");
		
		Category[] categories = new Category[] {category1,category2};
		
		return categories;

		
	}

}
