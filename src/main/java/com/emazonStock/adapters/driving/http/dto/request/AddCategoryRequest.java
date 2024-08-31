package com.emazonStock.adapters.driving.http.dto.request;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AddCategoryRequest {

    private final Long id;
    private final String name;
    private final String description;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
