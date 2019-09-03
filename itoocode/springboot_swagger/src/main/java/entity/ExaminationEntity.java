package entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

/**
 * Examination实体
 * 考试表
 *
 * @author 任晓帅 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 19:40:28
 */
@ApiModel(value = "ExaminationEntity:考试表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("te_examination")
public class ExaminationEntity extends BaseEntity implements Serializable {

	/**
	 * 课程id
	 */
	@ApiModelProperty(value = "课程id")
	@Column(name = "course_id")
	private String courseId;

	/**
	 * 考试名称
	 */
	@ApiModelProperty(value = "考试名称")
	@Column(name = "exam_name")
	private String examName;

	/**
	 * 总分
	 */
    @ApiModelProperty(value = "总分")
	@Column(name = "score")
	private String score;

	/**
	 * 考试分类id
	 */
	@ApiModelProperty(value = "考试分类id")
	@Column(name = "exam_classify_id")
	private String examClassifyId;

	/**
	 * 模板id
	 */
	@ApiModelProperty(value = "模板id")
	@Column(name = "template_id")
	private String templateId;

	/**
	 * 开始时间
	 */
	@JsonFormat(
        pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8"
    )
	@ApiModelProperty(value = "开始时间")
	@Column(name = "start_time")
	private Date startTime;

	/**
	 * 结束时间
	 */
	@JsonFormat(
        pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8"
    )
	@ApiModelProperty(value = "结束时间")
	@Column(name = "end_time")
	private Date endTime;

	/**
	 * 模板类型（1选题组卷，2抽题组卷，3随机组卷）
	 */
	@ApiModelProperty(value = "模板类型（1选题组卷，2抽题组卷，3随机组卷）")
	@Column(name = "template_type")
	private Integer templateType;

	/**
	 * 总题数
	 */
    @ApiModelProperty(value = "总题数")
	@Column(name = "topic_sum")
	private Integer topicSum;

	/**
	 * 状态 {默认（未使用）：0，正在使用 1，已使用 2}
	 */
	@ApiModelProperty(value = "状态 {默认（未使用）：0，正在使用 1，已使用 2}")
	@Column(name = "state")
	private Integer state;

	/**
	 * 期望分值
	 */
    @ApiModelProperty(value = "期望分值")
	@Column(name = "expect_value")
	private Integer expectValue;

	/**
	 * 考试时长
	 */
	@ApiModelProperty(value = "考试时长")
	@Column(name = "exam_duration")
	private Integer examDuration;

	/**
	 * 是否安排考生须知(0安排 1不安排)
	 */
    @ApiModelProperty(value = "是否安排考生须知(0安排 1不安排)")
	@Column(name = "is_student_notes")
	private Integer isStudentNotes;

	/**
	 * 考生须知id
	 */
    @ApiModelProperty(value = "考生须知id")
	@Column(name = "student_notes_id")
	private String studentNotesId;

	/**
	 * 须知时长
	 */
    @ApiModelProperty(value = "须知时长")
	@Column(name = "read_time")
	private Integer readTime;

	/**
	 * 历史id
	 */
    @ApiModelProperty(value = "历史id")
	@Column(name = "history_id")
	private String historyId;

	/**
	 * 版本（默认为1，以后是2，3，4....）
	 */
    @ApiModelProperty(value = "版本（默认为1，以后是2，3，4....）")
	@Column(name = "version")
	private Integer version;

	/**
	 * 资源表id
	 */
    @ApiModelProperty(value = "资源表id")
	@Column(name = "datum_id")
	private String datumId;

	/**
	 * 是否安排调查问卷(0不安排 1安排)
	 */
    @ApiModelProperty(value = "是否安排调查问卷(0不安排 1安排)")
	@Column(name = "is_evaluation")
	private Integer isEvaluation;

	/**
	 * 考试类型(期末考试:0,随堂小练:1)
	 */
	@ApiModelProperty(value = "考试类型(期末考试:0,随堂小练:1)")
	@Column(name = "exam_type")
	private Integer examType;

	/**
	 * 问卷id
	 */
	@ApiModelProperty(value = "问卷id")
	@Column(name = "evaluation_paper_id")
	private String evaluationPaperId;

}
