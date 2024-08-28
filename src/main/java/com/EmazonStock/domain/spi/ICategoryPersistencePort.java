package com.EmazonStock.domain.spi;

import com.EmazonStock.domain.model.Category;

import java.util.List;

public interface ICategoryPersistencePort {
    void saveCategory(Category category);

    boolean existsByName(String name);

    List<Category> getAllCategories(Integer page, Integer size);
}
