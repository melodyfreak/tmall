package com.ykjb.tmall.service.impl;

import com.ykjb.tmall.mapper.CategoryMapper;

import com.ykjb.tmall.pojo.Category;
import com.ykjb.tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CategoryServiceImpl  implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    public List<Category> list(){
        return categoryMapper.list();
    }

}