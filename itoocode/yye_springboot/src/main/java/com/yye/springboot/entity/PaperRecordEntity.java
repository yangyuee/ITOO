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
 * PaperRecord实体
 * 答题记录表
 *
 * @author 杨月娥 
 * @version ${version}
 * @since ${version} 2019-06-21 10:30:50
 */
@ApiModel(value = "PaperRecordEntity:答题记录表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_paper_record")
public class PaperRecordEntity extends BaseEntity implements Serializable {

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
	 * 标准分数
	 */
    @ApiModelProperty(value = "标准分数")
	@Column(name = "standard_score")
	private Double standardScore;

	/**
	 * 判分状态(0未判 ，1 已判 ，2 已汇总)
	 */
    @ApiModelProperty(value = "判分状态(0未判 ，1 已判 ，2 已汇总)")
	@Column(name = "mark_status")
	private String markStatus;

	/**
	 * 判分老师
	 */
    @ApiModelProperty(value = "判分老师")
	@Column(name = "mark_user")
	private String markUser;

	/**
	 * 试卷_id
	 */
    @ApiModelProperty(value = "试卷_id")
	@Column(name = "paper_id")
	private String paperId;

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
	 * 考试类型id（字典：期末考、期中考、随堂考）
	 */
    @ApiModelProperty(value = "考试类型id（字典：期末考、期中考、随堂考）")
	@Column(name = "paper_type_id")
	private String paperTypeId;

	/**
	 * 学生得分
	 */
    @ApiModelProperty(value = "学生得分")
	@Column(name = "score")
	private Double score;

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
	 * 考试_id区分是正常考试还是补考
	 */
    @ApiModelProperty(value = "考试_id区分是正常考试还是补考")
	@Column(name = "examination_id")
	private String examinationId;

	/**
	 * 试题顺序
	 */
    @ApiModelProperty(value = "试题顺序")
	@Column(name = "question_order")
	private Integer questionOrder;

	/**
	 * 学年学期id
	 */
    @ApiModelProperty(value = "学年学期id")
	@Column(name = "semester_id")
	private String semesterId;

	/**
	 * 上课班id
	 */
    @ApiModelProperty(value = "上课班id")
	@Column(name = "teachclass_id")
	private String teachclassId;

	/**
	 * 是否乱序（0 否，1 是）
	 */
    @ApiModelProperty(value = "是否乱序（0 否，1 是）")
	@Column(name = "is_out_of_order")
	private Integer isOutOfOrder;

	/**
	 * 是否别名（0 否，1 是）
	 */
    @ApiModelProperty(value = "是否别名（0 否，1 是）")
	@Column(name = "is_alias")
	private Integer isAlias;

	/**
	 * 父题目id
	 */
    @ApiModelProperty(value = "父题目id")
	@Column(name = "pid")
	private String pid;

	/**
	 * 学生答案原格式
	 */
    @ApiModelProperty(value = "学生答案原格式")
	@Column(name = "student_answer_array_str")
	private String studentAnswerArrayStr;

	/**
	 * 更新答题记录的来源（0默认值，1从在线考试跟新，2来自json导入）
	 */
    @ApiModelProperty(value = "更新答题记录的来源（0默认值，1从在线考试跟新，2来自json导入）")
	@Column(name = "origin")
	private Integer origin;


}
