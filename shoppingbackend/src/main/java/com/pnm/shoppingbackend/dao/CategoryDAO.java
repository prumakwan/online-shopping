package com.pnm.shoppingbackend.dao;

import java.util.List;

import com.pnm.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
	
}
