package com.kilopo.tryshop.service.interfaces;

import com.kilopo.tryshop.entity.Category;
import com.kilopo.tryshop.entity.Producer;

import java.util.List;

public interface CategoryService {

    boolean addFromFile(String path);
    List<Category> getAllCategories();
    Category getCategoryById(long id);
    boolean addCategory(Category category);
    boolean deleteCategory(long id);
    boolean updateFromFile(String path);


}
