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
 * AssessmentAdvice实体
 * 学生评教建议表
 *
 * @author 杨月娥 
 * @version ${version}
 * @since ${version} 2019-06-21 10:30:50
 */
@ApiModel(value = "AssessmentAdviceEntity:学生评教建议表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tr_assessment_advice")
public class AssessmentAdviceEntity extends BaseEntity implements Serializable {

	/**
	 * 评教建议
	 */
    @ApiModelProperty(value = "评教建议")
	@Column(name = "advice")
	private String advice;

	/**
	 * 课程_id
	 */
    @ApiModelProperty(value = "课程_id")
	@Column(name = "course_id")
	private String courseId;

	/**
	 * 课程名称
	 */
    @ApiModelProperty(value = "课程名称")
	@Column(name = "course_name")
	private String courseName;

	/**
	 * 学生ID
	 */
    @ApiModelProperty(value = "学生ID")
	@Column(name = "student_id")
	private String studentId;

	/**
	 * 教师Id
	 */
    @ApiModelProperty(value = "教师Id")
	@Column(name = "teacher_id")
	private String teacherId;

	/**
	 * 教师名称
	 */
    @ApiModelProperty(value = "教师名称")
	@Column(name = "teacher_name")
	private String teacherName;

	/**
	 * 学院_id（开课学院的学院Id）
	 */
    @ApiModelProperty(value = "学院_id（开课学院的学院Id）")
	@Column(name = "institution_id")
	private String institutionId;

	/**
	 * 学年学期
	 */
    @ApiModelProperty(value = "学年学期")
	@Column(name = "school_year")
	private String schoolYear;

	/**
	 * 学号
	 */
    @ApiModelProperty(value = "学号")
	@Column(name = "student_code")
	private String studentCode;

	/**
	 * 题干_id
	 */
    @ApiModelProperty(value = "题干_id")
	@Column(name = "question_main_id")
	private String questionMainId;

	/**
	 * 专业Id（学生所在的专业Id）
	 */
    @ApiModelProperty(value = "专业Id（学生所在的专业Id）")
	@Column(name = "profession_id")
	private String professionId;

	/**
	 * 类别（0教师评教问卷记录表  1课程评教问卷记录表）
	 */
    @ApiModelProperty(value = "类别（0教师评教问卷记录表  1课程评教问卷记录表）")
	@Column(name = "type")
	private Integer type;

	/**
	 * 试题顺序
	 */
    @ApiModelProperty(value = "试题顺序")
	@Column(name = "question_order")
	private Integer questionOrder;


}
