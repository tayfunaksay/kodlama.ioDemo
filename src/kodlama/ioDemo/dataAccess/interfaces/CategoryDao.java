package kodlama.ioDemo.dataAccess.interfaces;

import kodlama.ioDemo.entities.Category;

public interface CategoryDao {
	
	void add(Category category);
	Category[] getAll();
	void update (Category category);

}
