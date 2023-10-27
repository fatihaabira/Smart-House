package com.example.smarthome_jee_1.service;

import com.example.smarthome_jee_1.bean.Category;
import com.example.smarthome_jee_1.dao.CategoryDAO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoryService {
    private CategoryDAO categoryDAO;

    public List<Category> findAll() {
        return categoryDAO.findAll();
    }

    public int save(Category category) {
        if(category == null) return -1;
        else{
            categoryDAO.save(category);
        }
        return 1;
    }


    public Optional<Category> findById(Long aLong) {
        return categoryDAO.findById(aLong);
    }

    public void deleteById(Long aLong) {
        categoryDAO.deleteById(aLong);
    }

    public void deleteAll() {
        categoryDAO.deleteAll();
    }

    public CategoryService(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }
}
