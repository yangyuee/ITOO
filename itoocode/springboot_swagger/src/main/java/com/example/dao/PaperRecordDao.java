package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dmsdbj.itoo.tool.redis.CacheExpire;
//import com.tfjybj.itoo.exam.model.*;
import entity.PaperRecordEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * PaperRecordDao接口
 * paperRecord表
 *
 * @author 任晓帅
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 19:40:28
 */
@Repository("paperRecordDao")
public interface PaperRecordDao extends BaseMapper<PaperRecordEntity> {

    //region 模板生成：模糊查询

    /**
     * 根据考生_id模糊查询paperRecord
     *
     * @param examineeId 考生_id
     * @return 模糊查询的paperRecord集合
     * @author 任晓帅
     * @since 2.0.0 2018-11-15 19:40:28
     */
    List<PaperRecordEntity> queryLikeExamineeId(@Param("examineeId") String examineeId);
    //endregion


    /**
     * 根据学生id和试卷id查询小题详情
     *
     * @return 返回根据学生id和试卷id查出小题的详情
     * @author maying
     * @since 2018-11-27 08:10:38
     */
    List<PaperRecordEntity> selStuDetails(@Param("examineeId") String examineeId, @Param("templateId") String templateId);

    /**
     * 插入答题记录
     *
     * @param recordEntityList 试卷记录实体集合
     * @return 判断是否成功标识
     * @author 杨楠
     * @since 2.0.0 2018-11-23 19:40:28
     */
    int insertAllPaperRecord(@Param("recordEntityList") List<PaperRecordEntity> recordEntityList, @Param("examineeId") String examineeId, @Param("examinationId") String examinationId);

    /**
     * 查询学生答案
     *
     * @param examineeId 考考生id
     * @param templateId 试卷记录实体集合
   //  * @param courseId   课程id
     * @return 判断是否成功标识
     * @author 王雪芬
     * @since 2.0.0 2018-11-23 19:40:28
     */
    @Cacheable(value = "queryRecordStudentAnswer", unless = "#result == null")
    @CacheExpire(expire = 120)

    /**
     * 查询每个抽到错题的考生答题记录主键id
     *
     * @param examineeId      答题记录的Id
     * @param templateId      新题的id
     * @param wrongQuestionId 答题记录的Id
     * @author 任蒙蒙
     * @since 2.0.0 2018-11-17 17:10:28
     */
    PaperRecordEntity selectPaperRecordId(@Param("examineeId") String examineeId, @Param("templateId") String templateId, @Param("wrongQuestionId") String wrongQuestionId);


    List<String> queryPaperRecordId(@Param("examineeId") String examineeId, @Param("examinationId") String examinationId);

  /*  *//**
     * 查询考试所有试题的正确率
     *
   //  * @param examID 考试ID
     * @return
     * @author 魏恩君
     * @since 2.0.0 2019/1/26
     */

    List<PaperRecordEntity> selectExameeAnswerRight(@Param("examineeId") String examineeId, @Param("examinationId") String examinationId);






}
