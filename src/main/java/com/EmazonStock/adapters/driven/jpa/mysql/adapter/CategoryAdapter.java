package com.EmazonStock.adapters.driven.jpa.mysql.adapter;


import com.EmazonStock.adapters.driven.jpa.mysql.entity.CategoryEntity;
import com.EmazonStock.adapters.driven.jpa.mysql.mapper.ICategoryEntityMapper;
import com.EmazonStock.adapters.driven.jpa.mysql.repository.ICategoryRepository;
import com.EmazonStock.domain.model.Category;
import com.EmazonStock.domain.spi.ICategoryPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@RequiredArgsConstructor
public class CategoryAdapter implements ICategoryPersistencePort {

    private final ICategoryRepository categoryRepository;
    private final ICategoryEntityMapper categoryEntityMapper;


    @Override
    public void saveCategory(Category category) {

    }

    @Override
    public boolean existsByName(String name) {
        return false;
    }

    @Override
    public List<Category> getAllCategories(Integer page, Integer size) {
        Pageable pagination = PageRequest.of(page, size);
        List<CategoryEntity> categoryEntities = categoryRepository.findAll(pagination).getContent();
        return categoryEntityMapper.toModelList(categoryEntities);
    }
}
