package com.lee.photo.controller;


import com.lee.photo.pojo.Result;
import com.lee.photo.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
@Api(tags = "用户管理相关接口")
public class UserController {

    @GetMapping("/findById/{id}")
    @ApiOperation("根据id查询用户的接口")
//    @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "1", required = true)
    public Result findById(@PathVariable("id") int id){
        return ResultUtil.success(null,null);
    }

}
