package com.emazonStock.adapters.driving.http.controller;

import com.emazonStock.adapters.driving.http.dto.request.AddCategoryRequest;
import com.emazonStock.adapters.driving.http.dto.request.UpdateCategoryRequest;
import com.emazonStock.adapters.driving.http.dto.response.CategoryResponse;
import com.emazonStock.adapters.driving.http.mapper.ICategoryRequestMapper;
import com.emazonStock.adapters.driving.http.mapper.ICategoryResponseMapper;
import com.emazonStock.domain.api.ICategoryServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryRestControllerAdapter {
    private final ICategoryServicePort categoryServicePort;
    private final ICategoryRequestMapper categoryRequestMapper;
    private final ICategoryResponseMapper categoryResponseMapper;


    @PostMapping("/")
    public ResponseEntity<Void> addCategory(@RequestBody AddCategoryRequest request) {
        categoryServicePort.saveCategory(categoryRequestMapper.addRequestToCategory(request));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/search/{categoryName}")
    public ResponseEntity<CategoryResponse> getCategory(@PathVariable String categoryName) {
        return ResponseEntity.ok(categoryResponseMapper.toCategoryResponse(categoryServicePort.getCategory(categoryName)));
    }

    @GetMapping("")
    public ResponseEntity<List<CategoryResponse>> getAllCategories(@RequestParam Integer page, @RequestParam Integer size) {
        return ResponseEntity.ok(categoryResponseMapper.
                toCategoryresonseList(categoryServicePort.getAllCategories(page, size)));
    }

    @PutMapping("/")
    public ResponseEntity<CategoryResponse> updateCategory(@RequestBody UpdateCategoryRequest request) {
        return ResponseEntity.ok(categoryResponseMapper.toCategoryResponse(
                categoryServicePort.UpdateCategory(categoryRequestMapper.updateRequestToCategory(request))));
    }


    @DeleteMapping("/{categoryName}")
    public ResponseEntity<Void> deleteCategory(@PathVariable String categoryName) {
        categoryServicePort.deleteCategory(categoryName);
        return ResponseEntity.status(HttpStatus.OK).build();
    }








}


