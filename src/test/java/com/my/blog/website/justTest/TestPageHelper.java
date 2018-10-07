package com.my.blog.website.justTest;

import com.github.pagehelper.PageHelper;
import com.my.blog.website.CoreApplication;
import com.my.blog.website.dao.ContentVoMapper;
import com.my.blog.website.modal.Vo.ContentVo;
import com.my.blog.website.modal.Vo.ContentVoExample;
import com.my.blog.website.utils.MapCache;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class)
@WebAppConfiguration
public class TestPageHelper {
    @Autowired
    private ContentVoMapper contentVoMapper;
    @Test
    public void testPageHelper(){
        PageHelper.startPage(0,5);//limit 0,3
        ContentVoExample ex = new ContentVoExample();
        List<ContentVo> contentVos = contentVoMapper.selectByExample(ex);
        //存入缓存，设置过期时间为10s
        MapCache cache = new MapCache();
       // cache.set("contentsJson", GsonUtils.toJsonString(contentVos),10000);
        //读取缓存
        String contentsJson = cache.get("contentsJson");
        System.out.println(contentsJson);
    }
}
