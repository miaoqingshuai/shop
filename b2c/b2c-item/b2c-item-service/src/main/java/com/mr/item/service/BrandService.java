package com.mr.item.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mr.item.mapper.BrandMapper;
import com.mr.pojo.Brand;
import com.mr.utils.PageResult;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class BrandService {

    @Autowired
    private BrandMapper brandMapper;

    public PageResult<Brand> queryBrandPage(

            String key,  Integer page,  Integer rows){

        //根据参数进行分页
        PageHelper.startPage(page,rows);


        //条件查询  用Example
        Example example = new Example(Brand.class);

        if(StringUtils.isNotEmpty(key)){
                //非空判断
            example.createCriteria().andLike("name","%"+key +"%");
        }

        //数据和总条数,都有了
       Page<Brand> pageBrand = (Page) brandMapper.selectByExample(example);
        //返回分页数据
        return  new  PageResult<>(pageBrand.getTotal(),pageBrand.getResult());

    }
}
