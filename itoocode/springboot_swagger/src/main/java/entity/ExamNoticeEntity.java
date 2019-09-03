package entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.*;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

/**
 * ExamNotice实体
 * 考试通知表
 *
 * @author 贾建清 
 * @version 2.0.0
 * @since 2.0.0 2018-12-26 20:56:50
 */
@ApiModel(value = "ExamNoticeEntity:考试通知表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_exam_notice")
public class ExamNoticeEntity extends BaseEntity implements Serializable {

	/**
	 * 学院id
	 */
    @ApiModelProperty(value = "学院id")
	@Column(name = "academy_id")
	private String academyId;

	/**
	 * 学院名称
	 */
    @ApiModelProperty(value = "学院名称")
	@Column(name = "academy_name")
	private String academyName;

	/**
	 * 专业id
	 */
    @ApiModelProperty(value = "专业id")
	@Column(name = "profession_id")
	private String professionId;

	/**
	 * 专业名称
	 */
    @ApiModelProperty(value = "专业名称")
	@Column(name = "profession")
	private String profession;

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
	 * 课程id
	 */
	@ApiModelProperty(value = "课程id")
	@Column(name = "course_id")
	private String courseId;

	/**
	 * 班级名称
	 */
	@ApiModelProperty(value = "课程名称")
	@Column(name = "course")
	private String course;


	/**
	 * 考试开始时间
	 */
	@JsonFormat(
        pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8"
    )
    @ApiModelProperty(value = "考试开始时间")
	@Column(name = "exam_start_time")
	private Date examStartTime;

	/**
	 * 考试时长
	 */
    @ApiModelProperty(value = "考试时长")
	@Column(name = "exam_length")
	private Integer examLength;

	/**
	 * 学生id
	 */
    @ApiModelProperty(value = "学生id")
	@Column(name = "student_id")
	private String studentId;

	/**
	 * 学号
	 */
    @ApiModelProperty(value = "学号")
	@Column(name = "student_no")
	private String studentNo;

	/**
	 * 姓名
	 */
    @ApiModelProperty(value = "姓名")
	@Column(name = "student_name")
	private String studentName;

	/**
	 * 考试地点
	 */
    @ApiModelProperty(value = "考试地点")
	@Column(name = "place_id")
	private String placeId;

	/**
	 * 地点名称
	 */
    @ApiModelProperty(value = "地点名称")
	@Column(name = "place_name")
	private String placeName;

	/**
	 * 发送状态
	 */
    @ApiModelProperty(value = "发送状态")
	@Column(name = "state")
	private Integer state;

	/**
	 * 发送时间
	 */
	@JsonFormat(
        pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8"
    )
    @ApiModelProperty(value = "发送时间")
	@Column(name = "send_time")
	private Date sendTime;


}
