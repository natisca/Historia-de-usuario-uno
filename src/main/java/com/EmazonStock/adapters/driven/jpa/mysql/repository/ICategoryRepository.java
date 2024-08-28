package com.EmazonStock.adapters.driven.jpa.mysql.repository;

import com.EmazonStock.adapters.driven.jpa.mysql.entity.CategoryEntity;
import com.EmazonStock.domain.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICategoryRepository extends JpaRepository<CategoryEntity, Long>{


}
