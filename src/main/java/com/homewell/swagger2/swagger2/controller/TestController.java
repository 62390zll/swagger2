package com.homewell.swagger2.swagger2.controller;

import io.swagger.annotations.*;

import com.homewell.swagger2.swagger2.model.RestMessage;

import org.springframework.web.bind.annotation.*;

/**
 * Created by chendai on 2018/3/19.
 */
@RestController
@Api("swaggerTestController相关api")
public class TestController {

    /**
     * Restful Get请求测试
     */
    @ApiOperation(value = "根据id查询学生的信息", notes = "查询数据库中某个学生的信息")
    @ApiImplicitParam(name = "id", value = "学生id", paramType = "path", required = true, dataType = "String")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户id", dataType = "String", paramType = "query", example = "1112") })
    @ApiResponses({ @ApiResponse(code = 400, message = "请求参数没有填好"), @ApiResponse(code = 404, message = "请求路径没有找到") })
    @GetMapping(value = "testRest/{id}")
    public RestMessage testGetResetful(@PathVariable String id) {
        RestMessage RestMessage = new RestMessage();
        System.out.println(id);
        return RestMessage;
    }

}