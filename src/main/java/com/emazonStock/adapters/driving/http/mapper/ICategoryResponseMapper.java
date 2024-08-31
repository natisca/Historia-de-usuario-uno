package com.emazonStock.adapters.driving.http.mapper;

import com.emazonStock.adapters.driving.http.dto.response.CategoryResponse;

import com.emazonStock.domain.model.Category;
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
