package com.EmazonStock.adapters.driving.http.mapper;

import com.EmazonStock.adapters.driven.jpa.mysql.entity.CategoryEntity;
import com.EmazonStock.adapters.driving.http.dto.response.CategoryResponse;

import com.EmazonStock.domain.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ICategoryResponseMapper {
    @Mapping(source ="id",target="id")
    @Mapping(source = "name", target = "name")
    CategoryResponse toCategoryResponse(Category category);
    List<CategoryResponse> toCategoryresonseList(List<Category>categories);



}
