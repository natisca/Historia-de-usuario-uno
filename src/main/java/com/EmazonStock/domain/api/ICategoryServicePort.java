package com.EmazonStock.domain.api;

import com.EmazonStock.domain.model.Category;

import java.util.List;

public interface ICategoryServicePort {
  void saveCategory(Category category);

  void deleteCategory(String categoryName);

  Category getCategory(String categoryName);

  List getAllCategories(Integer page, Integer size);

    Category UpdateCategory(Category category);
}
