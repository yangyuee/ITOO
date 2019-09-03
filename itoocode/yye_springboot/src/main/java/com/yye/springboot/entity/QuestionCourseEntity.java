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
 * QuestionCourse实体
 * 题库-课程对应表
 *
 * @author 杨月娥 
 * @version ${version}
 * @since ${version} 2019-06-21 10:30:50
 */
@ApiModel(value = "QuestionCourseEntity:题库-课程对应表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_question_course")
public class QuestionCourseEntity extends BaseEntity implements Serializable {

	/**
	 * 题库id
	 */
    @ApiModelProperty(value = "题库id")
	@Column(name = "question_id")
	private String questionId;

	/**
	 * question_name
	 */
    @ApiModelProperty(value = "question_name")
	@Column(name = "question_name")
	private String questionName;

	/**
	 * 课程id
	 */
    @ApiModelProperty(value = "课程id")
	@Column(name = "course_id")
	private String courseId;

	/**
	 * course_name
	 */
    @ApiModelProperty(value = "course_name")
	@Column(name = "course_name")
	private String courseName;


}
