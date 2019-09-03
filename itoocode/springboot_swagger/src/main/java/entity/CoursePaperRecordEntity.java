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
 * CoursePaperRecord实体
 * 课程答题记录表
 *
 * @author 贾建清 
 * @version 2.0.0
 * @since 2.0.0 2019-03-29 08:14:33
 */
@ApiModel(value = "CoursePaperRecordEntity:课程答题记录表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_course_paper_record")
public class CoursePaperRecordEntity extends BaseEntity implements Serializable {

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


}
