package com.emazonStock.adapters.driving.http.dto.response;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CategoryResponse {
    private final Long id;
    private final String name;
    private final String description;

    public CategoryResponse(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
