package com.example.smarthome_jee_1.ws;

import com.example.smarthome_jee_1.bean.Category;
import com.example.smarthome_jee_1.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categories")
public class CategoryWs {

    private CategoryService categoryService;

    public CategoryWs(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("")
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @PostMapping("")
    public int save(Category category) {
        return categoryService.save(category);
    }

    @GetMapping("id/{id}")
    public Optional<Category> findById(Long id) {
        return categoryService.findById(id);
    }

    @DeleteMapping("id/{id}")
    public void deleteById(Long id) {
        categoryService.deleteById(id);
    }

    @DeleteMapping("")
    public void deleteAll() {
        categoryService.deleteAll();
    }
}
