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
 * StudentScoreCollectCopy实体
 * 学生总成绩表
 *
 * @author 杨月娥 
 * @version ${version}
 * @since ${version} 2019-06-21 10:30:50
 */
@ApiModel(value = "StudentScoreCollectCopyEntity:学生总成绩表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tr_student_score_collect_copy")
public class StudentScoreCollectCopyEntity extends BaseEntity implements Serializable {

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
	 * 总分
	 */
    @ApiModelProperty(value = "总分")
	@Column(name = "total_score")
	private String totalScore;

	/**
	 * 平时成绩
	 */
    @ApiModelProperty(value = "平时成绩")
	@Column(name = "usual_score")
	private String usualScore;

	/**
	 * 期中考试
	 */
    @ApiModelProperty(value = "期中考试")
	@Column(name = "midsemester_score")
	private String midsemesterScore;

	/**
	 * 随堂考试成绩
	 */
    @ApiModelProperty(value = "随堂考试成绩")
	@Column(name = "classroom_test_score")
	private String classroomTestScore;

	/**
	 * 期末成绩
	 */
    @ApiModelProperty(value = "期末成绩")
	@Column(name = "final_score")
	private String finalScore;

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
	 * 学分
	 */
    @ApiModelProperty(value = "学分")
	@Column(name = "class_point")
	private String classPoint;

	/**
	 * 成绩等级(优秀、良好、及格、不及格）
	 */
    @ApiModelProperty(value = "成绩等级(优秀、良好、及格、不及格）")
	@Column(name = "score_grade")
	private String scoreGrade;

	/**
	 * 学号
	 */
    @ApiModelProperty(value = "学号")
	@Column(name = "student_code")
	private String studentCode;

	/**
	 * 成绩是否计算(0 未计算，1已经计算)
	 */
    @ApiModelProperty(value = "成绩是否计算(0 未计算，1已经计算)")
	@Column(name = "calcalate_state")
	private Integer calcalateState;

	/**
	 * 考试类型（正常考、缓考、补考）
	 */
    @ApiModelProperty(value = "考试类型（正常考、缓考、补考）")
	@Column(name = "exam_way")
	private String examWay;


}
