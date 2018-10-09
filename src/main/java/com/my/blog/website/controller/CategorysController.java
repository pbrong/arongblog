package com.my.blog.website.controller;

import com.my.blog.website.modal.Vo.CategoryVo;
import com.my.blog.website.service.CategoryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategorysController {
    @Autowired
    private CategoryService categoryService;


    @RequestMapping(value="/index/showCategorys")
    public String showCategory(String desc,int currentPage, Model model) {
        if (desc != null && StringUtils.isNotBlank(desc)) {
            //desc不为空
            List<CategoryVo> categorys = categoryService.showCategory(desc,currentPage);
            model.addAttribute("categorys", categorys);
            model.addAttribute("currentPage",currentPage);
            model.addAttribute("cateNum",categorys.size());
            return "themes/default/category-show";
        }else{
            throw  new RuntimeException();
        }
    }
}
