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
 * PaperRecord实体
 * 答题记录表
 *
 * @author 任晓帅 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 19:40:28
 */
@ApiModel(value = "PaperRecordEntity:答题记录表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("te_paper_record")
public class PaperRecordEntity extends BaseEntity implements Serializable {

	/**
	 * 考生_id
	 */
	@ApiModelProperty(value = "考生_id",required = true)
	@Column(name = "examinee_id")
	private String examineeId;




	/**
	 * 课程_id
	 */
	@ApiModelProperty(value = "课程_id",required = true)
	@Column(name = "course_id")
	private String courseId;

	/**
	 * 考试_id
	 */
	@ApiModelProperty(value = "考试_id",required = true)
	@Column(name = "examination_id")
	private String examinationId;

	/**
	 * 模板_id
	 */
	@ApiModelProperty(value = "模板_id",required = true)
	@Column(name = "template_id")
	private String templateId;

	/**
	 * 父题目id
	 */
    @ApiModelProperty(value = "父题目id")
	@Column(name = "parent_id")
	private String parentId;

	/**
	 * 题型_id
	 */
	@ApiModelProperty(value = "题型_id",required = true)
	@Column(name = "question_type_id")
	private String questionTypeId;

	/**
	 * 题干_id
	 */
	@ApiModelProperty(value = "题干_id",required = true)
	@Column(name = "question_id")
	private String questionId;

	/**
	 * 考试分类id
	 */
	@ApiModelProperty(value = "考试分类id",required = true)
	@Column(name = "exam_classify_id")
	private String examClassifyId;

	/**
	 * 标准分数
	 */
	@ApiModelProperty(value = "标准分数",required = true)
	@Column(name = "standard_score")
	private Double standardScore;

	/**
	 * 判分状态(0未判 ，1 已判 ，2 已汇总)
	 */
	@ApiModelProperty(value = "判分状态(0未判 ，1 已判 ，2 已汇总)",required = true)
	@Column(name = "mark_status")
	private Integer markStatus;

	/**
	 * 正确答案
	 */
    @ApiModelProperty(value = "正确答案")
	@Column(name = "correct_answer")
	private String correctAnswer;


    @ApiModelProperty(value = "正确答案HTML格式")
	@Column(name = "correct_answer_html")
	private String correctAnswerHtml;

	/**
	 * 学生答案
	 */
    @ApiModelProperty(value = "学生答案")
	@Column(name = "student_answer")
	private String studentAnswer;

	/**
	 * 学生答案HTML格式
	 */
    @ApiModelProperty(value = "学生答案HTML格式")
	@Column(name = "student_answer_html")
	private byte[] studentAnswerHtml;

	/**
	 * 学生答案原格式
	 */
    @ApiModelProperty(value = "学生答案原格式")
	@Column(name = "student_answer_array_str")
	private String studentAnswerArrayStr;

	/**
	 * 学生得分
	 */
    @ApiModelProperty(value = "学生得分")
	@Column(name = "score")
	private Double score;

	/**
	 * 判分老师
	 */
    @ApiModelProperty(value = "判分老师")
	@Column(name = "mark_user")
	private String markUser;

	/**
	 * 试题顺序
	 */
    @ApiModelProperty(value = "试题顺序")
	@Column(name = "question_order")
	private Integer questionOrder;

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
	 * 更新答题记录的来源（0默认值，1从在线考试跟新，2来自json导入）
	 */
    @ApiModelProperty(value = "更新答题记录的来源（0默认值，1从在线考试跟新，2来自json导入）")
	@Column(name = "origin")
	private Integer origin;

	/**
	 * 历史分id
	 */
    @ApiModelProperty(value = "历史分id")
	@Column(name = "history_id")
	private String historyId;

	/**
	 * 版本（默认为1，以后是2，3，4....）
	 */
	@ApiModelProperty(value = "版本（默认为1，以后是2，3，4....）",required = true)
	@Column(name = "version")
	private Integer version;

	/**
	 * 时间戳
	 */
	@ApiModelProperty(value = "时间戳",required = true)
	@Column(name = "timespan")
	private String timespan;
}
