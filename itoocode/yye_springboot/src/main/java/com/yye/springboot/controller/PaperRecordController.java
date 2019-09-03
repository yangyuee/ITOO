package com.yye.springboot.controller;/*
 @auther 杨月娥
 @DESCRIPTION ${DESCRIPTION}
 @create 2019/6/17
*/

import com.dmsdbj.itoo.tool.business.ItooResult;
import com.github.pagehelper.PageInfo;
import com.yye.springboot.entity.PaperRecordEntity;
import com.yye.springboot.service.PaperRecordService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(value = "/papersRecord")
@RestController
public class PaperRecordController {


    @Autowired
    private PaperRecordService paperRecordService;

    @ApiOperation(value = "根据id模糊查询paperRecord")
    @GetMapping(value = {"/queryLikeExamineeId/{id}/{pageNo}/{pageSize}"})
    public ItooResult queryLikeExamineeId(@ApiParam(value = "主键id",required = true)@PathVariable String id,
                                            @ApiParam(name="pageNo",value = "页码",required = true,example = "1")@PathVariable Integer pageNo,
                                          @ApiParam(name = "pageSize",value = "页数",required = true,example = "10") @PathVariable Integer pageSize){
        PageInfo<PaperRecordEntity> pageInfo = paperRecordService.queryLikeExamineeId(id,pageNo,pageSize);
        return ItooResult.build(ItooResult.SUCCESS,"查询成功",pageInfo);
    }
}
