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
 * TeacherAssessResult实体
 * 教师评教成绩详情表
 *
 * @author 杨月娥 
 * @version ${version}
 * @since ${version} 2019-06-21 10:30:50
 */
@ApiModel(value = "TeacherAssessResultEntity:教师评教成绩详情表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tr_teacher_assess_result")
public class TeacherAssessResultEntity extends BaseEntity implements Serializable {

	/**
	 * 评价标准分
	 */
    @ApiModelProperty(value = "评价标准分")
	@Column(name = "assess_value")
	private Double assessValue;

	/**
	 * 评价内容
	 */
    @ApiModelProperty(value = "评价内容")
	@Column(name = "assess_content")
	private String assessContent;

	/**
	 * 评价内容id
	 */
    @ApiModelProperty(value = "评价内容id")
	@Column(name = "assess_content_id")
	private String assessContentId;

	/**
	 * 评分
	 */
    @ApiModelProperty(value = "评分")
	@Column(name = "assess_score")
	private Double assessScore;

	/**
	 * 教师课程成绩表id
	 */
    @ApiModelProperty(value = "教师课程成绩表id")
	@Column(name = "course_assess_result_id")
	private String courseAssessResultId;


}
