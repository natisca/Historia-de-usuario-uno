package com.EmazonStock.domain.model;



import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class Category {

    // Getters and setters
    private Long id;
    private String name;
    private String description;

    public Category(Long id, String name, String description) {
        if (name == null || name.isEmpty() || name.length() > 50) {
            throw new IllegalArgumentException("El nombre debe ser no nulo, no vacío y de hasta 50 caracteres.");
        }
        if (description == null || description.isEmpty() || description.length() > 90) {
            throw new IllegalArgumentException("La descripción debe ser no nula, no vacía y de hasta 90 caracteres.");
        }
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {return id;}
    public String getName() {return name;}
    public String getDescription() {return description;}




}
