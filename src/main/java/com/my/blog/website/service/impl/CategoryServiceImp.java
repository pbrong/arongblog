package com.my.blog.website.service.impl;

import com.github.pagehelper.PageHelper;
import com.my.blog.website.dao.MetaVoMapper;
import com.my.blog.website.modal.Vo.CategoryVo;
import com.my.blog.website.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    private MetaVoMapper metaVoMapper;

    //首页 查询文章目录
    @Transactional
    @Override
    public List<CategoryVo> showCategory(String desc, int currentPage) {
        if(desc.equals("0")){
            //查询全部
            PageHelper.startPage(currentPage,9);
            List<CategoryVo> categoryVos = metaVoMapper.selectAll();
            return categoryVos;
        }else{
            //TODO 根据目录id查询相应目录
            return null;
        }
    }
}
