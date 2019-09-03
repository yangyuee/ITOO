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
 * StudentScoreDetail实体
 * 题型得分详情表
 *
 * @author 任晓帅 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 19:40:28
 */
@ApiModel(value = "StudentScoreDetailEntity:题型得分详情表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("te_student_score_detail")
public class StudentScoreDetailEntity extends BaseEntity implements Serializable {

	/**
	 * 学生姓名
	 */
	@ApiModelProperty(value = "学生姓名",required = true)
	@Column(name = "student_name")
	private String studentName;

	/**
	 * 学生学号
	 */
	@ApiModelProperty(value = "学生学号",required = true)
	@Column(name = "student_code")
	private String studentCode;

	/**
	 * 考生各题型得分
	 */
    @ApiModelProperty(value = "考生各题型得分")
	@Column(name = "question_type_score")
	private String questionTypeScore;

	/**
	 * 考试id
	 */
	@ApiModelProperty(value = "考试id",required = true)
	@Column(name = "examination_id")
	private String examinationId;

	/**
	 * 考生id
	 */
	@ApiModelProperty(value = "考生id",required = true)
	@Column(name = "examinee_id")
	private String examineeId;

	/**
	 * 题型id
	 */
	@ApiModelProperty(value = "题型id",required = true)
	@Column(name = "question_type_id")
	private String questionTypeId;

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
	 * 各题型小题总个数
	 */
	@ApiModelProperty(value = "各题型小题总个数")
	@Column(name = "total_question_count")
	private Integer totalQuestionCount;

	/**
	 * 各题型学生答对题总个数
	 */
	@ApiModelProperty(value = "各题型学生答对题总个数")
	@Column(name = "right_question_count")
	private Integer rightQuestionCount;

}
