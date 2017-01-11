package com.kilopo.tryshop.service;

import com.kilopo.tryshop.entity.Category;
import com.kilopo.tryshop.repository.CategoryRepository;
import com.kilopo.tryshop.service.interfaces.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public boolean addFromFile(String path) {
        File file = new File(path);
        Category category;

        String s;
        String[] sm;

        try {
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                while ((s = in.readLine()) != null) {
                    sm = s.split(",");
                    category = new Category();
                    category.setName(sm[0]);
                    categoryRepository.save(category);
                }

            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public boolean updateFromFile(String path) {
        File file = new File(path);
        Category category;

        String s;
        String[] sm;

        try {
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                while ((s = in.readLine()) != null) {
                    sm = s.split(",");
                    category = new Category();
                    category.setId(Long.parseLong(sm[0]));
                    category.setName(sm[1]);
                    categoryRepository.saveAndFlush(category);
                }

            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(long id) {
        return categoryRepository.findOne(id);
    }

    public boolean addCategory(Category category) {
        categoryRepository.saveAndFlush(category);
        return true;
    }

    public boolean deleteCategory(long id) {
        categoryRepository.delete(id);
        return true;
    }
}
