package com.emazonStock.adapters.driving.http.mapper;

import com.emazonStock.adapters.driving.http.dto.request.AddCategoryRequest;
import com.emazonStock.adapters.driving.http.dto.request.UpdateCategoryRequest;
import com.emazonStock.domain.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface ICategoryRequestMapper {

    @Mapping(target = "id",source = "id", ignore = true )
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    Category addRequestToCategory(AddCategoryRequest addCategoryRequest);

    @Mapping(source = "id", target = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    Category updateRequestToCategory(UpdateCategoryRequest updateCategoryRequest);



}






