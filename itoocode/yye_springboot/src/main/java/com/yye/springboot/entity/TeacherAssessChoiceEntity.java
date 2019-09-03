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
 * TeacherAssessChoice实体
 * 根据课程分析的评教结果中的选择题
 *
 * @author 杨月娥 
 * @version ${version}
 * @since ${version} 2019-06-21 10:30:50
 */
@ApiModel(value = "TeacherAssessChoiceEntity:根据课程分析的评教结果中的选择题")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tr_teacher_assess_choice")
public class TeacherAssessChoiceEntity extends BaseEntity implements Serializable {

	/**
	 * 学年学期id
	 */
    @ApiModelProperty(value = "学年学期id")
	@Column(name = "semester_id")
	private String semesterId;

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
	 * 题干内容
	 */
    @ApiModelProperty(value = "题干内容")
	@Column(name = "question_content")
	private String questionContent;

	/**
	 * 题干的有效答题人数
	 */
    @ApiModelProperty(value = "题干的有效答题人数")
	@Column(name = "answer_count")
	private Integer answerCount;

	/**
	 * 选项_id
	 */
    @ApiModelProperty(value = "选项_id")
	@Column(name = "question_sub_id")
	private String questionSubId;

	/**
	 * 选项内容
	 */
    @ApiModelProperty(value = "选项内容")
	@Column(name = "options_content")
	private String optionsContent;

	/**
	 * 该选项所选人数
	 */
    @ApiModelProperty(value = "该选项所选人数")
	@Column(name = "answer_sub_count")
	private Integer answerSubCount;

	/**
	 * 该选项所选人数/题干有效答题人数
	 */
    @ApiModelProperty(value = "该选项所选人数/题干有效答题人数")
	@Column(name = "percent")
	private Integer percent;


}
