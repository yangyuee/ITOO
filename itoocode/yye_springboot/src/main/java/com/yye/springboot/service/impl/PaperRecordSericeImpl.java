package com.yye.springboot.service.impl;/*
 @auther 杨月娥
 @DESCRIPTION ${DESCRIPTION}
 @create 2019/6/17
*/

import com.dmsdbj.itoo.tool.base.service.impl.BaseServicePlusImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yye.springboot.dao.PaperRecordDao;
import com.yye.springboot.entity.PaperRecordEntity;
import com.yye.springboot.service.PaperRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("paperRecordService")
public class PaperRecordSericeImpl extends BaseServicePlusImpl<PaperRecordDao,PaperRecordEntity> implements PaperRecordService  {
    @Autowired
    private  PaperRecordDao paperRecordDao;
    @Override
    public PageInfo<PaperRecordEntity> queryLikeExamineeId(String examineeId, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        return new PageInfo<>(paperRecordDao.queryLikeExamineeId(examineeId));
    }
}
