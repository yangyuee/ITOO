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
 * TemplatePaper实体
 * 模板或试卷表
 *
 * @author 杨月娥 
 * @version ${version}
 * @since ${version} 2019-06-21 10:30:50
 */
@ApiModel(value = "TemplatePaperEntity:模板或试卷表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_template_paper")
public class TemplatePaperEntity extends BaseEntity implements Serializable {

	/**
	 * 状态（12考试已使用、11考试使用中、10考试未使用20 固定未使用 21 固定使用中 22 随机未使用 23 随机使用中）
	 */
    @ApiModelProperty(value = "状态（12考试已使用、11考试使用中、10考试未使用20 固定未使用 21 固定使用中 22 随机未使用 23 随机使用中）")
	@Column(name = "status")
	private Integer status;

	/**
	 * 模板或试卷名字
	 */
    @ApiModelProperty(value = "模板或试卷名字")
	@Column(name = "name")
	private String name;

	/**
	 * 总分值
	 */
    @ApiModelProperty(value = "总分值")
	@Column(name = "score")
	private Double score;

	/**
	 * 获取难度系数的个数
	 */
    @ApiModelProperty(value = "获取难度系数的个数")
	@Column(name = "difficulty_ratio_number")
	private Integer difficultyRatioNumber;

	/**
	 * 期望分值
	 */
    @ApiModelProperty(value = "期望分值")
	@Column(name = "hope_score")
	private Integer hopeScore;

	/**
	 * 课程ＩＤ
	 */
    @ApiModelProperty(value = "课程ＩＤ")
	@Column(name = "course_id")
	private String courseId;

	/**
	 * 试卷还是模板(0试卷 1模板)
	 */
    @ApiModelProperty(value = "试卷还是模板(0试卷 1模板)")
	@Column(name = "is_paper_or_template")
	private Integer isPaperOrTemplate;

	/**
	 * 考试时长
	 */
    @ApiModelProperty(value = "考试时长")
	@Column(name = "examination_time_length")
	private String examinationTimeLength;

	/**
	 * 试卷版本号
	 */
    @ApiModelProperty(value = "试卷版本号")
	@Column(name = "version")
	private Integer version;

	/**
	 * 学年学期
	 */
    @ApiModelProperty(value = "学年学期")
	@Column(name = "school_year_id")
	private String schoolYearId;

	/**
	 * 模板或试卷的类别（期中考试、期末考试、随堂小练等）
	 */
    @ApiModelProperty(value = "模板或试卷的类别（期中考试、期末考试、随堂小练等）")
	@Column(name = "paper_type_id")
	private String paperTypeId;

	/**
	 * 试卷模板由谁创建（0学生，1教师）
	 */
    @ApiModelProperty(value = "试卷模板由谁创建（0学生，1教师）")
	@Column(name = "exclusive")
	private Integer exclusive;

	/**
	 * 是考试还是评教（0考试  1评教）
	 */
    @ApiModelProperty(value = "是考试还是评教（0考试  1评教）")
	@Column(name = "is_commentary_or_exam")
	private Integer isCommentaryOrExam;

	/**
	 * teacher_id
	 */
    @ApiModelProperty(value = "teacher_id")
	@Column(name = "teacher_id")
	private String teacherId;


}
