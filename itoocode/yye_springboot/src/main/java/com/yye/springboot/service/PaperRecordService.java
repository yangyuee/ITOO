package com.yye.springboot.service;/*
 @auther 杨月娥
 @DESCRIPTION ${DESCRIPTION}
 @create 2019/6/17
*/

import com.dmsdbj.itoo.tool.base.service.BaseServicePlus;
import com.github.pagehelper.PageInfo;
import com.yye.springboot.entity.PaperRecordEntity;

public interface PaperRecordService extends BaseServicePlus<PaperRecordEntity> {

    PageInfo<PaperRecordEntity> queryLikeExamineeId(String examineeId,Integer pageNo,Integer pageSize);
}
