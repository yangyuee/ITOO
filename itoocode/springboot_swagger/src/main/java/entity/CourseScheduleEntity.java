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
 * CourseSchedule实体
 * 教师-机构对应表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-11-22 16:26:53
 */
@ApiModel(value = "CourseScheduleEntity:教师-机构对应表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("tt_course_schedule")
public class CourseScheduleEntity extends BaseEntity implements Serializable {

	/**
	 * 班级_id
	 */
	@ApiModelProperty(value = "班级_id",required = true)
	@Column(name = "class_id")
	private String classId;

	/**
	 * 上课班_id
	 */
	@ApiModelProperty(value = "上课班_id",required = true)
	@Column(name = "teach_class_id")
	private String teachClassId;

	/**
	 * 教室_id
	 */
	@ApiModelProperty(value = "教室_id",required = true)
	@Column(name = "room_id")
	private String roomId;

	/**
	 * 节次(00-第一节,01-第二节,02-第三节,03-第四节,04-第五节,05-第六节,06-第七节,07-第八节,08-第九节,09-第十节)
	 */
	@ApiModelProperty(value = "节次(00-第一节,01-第二节,02-第三节,03-第四节,04-第五节,05-第六节,06-第七节,07-第八节,08-第九节,09-第十节)",required = true)
	@Column(name = "cell_time_id")
	private String cellTimeId;

	/**
	 * 星期(Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday)
	 */
	@ApiModelProperty(value = "星期(Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday)",required = true)
	@Column(name = "week_id")
	private String weekId;

	/**
	 * 教师和上课班关联表id
	 */
	@ApiModelProperty(value = "教师和上课班关联表id",required = true)
	@Column(name = "teacher_teach_id")
	private String teacherTeachId;

	/**
	 * 教师id
	 */
    @ApiModelProperty(value = "教师id")
	@Column(name = "teacher_id")
	private String teacherId;

	/**
	 * teacher_name
	 */
    @ApiModelProperty(value = "teacher_name")
	@Column(name = "teacher_name")
	private String teacherName;

	/**
	 * 课程id
	 */
    @ApiModelProperty(value = "课程id")
	@Column(name = "course_id")
	private String courseId;

	/**
	 * 课程名称
	 */
    @ApiModelProperty(value = "课程名称")
	@Column(name = "course_name")
	private String courseName;

	/**
	 * 开始周
	 */
    @ApiModelProperty(value = "开始周")
	@Column(name = "start_week")
	private Integer startWeek;

	/**
	 * 结束周
	 */
    @ApiModelProperty(value = "结束周")
	@Column(name = "end_week")
	private Integer endWeek;

	/**
	 * 单双周（0/1/2 单/双/全）
	 */
    @ApiModelProperty(value = "单双周（0/1/2 单/双/全）")
	@Column(name = "odd_week_or_not")
	private Integer oddWeekOrNot;

	/**
	 * 学期_id
	 */
	@ApiModelProperty(value = "学期_id",required = true)
	@Column(name = "semester_id")
	private String semesterId;

	/**
	 * 选课人数上限
	 */
    @ApiModelProperty(value = "选课人数上限")
	@Column(name = "top_limit")
	private Integer topLimit;

	/**
	 * 选课人数下限
	 */
    @ApiModelProperty(value = "选课人数下限")
	@Column(name = "low_limit")
	private Integer lowLimit;

	/**
	 * 选课开始日期
	 */
	@JsonFormat(
        pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8"
    )
    @ApiModelProperty(value = "选课开始日期")
	@Column(name = "start_date")
	private Date startDate;

	/**
	 * 选课结束日期
	 */
	@JsonFormat(
        pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8"
    )
    @ApiModelProperty(value = "选课结束日期")
	@Column(name = "end_date")
	private Date endDate;

	/**
	 * 学分
	 */
    @ApiModelProperty(value = "学分")
	@Column(name = "credit")
	private Integer credit;


}
