package com.example.bookmanagementservice.controller;


import com.example.bookmanagementservice.controller.view.CategoryForm;
import com.example.bookmanagementservice.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.bookmanagementservice.services.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    public CategoryService categoryService;

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }
    @PostMapping("/create")
    public Category addCategory(@RequestBody CategoryForm category) {
        return categoryService.addCategory(category);
    }
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }
}
