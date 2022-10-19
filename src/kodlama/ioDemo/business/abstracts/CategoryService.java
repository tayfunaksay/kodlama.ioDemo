package kodlama.ioDemo.business.abstracts;

import java.util.List;

import kodlama.ioDemo.entities.concretes.Category;

public interface CategoryService {
	
	void add(Category category) throws Exception;
	void update(Category category) throws Exception;
	List<Category> getAll();
		

}
