package com.EmazonStock.domain.model;

import com.EmazonStock.adapters.driven.jpa.mysql.entity.CategoryEntity;

public interface CategoryModel {
    CategoryEntity Entity(Category category);
}
