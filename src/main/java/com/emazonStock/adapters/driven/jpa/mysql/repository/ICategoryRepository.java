package com.emazonStock.adapters.driven.jpa.mysql.repository;

import com.emazonStock.adapters.driven.jpa.mysql.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<CategoryEntity, Long>{


}
