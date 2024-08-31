package com.emazonStock.domain.model;

import com.emazonStock.adapters.driven.jpa.mysql.entity.CategoryEntity;

public interface CategoryModel {
    CategoryEntity Entity(Category category);
}
