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
 * WrongRecord实体
 * 错题记录表
 *
 * @author 杨月娥 
 * @version ${version}
 * @since ${version} 2019-06-21 10:30:50
 */
@ApiModel(value = "WrongRecordEntity:错题记录表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_wrong_record")
public class WrongRecordEntity extends BaseEntity implements Serializable {

	/**
	 * 正确答案
	 */
    @ApiModelProperty(value = "正确答案")
	@Column(name = "correct_answer")
	private String correctAnswer;

	/**
	 * 课程_id
	 */
    @ApiModelProperty(value = "课程_id")
	@Column(name = "course_id")
	private String courseId;

	/**
	 * 题型_id
	 */
    @ApiModelProperty(value = "题型_id")
	@Column(name = "question_type_id")
	private String questionTypeId;

	/**
	 * 题干_id
	 */
    @ApiModelProperty(value = "题干_id")
	@Column(name = "question_main_id")
	private String questionMainId;

	/**
	 * 学生答案
	 */
    @ApiModelProperty(value = "学生答案")
	@Column(name = "student_answer")
	private String studentAnswer;

	/**
	 * 学生_id
	 */
    @ApiModelProperty(value = "学生_id")
	@Column(name = "student_id")
	private String studentId;

	/**
	 * 学年学期id
	 */
    @ApiModelProperty(value = "学年学期id")
	@Column(name = "semester_id")
	private String semesterId;


}
