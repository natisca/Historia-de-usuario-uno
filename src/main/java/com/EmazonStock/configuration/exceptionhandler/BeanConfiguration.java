package com.EmazonStock.configuration.exceptionhandler;

import com.EmazonStock.adapters.driven.jpa.mysql.adapter.CategoryAdapter;
import com.EmazonStock.adapters.driven.jpa.mysql.mapper.ICategoryEntityMapper;
import com.EmazonStock.adapters.driven.jpa.mysql.repository.ICategoryRepository;
import com.EmazonStock.domain.api.ICategoryServicePort;
import com.EmazonStock.domain.spi.ICategoryPersistencePort;
import com.EmazonStock.domain.usecase.CategoryUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class BeanConfiguration {
   private final ICategoryRepository categoryRepository;
   private final ICategoryEntityMapper categoryEntityMapper;

   @Bean
    public ICategoryPersistencePort categoryPersistencePort() {
         return new CategoryAdapter(categoryRepository, categoryEntityMapper);
    }
    @Bean
    public ICategoryServicePort categoryServicePort() {
        return new CategoryUseCase(categoryPersistencePort());
    }



}
