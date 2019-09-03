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
 * ChangeQuestion实体
 * 修改试题表
 *
 * @author 贾建清 
 * @version 2.0.0
 * @since 2.0.0 2018-12-30 09:44:46
 */
@ApiModel(value = "ChangeQuestionEntity:修改试题表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_change_question")
public class ChangeQuestionEntity extends BaseEntity implements Serializable {

	/**
	 * 考生id
	 */
    @ApiModelProperty(value = "考生id")
	@Column(name = "examinee_id")
	private String examineeId;

	/**
	 * 考试id
	 */
    @ApiModelProperty(value = "考试id")
	@Column(name = "examination_id")
	private String examinationId;

	/**
	 * 考场id
	 */
    @ApiModelProperty(value = "考场id")
	@Column(name = "exam_room_id")
	private String examRoomId;

	/**
	 * 考试名称
	 */
    @ApiModelProperty(value = "考试名称")
	@Column(name = "exam_name")
	private String examName;

	/**
	 * 学生id
	 */
    @ApiModelProperty(value = "学生id")
	@Column(name = "student_id")
	private String studentId;

	/**
	 * 学生姓名
	 */
    @ApiModelProperty(value = "学生姓名")
	@Column(name = "student_name")
	private String studentName;

	/**
	 * 考场名称
	 */
    @ApiModelProperty(value = "考场名称")
	@Column(name = "exam_room_name")
	private String examRoomName;

	/**
	 * 学号
	 */
    @ApiModelProperty(value = "学号")
	@Column(name = "student_code")
	private String studentCode;

	/**
	 * 旧题id
	 */
    @ApiModelProperty(value = "旧题id")
	@Column(name = "old_question_id")
	private String oldQuestionId;

	/**
	 * 旧题题干:字符串格式
	 */
    @ApiModelProperty(value = "旧题题干:字符串格式")
	@Column(name = "old_question_content")
	private String oldQuestionContent;

	/**
	 * 新题id
	 */
    @ApiModelProperty(value = "新题id")
	@Column(name = "new_question_id")
	private String newQuestionId;

	/**
	 * 新题题干:字符串格式
	 */
    @ApiModelProperty(value = "新题题干:字符串格式")
	@Column(name = "new_question_content")
	private String newQuestionContent;

	/**
	 * 旧题干:HTML格式
	 */
    @ApiModelProperty(value = "旧题干:HTML格式")
	@Column(name = "old_question_content_html")
	private String oldQuestionContentHtml;

	/**
	 * 新题干:HTML格式
	 */
    @ApiModelProperty(value = "新题干:HTML格式")
	@Column(name = "new_question_content_html")
	private String newQuestionContentHtml;

	/**
	 * 模板id
	 */
	@ApiModelProperty(value = "模板id")
	private String templateId ;

	/**
	 * 旧题的题型Id
	 */
	@ApiModelProperty(value = "题型id")
	private String questionTypeId ;

}
