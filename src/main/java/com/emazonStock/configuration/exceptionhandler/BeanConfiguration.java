package com.emazonStock.configuration.exceptionhandler;

import com.emazonStock.adapters.driven.jpa.mysql.adapter.CategoryAdapter;
import com.emazonStock.adapters.driven.jpa.mysql.mapper.ICategoryEntityMapper;
import com.emazonStock.adapters.driven.jpa.mysql.repository.ICategoryRepository;
import com.emazonStock.domain.api.ICategoryServicePort;
import com.emazonStock.domain.spi.ICategoryPersistencePort;
import com.emazonStock.domain.usecase.CategoryUseCase;
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
