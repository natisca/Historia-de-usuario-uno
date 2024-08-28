package com.EmazonStock.adapters.driven.jpa.mysql.mapper;

import com.EmazonStock.adapters.driven.jpa.mysql.entity.CategoryEntity;
import com.EmazonStock.domain.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ICategoryEntityMapper {


    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    CategoryEntity toEntity(Category category);
    List<Category> toModelList(List<CategoryEntity> categoryEntities);


    }
