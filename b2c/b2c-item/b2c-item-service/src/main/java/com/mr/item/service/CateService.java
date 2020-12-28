package com.mr.item.service;

import com.mr.item.mapper.CateGoryMapper;
import com.mr.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CateService {

    @Autowired
    private CateGoryMapper cateGoryMapper;

    //根据pid查询数据
    public List<Category> queryCateGoryByPid(Long pid) {
        Category category = new Category();
        category.setParentId(pid);
        return cateGoryMapper.select(category);
    }

    //删除
    public void delCate(Long id) {

        cateGoryMapper.deleteByPrimaryKey(id);
    }

    //新增
    public void addCategory(Category category) {
        cateGoryMapper.insertSelective(category);
    }

    //修改
    public void editCategory(Category category) {
        cateGoryMapper.updateByPrimaryKeySelective(category);
    }

}
