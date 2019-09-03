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
 * StudentScore实体
 * 学生成绩表
 *
 * @author 杨月娥 
 * @version ${version}
 * @since ${version} 2019-06-21 10:30:50
 */
@ApiModel(value = "StudentScoreEntity:学生成绩表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tr_student_score")
public class StudentScoreEntity extends BaseEntity implements Serializable {

	/**
	 * 上课班_id
	 */
    @ApiModelProperty(value = "上课班_id")
	@Column(name = "teachclass_id")
	private String teachclassId;

	/**
	 * 专业_id
	 */
    @ApiModelProperty(value = "专业_id")
	@Column(name = "profession_id")
	private String professionId;

	/**
	 * 班级名称
	 */
    @ApiModelProperty(value = "班级名称")
	@Column(name = "teachclass_name")
	private String teachclassName;

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
	 * 考生考试_id
	 */
    @ApiModelProperty(value = "考生考试_id")
	@Column(name = "examination_id")
	private String examinationId;

	/**
	 * 卷面成绩
	 */
    @ApiModelProperty(value = "卷面成绩")
	@Column(name = "paper_score")
	private String paperScore;

	/**
	 * 学生_id
	 */
    @ApiModelProperty(value = "学生_id")
	@Column(name = "student_id")
	private String studentId;

	/**
	 * 行政班id
	 */
    @ApiModelProperty(value = "行政班id")
	@Column(name = "class_id")
	private String classId;

	/**
	 * 行政班名称
	 */
    @ApiModelProperty(value = "行政班名称")
	@Column(name = "class_name")
	private String className;

	/**
	 * 学年学期_id
	 */
    @ApiModelProperty(value = "学年学期_id")
	@Column(name = "term_id")
	private String termId;

	/**
	 * 学年学期
	 */
    @ApiModelProperty(value = "学年学期")
	@Column(name = "term_name")
	private String termName;

	/**
	 * 学生Name
	 */
    @ApiModelProperty(value = "学生Name")
	@Column(name = "student_name")
	private String studentName;

	/**
	 * 年级(从字典表获取)
	 */
    @ApiModelProperty(value = "年级(从字典表获取)")
	@Column(name = "grade")
	private String grade;

	/**
	 * 考试类型_id（随堂小练，期中，期末 来自字典表）
	 */
    @ApiModelProperty(value = "考试类型_id（随堂小练，期中，期末 来自字典表）")
	@Column(name = "exam_type_id")
	private String examTypeId;

	/**
	 * 成绩等级(优秀、良好、及格、不及格）
	 */
    @ApiModelProperty(value = "成绩等级(优秀、良好、及格、不及格）")
	@Column(name = "score_grade")
	private String scoreGrade;

	/**
	 * 试卷或模板id
	 */
    @ApiModelProperty(value = "试卷或模板id")
	@Column(name = "template_paper_id")
	private String templatePaperId;

	/**
	 * 考试形式（机考，非机考）
	 */
    @ApiModelProperty(value = "考试形式（机考，非机考）")
	@Column(name = "exam_form")
	private String examForm;

	/**
	 * 试卷名
	 */
    @ApiModelProperty(value = "试卷名")
	@Column(name = "template_paper_name")
	private String templatePaperName;

	/**
	 * 学号
	 */
    @ApiModelProperty(value = "学号")
	@Column(name = "student_code")
	private String studentCode;

	/**
	 * 正常考、缓考、补考
	 */
    @ApiModelProperty(value = "正常考、缓考、补考")
	@Column(name = "exam_way")
	private String examWay;


}
