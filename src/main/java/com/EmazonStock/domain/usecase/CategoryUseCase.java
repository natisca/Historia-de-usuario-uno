package com.EmazonStock.domain.usecase;

import com.EmazonStock.domain.api.ICategoryServicePort;
import com.EmazonStock.domain.model.Category;
import com.EmazonStock.domain.spi.ICategoryPersistencePort;

import java.util.ArrayList;
import java.util.List;

public class CategoryUseCase implements ICategoryServicePort {


    private final ICategoryPersistencePort categoryPersistencePort;

    public CategoryUseCase(ICategoryPersistencePort categoryPersistencePort) {
        this.categoryPersistencePort = categoryPersistencePort;
    }

    @Override
    public void saveCategory(Category category) {
        if (categoryPersistencePort.existsByName(category.getName())) {
            throw new IllegalArgumentException("El nombre de la categoría ya existe.");
        }
        categoryPersistencePort.saveCategory(category);
    }

    @Override
    public void deleteCategory(String categoryName) {

    }

    @Override
    public Category getCategory(String categoryName) {
        return null;
    }

    @Override
    public List getAllCategories(Integer page, Integer size) {
        return  categoryPersistencePort.getAllCategories(page,size);
    }

    @Override
    public Category UpdateCategory(Category category) {
        return null;
    }

    public void updateCategory(Category category) {
        if (!categoryPersistencePort.existsByName(category.getName())) {
            throw new IllegalArgumentException("La categoría no existe.");
        }
        categoryPersistencePort.saveCategory(category);
    }


}
