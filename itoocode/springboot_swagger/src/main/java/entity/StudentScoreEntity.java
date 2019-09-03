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
 * StudentScore实体
 * 学生成绩表
 *
 * @author 任晓帅 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 19:40:28
 */
@ApiModel(value = "StudentScoreEntity:学生成绩表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("te_student_score")
public class StudentScoreEntity extends BaseEntity implements Serializable {

	/**
	 * 学号
	 */
	@ApiModelProperty(value = "学号",required = true)
	@Column(name = "student_code")
	private String studentCode;

	/**
	 * 学生Name
	 */
	@ApiModelProperty(value = "学生Name",required = true)
	@Column(name = "student_name")
	private String studentName;

	/**
	 * 考生成绩总得分
	 */
    @ApiModelProperty(value = "考生成绩总得分")
	@Column(name = "student_score")
	private String studentScore;

	/**
	 * 考生_id
	 */
	@ApiModelProperty(value = "考生_id",required = true)
	@Column(name = "examinee_id")
	private String examineeId;

	/**
	 * 试卷满分（比如马克思满分75分，会计总分100分）
	 */
    @ApiModelProperty(value = "试卷满分（比如马克思满分75分，会计总分100分）")
	@Column(name = "full_score")
	private String fullScore;

	/**
	 * 班级id
	 */
    @ApiModelProperty(value = "班级id")
	@Column(name = "class_id")
	private String classId;

	/**
	 * 班级名称
	 */
    @ApiModelProperty(value = "班级名称")
	@Column(name = "class_name")
	private String className;

	/**
	 * 专业_id
	 */
    @ApiModelProperty(value = "专业_id")
	@Column(name = "major_id")
	private String majorId;

	/**
	 * 专业名
	 */
    @ApiModelProperty(value = "专业名")
	@Column(name = "major_name")
	private String majorName;

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
	 * 考试_id
	 */
	@ApiModelProperty(value = "考试_id",required = true)
	@Column(name = "examination_id")
	private String examinationId;

	/**
	 * 考试分类id
	 */
	@ApiModelProperty(value = "考试分类id",required = true)
	@Column(name = "exam_classify_id")
	private String examClassifyId;

	/**
	 * 模板id
	 */
	@ApiModelProperty(value = "模板id",required = true)
	@Column(name = "template_id")
	private String templateId;

	/**
	 * 模板名
	 */
    @ApiModelProperty(value = "模板名")
	@Column(name = "template_name")
	private String templateName;

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
	 * 成绩等级(0未知，1优秀、2良好、3及格、4不及格）
	 */
    @ApiModelProperty(value = "成绩等级(0未知，1优秀、2良好、3及格、4不及格）")
	@Column(name = "score_grade")
	private Integer scoreGrade;

	/**
	 * 试卷小题总个数
	 */
	@ApiModelProperty(value = "试卷小题总个数")
	@Column(name = "total_question_count")
	private Integer totalQuestionCount;

	/**
	 * 学生答对题总个数
	 */
	@ApiModelProperty(value = "学生答对题总个数")
	@Column(name = "right_question_count")
	private Integer rightQuestionCount;

	/**
	 * 考试类型(期末考试:0,随堂小练:1,计算机一级:2)
	 */
	@ApiModelProperty(value="考试类型(期末考试:0,随堂小练:1,计算机一级:2)")
	@Column(name="exam_type")
	private Integer examType;

}
