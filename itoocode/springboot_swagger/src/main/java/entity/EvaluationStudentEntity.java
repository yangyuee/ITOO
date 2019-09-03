package entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.*;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

/**
 * EvaluationStudent实体
 * 学生问卷表
 *
 * @author 贾建清 
 * @version 2.0.0
 * @since 2.0.0 2019-05-02 15:20:23
 */
@ApiModel(value = "EvaluationStudentEntity:学生问卷表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_evaluation_student")
public class EvaluationStudentEntity extends BaseEntity implements Serializable {

	/**
	 * 问卷id
	 */
    @ApiModelProperty(value = "问卷id")
	@Column(name = "evaluation_paper_id")
	private String evaluationPaperId;

	/**
	 * 学生id
	 */
    @ApiModelProperty(value = "学生id")
	@Column(name = "student_id")
	private String studentId;

	/**
	 * 教师_id
	 */
	@ApiModelProperty(value = "教师_id",required = true)
	@Column(name = "teacher_id")
	private String teacherId;

	/**
	 * 课程_id
	 */
	@ApiModelProperty(value = "课程_id",required = true)
	@Column(name = "course_id")
	private String courseId;

	/**
	 * 填写问卷开始时间
	 */
	@JsonFormat(
        pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8"
    )
    @ApiModelProperty(value = "填写问卷开始时间")
	@Column(name = "start_time")
	private Date startTime;

	/**
	 * 填写问卷结束时间
	 */
	@JsonFormat(
        pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8"
    )
    @ApiModelProperty(value = "填写问卷结束时间")
	@Column(name = "end_time")
	private Date endTime;

	/**
	 * 学年学期id
	 */
    @ApiModelProperty(value = "学年学期id")
	@Column(name = "school_year_id")
	private String schoolYearId;

	/**
	 * 状态（0 待评卷，1 已评卷）
	 */
    @ApiModelProperty(value = "状态（0 待评卷，1 已评卷）")
	@Column(name = "status")
	private Integer status;


}
