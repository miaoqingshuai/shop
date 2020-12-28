package com.mr.item.controller;

import com.mr.advice.ExceptionEnums;
import com.mr.advice.MrException;
import com.mr.item.service.CateService;
import com.mr.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CateService cateService;

    //返回分类集合  根据pid
    @GetMapping("list")
    public ResponseEntity<List<Category>> list(@RequestParam("pid") Long pid){
          List<Category> list =  cateService.queryCateGoryByPid(pid);

          if(list.size()==0){
              throw new MrException(ExceptionEnums.CATEGORY_LIST_NOT_FOUNT);
          }
            return ResponseEntity.ok(list);
        }

        //删除
       @DeleteMapping("delCate/{id}")
       public  ResponseEntity<Void> delCate(@PathVariable("id") Long id){

        //调用service删除
           cateService.delCate(id);
        //判断是否异常
         return  ResponseEntity.ok(null);

       }


       //新增
       @PostMapping("add")
       public  ResponseEntity<String> add(@RequestBody Category category){
           cateService.addCategory(category);

           return  ResponseEntity.ok("ASDsa");
       }



       //修改
        @PutMapping("edit")
        public ResponseEntity<String> edit(@RequestBody Category category){
           cateService.editCategory(category);
           return  ResponseEntity.ok("sda");
       }
}
