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
 * Examinee实体
 * 考生表
 *
 * @author 任晓帅 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 19:40:28
 */
@ApiModel(value = "ExamineeEntity:考生表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("te_examinee")
public class ExamineeEntity extends BaseEntity implements Serializable {

	/**
	 * 学生姓名
	 */
    @ApiModelProperty(value = "学生姓名")
	@Column(name = "student_name")
	private String studentName;

	/**
	 * 学生id
	 */
    @ApiModelProperty(value = "学生id")
	@Column(name = "student_id")
	private String studentId;

	/**
	 * 学生学号
	 */
    @ApiModelProperty(value = "学生学号")
	@Column(name = "student_code")
	private String studentCode;

	/**
	 * 班级名
	 */
    @ApiModelProperty(value = "班级名")
	@Column(name = "class_name")
	private String className;

	/**
	 * 班级id
	 */
    @ApiModelProperty(value = "班级id")
	@Column(name = "class_id")
	private String classId;



	/**
	 * 专业名
	 */
	@ApiModelProperty(value = "专业名")
	@Column(name = "major_name")
	private String majorName;



	/**
	 * 学院名
	 */
    @ApiModelProperty(value = "学院名")
	@Column(name = "college_name")
	private String collegeName;

	/**
	 * 学院id
	 */
    @ApiModelProperty(value = "学院id")
	@Column(name = "college_id")
	private String collegeId;

	/**
	 * 考试id
	 */
    @ApiModelProperty(value = "考试id")
	@Column(name = "examination_id")
	private String examinationId;

	/**
	 * 与考试考场关联_id
	 */
    @ApiModelProperty(value = "与考试考场关联_id")
	@Column(name = "exam_room_id")
	private String examRoomId;

	/**
	 * 学生考试状态（0未登录，1已抽，2正在考试，3交卷）
	 */
    @ApiModelProperty(value = "学生考试状态（0未登录，1已抽，2正在考试，3交卷）")
	@Column(name = "student_exam_state")
	private Integer studentExamState;

	/**
	 * 学生IP
	 */
    @ApiModelProperty(value = "学生IP")
	@Column(name = "student_ip")
	private String studentIp;

	/**
	 * 交卷日期时间
	 */
	@JsonFormat(
        pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8"
    )
    @ApiModelProperty(value = "交卷日期时间")
	@Column(name = "submit_time")
	private Date submitTime;

	/**
	 * 登录时间
	 */
	@JsonFormat(
        pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8"
    )
    @ApiModelProperty(value = "登录时间")
	@Column(name = "login_time")
	private Date loginTime;

	/**
	 * 缺考信息
	 */
    @ApiModelProperty(value = "缺考信息")
	@Column(name = "absent_info")
	private String absentInfo;

	/**
	 * 获取抽题时间
	 */
	@JsonFormat(
        pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8"
    )
    @ApiModelProperty(value = "获取抽题时间")
	@Column(name = "get_question_time")
	private Date getQuestionTime;

	/**
	 * 理论交卷日期时间
	 */
	@JsonFormat(
        pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8"
    )
    @ApiModelProperty(value = "理论交卷日期时间")
	@Column(name = "should_submit_time")
	private Date shouldSubmitTime;

	/**
	 * 考试时长(分钟)
	 */
    @ApiModelProperty(value = "考试时长(分钟)")
	@Column(name = "exam_duration")
	private Integer examDuration;

	/**
	 * 考试类型(期末考试:0,随堂小练:1)
	 */
	@ApiModelProperty(value = "考试类型(期末考试:0,随堂小练:1)")
	@Column(name = "exam_type")
	private Integer examType;

	/**
	 * 头像链接地址
	 */
    @ApiModelProperty(value = "头像链接地址")
	@Column(name = "majorId")
	private String majorId;

	/**
	 * 头像链接地址
	 */
	@ApiModelProperty(value = "头像链接地址")
	@Column(name = "picture_address")
	private String pictureAddress;
}
