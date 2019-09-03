package entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.*;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * CollectionRecord实体
 * 错题和收藏表
 *
 * @author 王雪芬 
 * @version 2.0.0
 * @since 2.0.0 2019-01-26 18:24:57
 */
@ApiModel(value = "CollectionRecordEntity:错题和收藏表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_collection_record")
public class CollectionRecordEntity extends BaseEntity implements Serializable {

	/**
	 * 答题记录id
	 */
	@ApiModelProperty(value = "答题记录id",required = true)
	@Column(name = "paper_record_id")
	private String paperRecordId;

	/**
	 * 区分错台和收藏,0表示错题,1表示收藏
	 */
    @ApiModelProperty(value = "区分错台和收藏,0表示错题,1表示收藏")
	@Column(name = "status")
	private Integer status;

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
	 * 正确答案
	 */
    @ApiModelProperty(value = "正确答案")
	@Column(name = "correct_answer")
	private String correctAnswer;

	/**
	 * 正确答案HTML格式
	 */
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
	private String studentAnswerHtml;

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
	 * 版本（默认为1，以后是2，3，4....）
	 */
	@ApiModelProperty(value = "版本（默认为1，以后是2，3，4....）",required = true)
	@Column(name = "version")
	private Integer version;


}
