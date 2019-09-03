package com.yye.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.*;
import java.io.Serializable;
import javax.persistence.Column;

/**
 * StudentScoreDetail实体
 * 题型得分详情表
 *
 * @author 杨月娥 
 * @version ${version}
 * @since ${version} 2019-06-21 10:30:50
 */
@ApiModel(value = "StudentScoreDetailEntity:题型得分详情表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tr_student_score_detail")
public class StudentScoreDetailEntity extends BaseEntity implements Serializable {

	/**
	 * 试卷id
	 */
    @ApiModelProperty(value = "试卷id")
	@Column(name = "papaer_id")
	private String papaerId;

	/**
	 * 学生试卷总得分
	 */
    @ApiModelProperty(value = "学生试卷总得分")
	@Column(name = "student_score")
	private String studentScore;

	/**
	 * 学生学号
	 */
    @ApiModelProperty(value = "学生学号")
	@Column(name = "student_code")
	private String studentCode;

	/**
	 * 学生id
	 */
    @ApiModelProperty(value = "学生id")
	@Column(name = "student_id")
	private String studentId;

	/**
	 * 学生姓名
	 */
    @ApiModelProperty(value = "学生姓名")
	@Column(name = "student_name")
	private String studentName;

	/**
	 * 各个题型得分汇总（json形式保存）
	 */
    @ApiModelProperty(value = "各个题型得分汇总（json形式保存）")
	@Column(name = "question_score_collect")
	private String questionScoreCollect;

	/**
	 * 备注
	 */
    @ApiModelProperty(value = "备注")
	@Column(name = "reamrk")
	private String reamrk;

	/**
	 * 正常考、缓考、补考
	 */
    @ApiModelProperty(value = "正常考、缓考、补考")
	@Column(name = "exam_way")
	private String examWay;

	/**
	 * 考试id
	 */
    @ApiModelProperty(value = "考试id")
	@Column(name = "examination_id")
	private String examinationId;


}
