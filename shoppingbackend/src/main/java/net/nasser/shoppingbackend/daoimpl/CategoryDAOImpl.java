package net.nasser.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.nasser.shoppingbackend.dao.CategoryDAO;
import net.nasser.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	/*
	 * 
	 * (non-Javadoc)
	 * 
	 * @see net.nasser.shoppingbackend.dao.CategoryDAO#list()
	 * 
	 * dummy list of categories
	 */
	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();

		category.setId(1);
		category.setName("Televission");
		category.setDescription("This is for the televission only");
		category.setImageURL("CAT_1.png");

		categories.add(category);
		// second category
		category = new Category();

		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is for the mobile phones only");
		category.setImageURL("CAT_2.png");

		categories.add(category);

		category = new Category();
		// Third category
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is for the laptop only");
		category.setImageURL("CAT_3.png");

		categories.add(category);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		// enhancehed for loop
		
		for(Category category : categories){
			if (category.getId()==id) return category;
		}
		
		
		
		return null;
	}

}
