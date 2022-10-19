package kodlama.ioDemo.dataAccess.abstracts;

import java.util.List;

import kodlama.ioDemo.entities.concretes.Category;

public interface CategoryDao {
	
	void add(Category category);
	List<Category> getAll();
	void update (Category category);

}
