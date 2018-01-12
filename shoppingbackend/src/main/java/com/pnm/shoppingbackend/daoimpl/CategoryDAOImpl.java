package com.pnm.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pnm.shoppingbackend.dao.CategoryDAO;
import com.pnm.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Hoodies");
		category.setDiscription("This is Description for Hoodies");
		category.setImageURL("image1.png");

		categories.add(category);

		/* Second Categories */

		category = new Category();
		category.setId(2);
		category.setName("Tees");
		category.setDiscription("This is Description for Tees");
		category.setImageURL("image2.png");

		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		/* For Each loop */
		for (Category category : categories) {
			if (category.getId() == id)
				return category;
		}
		return null;
	}

}
