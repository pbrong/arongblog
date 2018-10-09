package com.my.blog.website.service;

import com.my.blog.website.modal.Vo.CategoryVo;

import java.util.List;

public interface CategoryService {
    List<CategoryVo> showCategory(String desc, int currentPage);
}
