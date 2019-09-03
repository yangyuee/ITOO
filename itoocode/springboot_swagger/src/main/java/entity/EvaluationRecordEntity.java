package entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * TeEvaluationRecord实体
 * 评教记录表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-12-18 18:19:48
 */
@ApiModel(value = "EvaluationRecordEntity:评教记录表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_evaluation_record")
public class EvaluationRecordEntity extends BaseEntity implements Serializable {

	/**
	 * 课程id
	 */
    @ApiModelProperty(value = "课程id")
	@Column(name = "course_id")
	private String courseId;

	/**
	 * 教师id
	 */
    @ApiModelProperty(value = "问卷id")
	@Column(name = "paper_id")
	private String paperId;

	/**
	 * 题干分数
	 */
    @ApiModelProperty(value = "题干分数")
	@Column(name = "question_score")
	private Double questionScore;

	/**
	 * 教师得分
	 */
    @ApiModelProperty(value = "教师得分")
	@Column(name = "teacher_score")
	private Double teacherScore;

	/**
	 * 题型id
	 */
    @ApiModelProperty(value = "题型code")
	@Column(name = "questionCode")
	private String questionCode;

	/**
	 * 评教问卷题干id
	 */
    @ApiModelProperty(value = "评教问卷题干id")
	@Column(name = "evaluation_main_id")
	private String evaluationMainId;

	/**
	 * 学生评教选项内容id
	 */
    @ApiModelProperty(value = "学生评教选项内容id")
	@Column(name = "evaluation_sub_id")
	private String evaluationSubId;

	/**
	 * 学生id
	 */
    @ApiModelProperty(value = "学生id")
	@Column(name = "student_id")
	private String studentId;

	/**
	 * 学年学期id
	 */
    @ApiModelProperty(value = "学年学期id")
	@Column(name = "school_year_id")
	private String schoolYearId;

	/**
	 * （0教师评教问卷记录表  1课程评教问卷记录表）
	 */
    @ApiModelProperty(value = "（0教师评教问卷记录表  1课程评教问卷记录表）")
	@Column(name = "type")
	private Integer type;

	/**
	 * 专业Id（学生所在的专业Id）
	 */
    @ApiModelProperty(value = "专业Id（学生所在的专业Id）")
	@Column(name = "profession_id")
	private String professionId;

	/**
	 * 试题顺序
	 */
    @ApiModelProperty(value = "试题顺序")
	@Column(name = "question_order")
	private Integer questionOrder;

}
