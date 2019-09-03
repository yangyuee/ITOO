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
 * DisciplineInfo实体
 * DisciplineInfo
 *
 * @author 杨月娥 
 * @version ${version}
 * @since ${version} 2019-06-21 10:30:50
 */
@ApiModel(value = "DisciplineInfoEntity:DisciplineInfo")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "t_discipline_info")
public class DisciplineInfoEntity extends BaseEntity implements Serializable {

	/**
	 * 班级名称
	 */
    @ApiModelProperty(value = "班级名称")
	@Column(name = "class_name")
	private String className;

	/**
	 * 课程_id
	 */
    @ApiModelProperty(value = "课程_id")
	@Column(name = "course_id")
	private String courseId;

	/**
	 * 违纪原因
	 */
    @ApiModelProperty(value = "违纪原因")
	@Column(name = "reason")
	private String reason;

	/**
	 * 学号
	 */
    @ApiModelProperty(value = "学号")
	@Column(name = "student_code")
	private String studentCode;

	/**
	 * 学生姓名
	 */
    @ApiModelProperty(value = "学生姓名")
	@Column(name = "student_name")
	private String studentName;

	/**
	 * 监考教师_id
	 */
    @ApiModelProperty(value = "监考教师_id")
	@Column(name = "teacher_id")
	private String teacherId;

	/**
	 * 与考试考场关联_id
	 */
    @ApiModelProperty(value = "与考试考场关联_id")
	@Column(name = "examination_room_arrangement_id")
	private String examinationRoomArrangementId;


}
