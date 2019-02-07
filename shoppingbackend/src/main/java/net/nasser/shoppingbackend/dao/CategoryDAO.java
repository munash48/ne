package net.nasser.shoppingbackend.dao;

import java.util.List;
import net.nasser.shoppingbackend.dto.Category;
public interface CategoryDAO {

	List<Category> list();
	
	Category get (int id);
	
	
	
}
