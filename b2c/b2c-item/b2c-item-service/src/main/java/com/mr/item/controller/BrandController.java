package com.mr.item.controller;

import com.github.pagehelper.Page;
import com.mr.item.service.BrandService;
import com.mr.pojo.Brand;
import com.mr.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

     @GetMapping("page")
    public ResponseEntity< PageResult<Brand>> querBrandPage(
             //分页加条件
              @RequestParam("key") String key,
              @RequestParam("page") Integer page,
              @RequestParam("rows")   Integer rows

     ){
         PageResult<Brand> pageBrand =   brandService.queryBrandPage(key,page,rows);
         System.out.println("ssssssssssssssssssss");
         return ResponseEntity.ok(pageBrand);
     }
}
