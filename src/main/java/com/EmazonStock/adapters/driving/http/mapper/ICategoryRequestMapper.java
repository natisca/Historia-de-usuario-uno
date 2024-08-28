package com.EmazonStock.adapters.driving.http.mapper;




import com.EmazonStock.adapters.driving.http.dto.request.AddCategoryRequest;
import com.EmazonStock.adapters.driving.http.dto.request.UpdateCategoryRequest;
import com.EmazonStock.domain.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface ICategoryRequestMapper {

    @Mapping(target = "id", ignore = true )
    @Mapping(target = "name", constant = "name")
    @Mapping(target = "description", constant = "description")
    Category addRequestToCategory(AddCategoryRequest addCategoryRequest);

    @Mapping(source = "id", target = "id")
    @Mapping(target = "name", constant = "name")
    @Mapping(target = "description", constant = "description")
    Category updateRequestToCategory(UpdateCategoryRequest updateCategoryRequest);



}






