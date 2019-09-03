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
 * CourseAssessResult实体
 * 教师课程成绩表
 *
 * @author 杨月娥 
 * @version ${version}
 * @since ${version} 2019-06-21 10:30:50
 */
@ApiModel(value = "CourseAssessResultEntity:教师课程成绩表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tr_course_assess_result")
public class CourseAssessResultEntity extends BaseEntity implements Serializable {

	/**
	 * 平均分
	 */
    @ApiModelProperty(value = "平均分")
	@Column(name = "avg_score")
	private Double avgScore;

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
	 * 课程类别_id（理论课、实践课、理论实践课）
	 */
    @ApiModelProperty(value = "课程类别_id（理论课、实践课、理论实践课）")
	@Column(name = "course_category_id")
	private String courseCategoryId;

	/**
	 * 所属学院名称
	 */
    @ApiModelProperty(value = "所属学院名称")
	@Column(name = "teacher_department")
	private String teacherDepartment;

	/**
	 * 教师_id
	 */
    @ApiModelProperty(value = "教师_id")
	@Column(name = "teacher_id")
	private String teacherId;

	/**
	 * 教师名称
	 */
    @ApiModelProperty(value = "教师名称")
	@Column(name = "teacher_name")
	private String teacherName;

	/**
	 * 学院_id
	 */
    @ApiModelProperty(value = "学院_id")
	@Column(name = "institution_id")
	private String institutionId;

	/**
	 * 学年学期
	 */
    @ApiModelProperty(value = "学年学期")
	@Column(name = "school_year")
	private String schoolYear;

	/**
	 * 教师编号
	 */
    @ApiModelProperty(value = "教师编号")
	@Column(name = "teacher_code")
	private String teacherCode;


}
